public class Surragate{
	public static void main(String[] args){
		int trebleClefInt = 0x1D11E;
		String s = new String(new int[]{trebleClefInt, trebleClefInt}, 0, 2);
		System.out.println(s);
		System.out.print(s);
		System.out.println(s);
	}
}
