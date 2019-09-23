import java.lang.*;

class Parse{

	public static void main(String[] args){
		//String s = "300"; // Doesn't work
		String s = "127"; //Works. Do you know why?
		int ten = 10;
		byte b = Byte.parseByte(s, ten);
		System.out.println(String.valueOf(b));

		int hex = 16;
		String sHex = "10"; // should be 16 in decimal.
		int i = Integer.parseInt(sHex, hex);
		System.out.println(sHex + " in hex, converted to decimal = " + String.valueOf(i));
	}
}
