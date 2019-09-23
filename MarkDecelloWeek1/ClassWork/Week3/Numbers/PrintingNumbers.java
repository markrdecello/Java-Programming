class PrintingNumbers{
	public static void main(String[] args){
		String fs;
		float f = 1.9f;
		int i = 100;
		String s = "hello";
		fs = String.format("The value of float f is %.2f. The value of int i is %d. The value of string is %s.", f, i, s);
		System.out.println(fs);
	}
}
