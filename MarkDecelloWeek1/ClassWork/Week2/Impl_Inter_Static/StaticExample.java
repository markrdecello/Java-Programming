public class StaticExample{
	public static int counter = 0;

	StaticExample(){
		counter++;
	}

	//Will receive error if called from static
	//Have to create an instance to make it work
	//StaticExample instance = new StaticExample()
	//instance.nonStatic()
	public void nonStatic(){
		System.out.println("doesnt");
	}

	public static void staticfunc(){
		System.out.println("works");
	}

	public static void main(String[] args){
		System.out.println(String.valueOf(counter));
	
		StaticExample se = new StaticExample();
		System.out.println(String.valueOf(se.counter));

		StaticExample se1 = new StaticExample();
		System.out.println(String.valueOf(se.counter));

		StaticExample se2 = new StaticExample();
		System.out.println(String.valueOf(se.counter));
	}
}
