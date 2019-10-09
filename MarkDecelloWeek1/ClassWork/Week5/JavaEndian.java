public class JavaEndian{
	public static byte[] intToBytes(int i){
		byte[] result = new byte[4];
		for(int i = 3; i >= 0; i--){
			result[i] = (byte)(l & 0xFF);
			l >>= 8;
		}
		return result;
	}

	public static void main(String[] args){
		int i = 1;
		byte[] b = intToBytes(i);
		for(byte b : bytes){
			System.out.println(String.valueOf(b));
		}
	}
}
