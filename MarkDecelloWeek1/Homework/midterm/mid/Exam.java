import java.io.*;

public class Exam{
	
	public static void main(String[] args){
		final String InputFilename = args[0];
		final String OutputFilename = args[1];
		final String Message = args[2];
		byte[] MessageAsBytes = null;
		int[][] intArray = null;

		try{
			MessageAsBytes = Message.getBytes("UTF-8");
			intArray = MessageHider.ReadPPMIntoIntArray(InputFilename);
			for(byte b : MessageAsBytes){
				System.out.print(String.format("%02X ", b));
			}
			System.out.println();
			MessageHider.hideMessage(MessageAsBytes, intArray);
			MessageHider.extractMessage(intArray, MessageAsBytes.length);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		try{
			MessageHider.WritePPMFile(intArray, OutputFilename);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
