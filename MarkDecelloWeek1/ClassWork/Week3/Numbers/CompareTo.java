public final class CompareTo{
	public static void main(String [] doggies){
		Float f = new Float(1);
		Float f0 = new Float(0.0f);
		Float f1 = new Float(1.0f);
		Float f2 = new Float(2.0f);

		int retVal0 = f.compareTo(f0);
		int retVal1 = f.compareTo(f1);
		int retVal2 = f.compareTo(f2);

		System.out.println(String.valueOf(retVal0));
		System.out.println(String.valueOf(retVal1));
		System.out.println(String.valueOf(retVal2));
	}
}
