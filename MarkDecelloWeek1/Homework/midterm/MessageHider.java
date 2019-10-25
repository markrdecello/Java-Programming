import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.io.File;
import javax.imageio.ImageIO;

public class MessageHider{

	public static int[][] image2DArr(String fileName) throws NoAlphaChannelException, IOException{
		BufferedImage image = ImageIO.read(MessageHider.class.getResource(fileName));
		final byte[] pixels = ((DataBufferByte) image.getRaster().getDataBuffer()).getData();
		final int width = image.getWidth();
		final int height = image.getHeight();
		int[][] result = new int[height][width];
		final int pixelLength = 4;
		final boolean hasAlphaChannel = image.getAlphaRaster() != null;
		if(!hasAlphaChannel){
			throw new NoAlphaChannelException("This simple code can only handle pngs with an alpha channel. Yours has none.");
		}

		for(int pixel = 0, row = 0, col = 0; pixel + 3 < pixels.length; pixel += pixelLength){
			int argb = 0;
			int blue = ((int) pixels[pixel + 1] & 0xff);
			int green = (((int) pixels[pixel + 2] & 0xff) << 8);
			int red = (((int) pixels[pixel + 3] & 0xff) << 16);
			int alpha = (((int) pixels[pixel] & 0xff) << 24);
			argb += blue;
			argb += green;
			argb += red;
			argb += alpha;
			result[row][col] = argb;
			col++;
			if(col == width){
				col = 0;
				row ++;
			}
		}
		return result;
	}

	/*public static void hideMessage(String inFile, String outFile, byte[] messageAsBytes){
		int bitIdx = 0;
		int bitsPrinted = 0;
		for(int row = 0; row < imageArray.length; row++){
			for(int col = 0; col < imageArray[row].length; ++col){
				imageArray[row][col] &= 0xFFFFFFFE; //set the last blue bit to zero.a
				int bitToHide = getBit(bitIdx, toHide);
				if(bitToHide != 0x02){
					System.out.print(bitToHide);
					bitsPrinted++;
					if(bitsPrinted == 8){
						System.out.print("");
						bitsPrinted = 0;
					}
				}
				imageArray[row][column] |= bitToHide;
				bitIdx++;
			}
		}
		System.out.println("");
	}*/

	/*private static int getBit(int bitIdx, byte[] toHide){
		int byteIdx = bitIdx / 8;
		if(byteIdx >= toHide.length){
			return 0x02;
		}
		int localBitIdx = bitIdx % 8;
		byte current = toHide[byteIdx];
		current >>>= (7 - localBitIdx);
		return 0x00000001 & current;
	}*/

	/*public static void extractMessage(String outFile){
		System.out.println("Last bits from each pixel are:");
		int numBits = 8 * numBytesInMessage;
		for(int row = 0; row < imageArray.length; row++){
			for(int col = 0; col < imageArray[row].length; col++){
				if(row * imageArr[row].length + col == numBits){
					System.out.println("Did these bits agree with the bits we set when we hid a message?");
					return;
				}else{
					System.out.println(String.format("0x%08X", (0x00000001 & imageArray[row])));
				}
			}
		}
	}*/
}

class NoAlphaChannelException extends Exception{
	NoAlphaChannelException(String s){
		super(s);
	}
}
