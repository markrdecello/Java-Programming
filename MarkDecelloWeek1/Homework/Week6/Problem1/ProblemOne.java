import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;

public class ProblemOne{

	public static void printBytes(byte[] byteArr){
		for (byte b: byteArr){
			System.out.print(String.format("%02X ", b));
		}
		System.out.println("");
	}

	public static void main(String[] args){
		File fileName = new File("utf8.txt");
		String myLine = "";

		try{
			BufferedReader br = new BufferedReader(
					new InputStreamReader(new FileInputStream(fileName), StandardCharsets.UTF_8));
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
				myLine = line;
			}
			br.close();
		}catch(IOException e){
			e.printStackTrace();
		}

		try{
			System.out.print("Decimal: ");
			byte[] arr = myLine.getBytes("UTF-8");
			for (byte x: arr){
				System.out.print(x+" ");
			}
			System.out.println("");
			String s = new String(arr, "UTF-8");
			byte[] s2 = s.getBytes("UTF-16");
			//byte[] s2 = s.getBytes(Charset.forName("UTF-16"));
			System.out.print("Hex:     ");
			printBytes(s2);

			byte[] utf16bytes = (new String(arr, "UTF-8")).getBytes("UTF-16BE");

			String string = new String(utf16bytes);
			System.out.println(string);

			FileWriter writer = new FileWriter("utf16.txt", true);
			//for (byte b: s2){
			writer.write(string);
			//}
			writer.close();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
