public class MarkWeek1Class{

	//Primitive Data Types
	int i = 100;
	byte b = (byte) 1;
	double d = 123.01;
	short s = 123;
	long l = 1234;
	char c = 'a';
	float f = 11.0f;
	float f2 = (float) 1.0;
	int[] iArr = {1, 2, 3, -100, -19, 1};

	public static void main(String[] args){

		MarkWeek1Class p = new MarkWeek1Class();
		System.out.println("My int is " + p.i);
		System.out.println("My float and double are " + p.f + " and " + p.d);
		System.out.println("\n\tInt is " + p.i + "\n\tByte is " + p.b + "\n\tDouble is " + p.d + 
				"\n\tShort is " + p.s + "\n\tLong is " + p.l + "\n\tChar is " + p.c + 
				"\n\tFloat is " + p.f);

		//If Statement
		int j = 24;
		if(j == 25){
			System.out.println("j == 25!");
		}else if(j == 24){
			System.out.println("j == 24!");
		}else{
			System.out.println("j != 25 || 24");
		}

		//Switch Statement
		int k = 1;
		switch(k){
			case 0:
				System.out.println("\n\t0");
				break;
			case 1:
				System.out.println("\n\t1");
				break;
			case 2:
				System.out.println("\n\t2");
				break;
			default:
				System.out.println("default");
		}

		//Loops
		//While Loop
		int t = 1;
		System.out.println("\nBefore while loop: t = " + t);
		while(t < 4){
			t = t + 1;
		}
		System.out.println("After while loop: t = " + t + "\n");

		//For Loop
		for(int o = -1; o < 10; o++){
			System.out.println("Inside for loop, o = " + o);
		}

		//In Class Work
		int q = 24;
		switch(q){
			case 25:
				System.out.println("\n\tq == 25!");
				break;
			case 24:
				System.out.println("\n\tq == 24!");
				break;
			default:
				System.out.println("\n\tq != 25 || 24");
		}
	}
}
