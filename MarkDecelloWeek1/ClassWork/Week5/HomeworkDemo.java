public class HomeworkDemo{

	public static byte[] longToByteArray(long l){
		byte[] result = new byte[8];
		for(int b = 7; b >= 0; b--){
			result[b] = (byte)(l & 0xFF);
			l >>= 8;
		}
		return result;
	}

	/*public static byte funkyFunction(byte[] bArr) throws InvalidArrLengthException{
		if(bArr.length != 8){
			throw new InvalidArrLengthException("invalid array length");
		}
		byte retVal = (byte)0x00;
		for(int byteIdx = 0; byteIdx < 8; byteIdx++){
			byte tmp = (byte) (bArr[byteIdx] & 0x01);
			byte shiftedTmp = (byte) (tmp << (7 - byteIdx));
			retVal |= shiftedTmp;
		}
		return retVal;
	}*/

	public static void main(String[] args){
		long l = -1;
		byte[] bArr = longToByteArray(l);
		for(byte b : bArr ){
			System.out.println(String.valueOf(b));
		}
		//byte b = funkyFunction(bArr);
	}
}
