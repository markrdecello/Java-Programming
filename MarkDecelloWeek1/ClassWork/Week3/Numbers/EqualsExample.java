class EqualsExample{
	public static void main(String[] arguments){
		Float f1 = new Float(100.2);
		Float f2 = new Float(100.0);
		Byte b1 = new Byte((byte) 100);

		boolean f1Eqf2 = f1.equals(f2);
		boolean f2Eqb1 = f2.equals(b1);

		System.out.println(String.valueOf(f1Eqf2));
		System.out.println(String.valueOf(f2Eqb1));
	}
}
