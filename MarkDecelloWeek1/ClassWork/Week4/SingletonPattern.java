public class SingletonPattern{

	private static SingletonPattern s = null;

	public static int i;

	private SingletonPattern(){
		i = 1;
	}

	public static SingletonPattern getInstance(){
		if(s == null){
			s = new SingletonPattern();
		}	
		return s;
	}

	//public static void main(String[] args){
	//	SingletonPattern s = SingletonPattern.getInstance();
	//	s.i = 29;
	//	SingletonPattern s2 = SingletonPattern.getInstance();

//		System.out.println("s2.i = " + s2.i);		
//	}
}
