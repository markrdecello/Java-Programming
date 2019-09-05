public class MarkWeek01{

	private int[] myIntArray = new int[] {
		1,
		9,
		10,
		29,
		1995,
		1996
	};

	//Each 'get methods' will print out the values of the data types
	public void getMyIntArray(){
		System.out.println("\tGetting int array...");
		System.out.print("\t\tInt arrays are... ");
		for(int i = 0; i < 6; i++){
			int myArr = myIntArray[i];
			System.out.print(myArr + ", ");
		}
	}

	public void getMyInt(int myInt){
		System.out.println("\tGetting int...");
		System.out.println("\t\tInt is... " + myInt);
	}

	public void getMyByte(byte myByte){
		System.out.println("\tGetting byte...");
		System.out.println("\t\tByte is... " + myByte);
	}

	public void getMyShort(short myShort){
		System.out.println("\tGetting short...");
		System.out.println("\t\tShort is... " + myShort);
	}

	public void getMyLong(long myLong){
		System.out.println("\tGetting long...");
		System.out.println("\t\tLong is... " + myLong);
	}

	public void getMyFloat(float myFloat){
		System.out.println("\tGetting float...");
		System.out.println("\t\tFloat is... " + myFloat);
	}

	public void getMyDouble(double myDouble){
		System.out.println("\tGetting double...");
		System.out.println("\t\tDouble is... " + myDouble);
	}

	public void getMyBoolean(boolean myBoolean){
		System.out.println("\tGetting boolean...");
		System.out.println("\t\tBoolean is... " + myBoolean);
	}

	public void getMyChar(char myChar){
		System.out.println("\tGetting char...");
		System.out.println("\t\tChar is... " + myChar);
	}

	//Method 1: Use an if-else statement
	public void useAnIfElseStatement(){
		int a = 29;
		int b = 9;
		if(a == 29){
			System.out.println("\ta == 29!");
		}else if(b == 9){
			System.out.println("\tb == 9!");
		}else{
			System.out.println("\ta != 29 && b !=9");
		}
	}

	//Method 2: Use a while loop
	public void useAWhileLoop(){
		int c = 1;
		while(c <= 5){
			System.out.println("\tLoop");
			c++;
		}
	}

	//Method 3: Use an 'and' comparator
	public void useAndComparator(){
		int d = 10;
		int e = 29;
		if(d == 10 && e == 29){
			System.out.println("\tSuccessfully used an 'and' comparison!");
		}else{
			System.out.println("\td != 10 && e != 29");
		}
	}

	//Method 4: Use an 'or' comparator
	public void useOrComparator(){
		int f = 1;
		if(f == 1 || f == 8){
			System.out.println("\tSuccessfully used an 'or' comparison!");
		}else{
			System.out.println("\tf != 1 || f != 8");
		}
	}

	public static void main(String[] args){

		//Primitive Data Types in Java
		int myInt = 9;
		byte myByte = (byte) 1;
		short myShort = 29;
		long myLong = 9000;
		float myFloat = 12.9f;
		double myDouble = 1.09;
		boolean myBoolean = true;
		char myChar = 'G';
		int[] myIntArray = {1, 9, 10, 29, 1995, 1996};
		
		MarkWeek01 MD = new MarkWeek01();
		System.out.println("Getting all primitive data type values...");
		MD.getMyInt(myInt);
		MD.getMyByte(myByte);
		MD.getMyShort(myShort);
		MD.getMyLong(myLong);
		MD.getMyFloat(myFloat);
		MD.getMyDouble(myDouble);
		MD.getMyBoolean(myBoolean);
		MD.getMyChar(myChar);
		MD.getMyIntArray();

		System.out.println("\n\nUsing if-else, while loop, and comparators...");
		MD.useAnIfElseStatement();
		MD.useAWhileLoop();
		MD.useAndComparator();
		MD.useOrComparator();

		System.out.println("\n\tFinished running homework for week 1!\n");
	}
}
