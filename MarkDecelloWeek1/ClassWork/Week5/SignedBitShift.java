public class SignedBitShift{
	public static void main(String[] args){
		byte b = (byte) 0x01;
		System.out.println(String.valueOf(b));

		byte b1 = (byte)(b >> 1);
		System.out.println(String.valueOf(b1));

		byte b2 = (byte)(b << 1);
		System.out.println(String.valueOf(b2));

		byte negative = (byte)-1;
		byte shifted = (byte)(negative >> 1);
		System.out.println(String.valueOf(shifted));
		
		byte shifted1 = (byte)(b << 7);

		System.out.println(String.valueOf(shifted1));
	}
}
