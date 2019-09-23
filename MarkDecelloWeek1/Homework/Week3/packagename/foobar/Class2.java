package packagename.foobar;

public class Class2{
	
	public void StartClass2(){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Let's Start Class 2!");
	}

	public void Equals(){
		Float f1 = new Float(29.00);
		Byte b1 = new Byte((byte) 29);

		boolean f1Eqb1 = f1.equals(b1);
		System.out.println("f1 = b1? " + f1Eqb1);
	}

	public void Integer(){
		Integer i = new Integer(10);
		byte b2 = i.byteValue();
	       	System.out.println("Byte value of i is " + String.valueOf(b2));
		float f2 = i.floatValue();
		System.out.println("Float value of i is " + String.valueOf(f2));	
	}
}
