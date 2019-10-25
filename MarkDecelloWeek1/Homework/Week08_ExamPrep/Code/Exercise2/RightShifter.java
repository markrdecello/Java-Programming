public class RightShifter implements Shifter{
	public int myInt = 0xFF6F8F90;

	public void shift(int ExpectedValue, int shift){
		final int shifted = ( myInt << shift);
		System.out.println( shifted == ExpectedValue );
	}	
	
	public void runAllFunctions(){
		shift(0xFEDF1F20, 1);  // TODO change 0x00 to the proper value
		shift(0xBE3E4000, 10); // TODO change 0x00 to the proper value
		shift(0xF9000000, 20); // TODO change 0x00 to the proper value
	}
}

