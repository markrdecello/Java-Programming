import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import javax.imageio.ImageIO;

public class MessageHider{

	private final static int CHANNELS_PER_PIXEL = 3;

	/*
	 * This method reads the ppm file to create a 2d int array
	 *Uses the filename passed by Exam.java file/class
	 *Reads the .ppm file
	 *ignores the first three lines
	 *Then converts into a 2D int array and returns it
	 */
	public static int[][] ReadPPMIntoIntArray(String fileName) throws FileNotFoundException, IOException{
		final int[][] ErrorReturnValue = null;

		File f = new File(fileName);
		byte[] fileArray = new byte[(int) f.length()];
		InputStream inputStr = new BufferedInputStream(new FileInputStream(f));
		for(int i = 0, read_value = 0; (read_value = inputStr.read()) != -1; i++){
			fileArray[i] = (byte)read_value;
		}

		String fileString = new String(fileArray, Charset.forName("UTF-8"));
		String[] stringArray = fileString.split("\\R+"); // split on new lines

		String imageTypeString = stringArray[0];
		if(!imageTypeString.equals(new String("P3"))){
			System.err.println("First line in PPM is invalid");
			return ErrorReturnValue;
		}

		String dimensionString = stringArray[1]; // equal to 4 4
		String[] dimensionStrings = dimensionString.split("\\s+");//split white space [0]=4 [1]=4
		if(dimensionStrings.length != 2){
			System.err.println("Invalid dimension specified.");
			return ErrorReturnValue;
		}

		final int Width = Integer.parseInt(dimensionStrings[0]); //Width = 4
		final int Height = Integer.parseInt(dimensionStrings[1]); //Height = 4
		int[][] ret = new int[Height][Width*CHANNELS_PER_PIXEL];//create 2d int array [4][12]
		System.out.println(String.format("Read a %dx%d image", Width, Height));
		if(stringArray.length != Height + 3){
			System.err.println("Not enough rows in datafile.");
			return ErrorReturnValue;
		}

		String maxValueString = stringArray[2];// equal to 255
		final int MaxValue = Integer.parseInt(maxValueString);

		//start at stringArray[3]
		for(int lineIndex = 3; lineIndex < stringArray.length; lineIndex++){
			String[] numbers = stringArray[lineIndex].split("\\s+"); //Splits whitespace
			if(numbers.length != Width * CHANNELS_PER_PIXEL){// has to equal 12 or else error
				System.err.println(String.format("Found invalid number of pixels in row %d of PPM image", lineIndex));
				return ErrorReturnValue;
			}else{
				for(int numberIndex = 0; numberIndex < numbers.length; ++numberIndex){
					//puts the rgb values from the ppm file into 2d int array
					ret[lineIndex - 3][numberIndex] = Integer.parseInt(numbers[numberIndex]);
				}
			}
		}
		return ret;
	}

	/*
	 *This method hides the message that the user provided when running the program
	 *Takes 2 parameters; a byte array and a 2d int array
	 *The byte arrray is the message that the user wants to hide
	 *The method Reads the 2d int Array and changes the value of only the red pixel channel
	 *The 2d int array will now have a hidden message only on the red pixels
	 */
	public static void hideMessage(byte[] toHide, int[][] imageArray){
		int bitIndex = 0;
		int bitsPrinted = 0;
		for(int row = 0; row <imageArray.length; row++){
			for(int col = 0; col < imageArray[row].length; ++col){
				int red = col % 3; // since the red pixel is located when it's divisible by 3
				if(red == 0){  
					imageArray[row][col] &=0xFE; // set the last red bit to zero
					int bitToHide = getBit(bitIndex, toHide); //use getBit method
					if(bitToHide != 0x02){
						System.out.print(bitToHide);
						bitsPrinted++;
						if(bitsPrinted == 8){
							System.out.print(" ");
							bitsPrinted = 0;
						}
					}
					imageArray[row][col] |= bitToHide;
					bitIndex++;
				}
			}
		}
		System.out.println("");
	}

	/*
	 *This method will get the bits of the message that is hidden
	 *Once bitIndex is 8 it will create a space(using hideMessage method) and return the next 8 bits 
	 */
	private static int getBit(int bitIndex, byte[] toHide){
		int byteIndex = bitIndex / 8;
		if(byteIndex >= toHide.length){
			return 0x02;
		}
		int localBitIndex = bitIndex % 8;
		byte current = toHide[byteIndex];
		current >>>= (7 - localBitIndex);
		return 0x00000001 & current;
	}

	public static void extractMessage(int[][] imageArray, int numBytesInMessage){
		System.out.println("Last bits from each pixel of the imageArray are: ");
		int numBits = 8 * numBytesInMessage;
		for(int row = 0; row < imageArray.length; row++){
			for(int col = 0; col < imageArray.length; col++){
				if(row * imageArray.length + col + 1  == numBits){
					System.out.println(String.format("0x%08X", (0x00000001 & imageArray[row][col*3])));
					System.out.println("Did these bits agree with the bits we set when we hid the message?");
					return;
				}else{
					System.out.println(String.format("0x%08X", (0x00000001 & imageArray[row][col*3])));
				}
			}
		}
	}

	/*
	 *This method takes the new values and writes it into a new file
	 *Takes 2 parameters; Pixells and filename
	 *Writes the values of the 2d int array to the output filename given by user
	 */
	public static void WritePPMFile(int[][] Pixels, String fileName) throws IOException, FileNotFoundException{
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(new File(fileName), true), Charset.forName("UTF-8"));

		osw.write("P3\n");
		osw.write(String.format("%d %d\n", Pixels[0].length/3, Pixels.length));
		osw.write("255\n");
		System.out.println(Pixels.length);// equal to 4
		System.out.println(Pixels[0].length);// equal to 12
		
		for(int row = 0; row < Pixels.length; ++row){
			System.out.println(row + " " + Pixels[0].length);
			int col = 0;
			for(col = 0; col < Pixels[0].length - 1; ++col){
				osw.write(String.valueOf(Pixels[row][col]) + " ");
			}
			osw.write(String.valueOf(Pixels[row][col] + "\n"));
		}
		osw.close();
	}
}
