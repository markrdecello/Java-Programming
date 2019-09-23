public class IntegerExample{
	public static void main(String[] args){
		//Integer = object
		//Everytime an object, do new
		Integer i = new Integer(1);
		byte b = i.byteValue();
		System.out.println(String.valueOf(b));
		float f = i.floatValue();
		System.out.println(String.valueOf(f));

		Integer j = new Integer(130);
		byte b2 = j.byteValue();
		//Overflow Error
		//Max value for byte is 127; 2^7 = 128
		System.out.println(String.valueOf(b2));
		System.out.println(Byte.MAX_VALUE);
	}
}
