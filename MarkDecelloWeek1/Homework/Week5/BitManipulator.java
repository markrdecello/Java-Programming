

public class BitManipulator{
	
	/*
	 * Funky function that makes a short from 4 bytes.
	 *
	 * @param byteArray - byte[] of length 4.
	 * @return a short made from the last 4 bits of every byte in byteArray.
	 *
	 */
	private static short extractShort(byte[] byteArray) throws ByteArrayLengthException {
		if( byteArray.length != 4 ){
			throw new ByteArrayLengthException("parameter byteArray to 'extractShort' must have length 4.");
		}
		else{
			//short = 16 bits
			short retVal = (short)0x00;
			for(int byteIdx = 0; byteIdx < 4; byteIdx++){
				//takes last 4 bits; 0x0F = 0000 1111
				byte tmp = (byte) (byteArray[byteIdx] & 0x0F);
				short shiftedTmp = (short) (tmp << (12 - (4*byteIdx)));
				retVal |= shiftedTmp;
			}
			return retVal;
		}
	}

	private static byte[] intToByteArray(int i){
		byte[] result = new byte[4];
		//int = 32 bits
		//bitshift 8 4 times
		for(int b = 3; b >= 0; b--){
			result[b] = (byte)(i & 0xFF);
			i >>= 8;
		}
		return result;
	}

	public static void main(String[] args){
		int i = 56401;
		byte[] byteArr = intToByteArray(i);
		try{
			short s = extractShort(byteArr);
	        	System.out.println(String.valueOf(s));
		}
		catch( Exception e ){
			System.out.println(e.getMessage());
		}
	}	

}

class ByteArrayLengthException extends Exception{
	public ByteArrayLengthException( String s ){
		super(s);
	}
}

