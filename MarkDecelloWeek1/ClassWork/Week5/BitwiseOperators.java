public class BitwiseOperators{
	public static void testAnd(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte and = (byte)(b&c);
		System.out.println(String.valueOf(and));
	}

	public static void testOr(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte and = (byte)(b | c);
		System.out.println(String.valueOf(and));
	}

	public static void testXor(){
		byte b = (byte)127;
		byte c = (byte)7;
		byte and = (byte)(b ^ c);
		System.out.println(String.valueOf(and));
	}

	public static void main(String[] args){
		testAnd();
		testOr();
		testXor();
	}
}
