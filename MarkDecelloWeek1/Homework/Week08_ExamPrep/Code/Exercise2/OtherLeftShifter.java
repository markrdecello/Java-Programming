public class OtherLeftShifter implements Shifter{
	public int myInt = 0xFF6F8F90;

	public void shift(int ExpectedValue, int shift){
		final int shifted = ( myInt >>> shift);
		System.out.println( shifted == ExpectedValue );
	}	
	
	public void runAllFunctions(){
		shift(0x7FB7C7C8, 1);  // TODO change 0x00 to the proper value
		shift(0x003FDBE3, 10); // TODO change 0x00 to the proper value
		shift(0x00000FF6, 20); // TODO change 0x00 to the proper value
	}
}

