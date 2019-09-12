public class Final{
	public final int x;
	
	//Constructor = Has to be the same name as class
	//Final = Cannot change it
	//Can also mark classes as final
	//Cannot inherit from final classes
	Final(int i){
		x = i;
	}

	public static void main(String[] args){
		Final f = new Final(1);
		System.out.println(String.valueOf(f.x));
	}
}
