import java.io.*;

public class Exam{

	public static byte[] StringToBytes(String Message){
		byte[] b = null;
		try{
			byte[] arr = Message.getBytes("UTF-16");
			for(byte x: arr){
				System.out.print(String.format("%02X" + x));
			}
			System.out.println("");
			b = arr;
		}catch(IOException e){
			e.printStackTrace();
		}
		return b;
	}

	public static void main(String[] args){
		final String InputFilename = args[0];
		//final String OutputFilename = args[1];
		final String Message = args[1];
		try{
			int[][] imageArr = MessageHider.image2DArr(InputFilename);
			System.out.println("Attempting to hide message:\n" + Message);
			System.out.println("Message in bytes: ");
			final byte[] MessageAsBytes = StringToBytes(Message); //Make sure to get the bytes in the proper text encoding
			if(MessageAsBytes.length != 2){
				System.err.println(String.format("You cannot hide the string %s with this code as it doesn't satisfy the string length req't", Message));
			}
			//MessageHider.hideMessage(inputFilename, OutputFilename, MessageAsBytes);
			//final String extractedMessage = Message.extractMessage(OutputFilename);
			//System.out.println(String.format("Found message '%s' in %s", extractedMessage, outputFilename));
	
		}catch(NoAlphaChannelException ex){
			System.err.println("File doesn't have an alpha channel: " + InputFilename);
		}catch(IOException ex){
			System.err.println("Error opening file " + InputFilename);
		}
	}
}
