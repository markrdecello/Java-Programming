public class ProblemTwo{

	public static void main (String[] args){
		String Str = new String("My name is Mark!");
		System.out.print("Found Last Index :" );
		System.out.println(Str.lastIndexOf( 'M' )); //using int lastIndexOf(int ch)
		System.out.print("Found Last Index :" );
		System.out.println(Str.lastIndexOf( 'a', 5 )); //using int lastIndexOf(int ch, int fromIndex)

		int[] bytes = new int[] { 65, 66, 67, 68 };
		System.out.println(new String(bytes, 1, 2)); //using String(int[] codePoints, int offset, int count)
	}
}
