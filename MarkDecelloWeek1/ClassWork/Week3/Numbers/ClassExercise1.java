public class ClassExercise1{

	public static void main(String[] args){
		Byte b = new Byte((byte) 64);
		Byte b2 = new Byte((byte) 64);

		boolean bEqb2 = b.equals(b2);
		int retVal = b.compareTo(b2);
		int retVal2 = b.lessThan(b2);
		int retVal3 = b.greaterThan(b2);

		System.out.println(String.valueOf(bEqb2));
		System.out.println(String.valueOf(retVal));

	}
}

