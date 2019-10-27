import java.io.*;

public class Exam{
	
	public static void main(String[] args){
		final String InputFilename = args[0];
		final String OutputFilename = args[1];
		final String Message = args[2];
		byte[] MessageAsBytes = null;
		int[][] intArray = null;
		//int[][] intArray2 = null;

		try{
			MessageAsBytes = Message.getBytes("UTF-8");
			/*for(byte b : MessageAsBytes){
				System.out.print(String.format("%02X ", b));
			}*/
			intArray = MessageHider.ReadPPMIntoIntArray(InputFilename);
			//intArray2 = MessageHider.ReadPPMIntoIntArray(InputFilename);
			for(byte b : MessageAsBytes){
				System.out.print(String.format("%02X ", b));
			}
			System.out.println();
			MessageHider.hideMessage(MessageAsBytes, intArray);
			//MessageHider.extractMessage(intArray2, MessageAsBytes.length);
			MessageHider.extractMessage(intArray, MessageAsBytes.length);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}

		try{
			//MessageHider.extractMessage(intArray, MessageAsBytes.length);
			MessageHider.WritePPMFile(intArray, OutputFilename);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
