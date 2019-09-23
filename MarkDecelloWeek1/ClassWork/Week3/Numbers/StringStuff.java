public final class StringStuff{
	
	public static void f(){
		String s1 = "Hello";
		String s2 = " ";
		String s3 = "World";
		String fs = String.format("%d. %s%n", 100, s1.concat(s2).concat(s3));
		System.err.println(fs);
	}

	public static void g(){
		Byte b = new Byte((byte) 0x12);
		System.out.println(String.valueOf(b));
	}

	public static void main(String[] args){
		f();
		g();
	}
}
