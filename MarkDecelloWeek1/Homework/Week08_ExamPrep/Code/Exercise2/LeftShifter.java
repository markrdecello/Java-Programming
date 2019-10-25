public class LeftShifter implements Shifter{
	public int myInt = 0xFF6F8F90;

	public void shift(int ExpectedValue, int shift){
		final int shifted = ( myInt >> shift);
		System.out.println( shifted == ExpectedValue );
	}	
	
	public void runAllFunctions(){
		shift(0xFFB7C7C8, 1);  // TODO change 0x00 to the proper value
		shift(0xFFFFDBE3, 10); // TODO change 0x00 to the proper value
		shift(0xFFFFFFF6, 20); // TODO change 0x00 to the proper value
	}
}

