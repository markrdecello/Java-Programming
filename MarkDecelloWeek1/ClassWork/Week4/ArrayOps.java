import java.util.Arrays;

public class ArrayOps{

	public static void main(String[] args){
		int[] arr1 = {1, 2, 3};
		int[] arr2 = {2, 3, 1};
		int hashCode1 = Arrays.hashCode(arr1);
		int hashCode2 = Arrays.hashCode(arr2);
		System.out.println(String.valueOf(hashCode1));
		System.out.println(String.valueOf(hashCode2));

		Arrays.sort(arr2);
		int hashcode3 = Arrays.hashCode(arr2);
		System.out.println(String.valueOf(hashCode2));
		printArrContents(arr2);

		//int[] arr3 = arr2;
		int[] arr3 = Arrays.copyOf(arr2, arr2.length);

		printArrContents(arr2);
		arr3[0] = 1000;
		printArrContents(arr2);
	}

	public static void printArrContents(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(" " + arr[i]);
		}
		System.out.println("");
	}
}
