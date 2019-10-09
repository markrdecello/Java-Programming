public class UnsignedShift{
	public static void main(String[] args){
		byte b = (byte) -1;
		byte unsignedShift = (byte)(b >>> 1);
		System.out.println(String.valueOf(unsignedShift));
	}
}
