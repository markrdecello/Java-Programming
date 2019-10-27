import java.io.*;
import java.nio.charset.Charset;
import java.util.Arrays;

public class ChangeBackground{

	private final static int CHANNELS_PER_PIXEL = 3;
	

	/*
	 * Convert filename(PPM file) into a 2D int array
	 *
	 * @param fileName - the input string
	 * @return a 2d int array, if any errors occcur, return will be error message
	 *
	 * This method reads the filename/parameter given and converts it into a 2D int array
	 */
	public static int[][] ReadPPMIntoIntArray(String fileName) throws FileNotFoundException, IOException{
	    final int[][] ErrorRetVal = null;

		File f = new File(fileName);	
		byte[] fileArr = new byte[(int) f.length()];
		InputStream is = new BufferedInputStream(new FileInputStream(f));
		for( int i = 0, read_value = 0; ( read_value = is.read() ) != -1; i++ ){
			fileArr[i] = (byte)read_value;
		}
		String fileString = new String(fileArr, Charset.forName("UTF-8"));
		String[] stringArr = fileString.split("\\R+"); // split on new lines.
		
		String imageTypeString = stringArr[0];
		if( !imageTypeString.equals( new String("P3") ) ){
			System.err.println("First line in PPM invalid");
			return ErrorRetVal;
		}	
		
		String dimensionString = stringArr[1];
		String[] dimensionStrings = dimensionString.split("\\s+");
		if( dimensionStrings.length != 2 ){
			System.err.println("Invalid dimension specified.");
			return ErrorRetVal;
		}
		final int Width  = Integer.parseInt(dimensionStrings[0]);
		final int Height = Integer.parseInt(dimensionStrings[1]);
		int[][] ret = new int[Height][Width*CHANNELS_PER_PIXEL];
		System.out.println(String.format("Read an %dx%d image", Width, Height));			
		if(	stringArr.length != Height + 3 ){
			System.err.println("Not enough rows in datafile.");
			return ErrorRetVal;
		}
		String maxValueString  = stringArr[2]; // I think the 255 line means maxValue, but have still failed to verify.
		final int MaxValue = Integer.parseInt(maxValueString);
		
		for( int lineIndex = 3; lineIndex < stringArr.length; lineIndex++){
			String[] numbers = stringArr[lineIndex].split("\\s+");
			if( numbers.length != Width * CHANNELS_PER_PIXEL ){
				System.err.println(String.format("Found invalid number of pixels in row %d of ppm image", lineIndex));
				return ErrorRetVal;
			}
			else{
				for( int numberIdx = 0; numberIdx < numbers.length; ++numberIdx){
					ret[lineIndex - 3][numberIdx] = Integer.parseInt(numbers[numberIdx]);
				}	
			}
		}
		System.out.println(ret);	
		return ret;
	}

	/*
	 * Changes any white pixels to red
	 *
	 * @param inputArray - the 2D array list
	 * no return value since it's a void
	 *
	 * This method reads all the pixels and if the pixel is white, then change white to red
	 */
	public static void ChangeWhiteToRed(int[][] inputArray){
		System.out.println(inputArray.length);
		System.out.println(inputArray[0].length);
		for( int row = 0; row < inputArray.length; row++ ){
			for( int col = 0; col < inputArray[row].length; col += 3 ){
				//Here comes the background changing logic!
				if(PixelIsWhite(inputArray[row][col], inputArray[row][col+1], inputArray[row][col+2])){
					inputArray[row][col] = 0;
					inputArray[row][col+1] = 0;
					inputArray[row][col+2] = 255;
				}
			}
		}
	}
	
	/*
	 * Tells if the pixel is white, for 2nd part of problem, it will tell if pixel is green
	 *
	 * @param red, green, blue - the input for the rgb colors in integer
	 * return a bool saying true if pixel is white, else return false
	 *
	 * This method will identify if any pixels are white
	 */
	public static boolean PixelIsWhite(int red, int green, int blue){
		final int THRESHOLD = 100;
		if( (red < THRESHOLD) && (green > THRESHOLD) && (blue < THRESHOLD) ){
			// then the pixel is white ( by our standards ).
			// btw how do you say 'threshold' in spanish and portuguese?
			// can you  improve this method?
			return true;	
		}
		return false;
	}

	/*
	 * Creates a new file(PPM file)
	 *
	 * @param Pixels, fileName - 2D input array and input string
	 * Does not return anything since it's bool
	 *
	 * This method creates a new filename according to the user's input and writes the new 2D int array with the color changes 
	 */
	public static void WritePPMFile(int[][] Pixels, String fileName) throws IOException, FileNotFoundException{
		OutputStreamWriter osw = new OutputStreamWriter(
				new FileOutputStream(
					new File(fileName),
					true
				),
				Charset.forName("UTF-8")
			);
		osw.write("P3\n");
		osw.write(String.format("%d %d\n", Pixels[0].length/3, Pixels.length));
		osw.write("255\n");
		System.out.println(Pixels.length);
		System.out.println(Pixels[0].length);
		for( int row = 0; row < Pixels.length; ++row ){
			System.out.println(row + " " + Pixels[0].length);
			int col = 0;
			for( col = 0; col < Pixels[0].length - 1; ++col ){
				osw.write(String.valueOf(Pixels[row][col]) + " ");
			}
			osw.write(String.valueOf(Pixels[row][col]) + "\n");
		}
		osw.close();		
	}
}
