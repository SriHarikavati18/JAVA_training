import java.util.Arrays;

public class ConcatenateTwoArrays {

	public static void main(String[] args) {
		int[] Array1 = {1,2,3};
		int[] Array2 = {7,8,9};

		int[] result = new int[Array1.length + Array2.length];

		System.arraycopy(Array1, 0, result, 0, Array1.length);
		System.arraycopy(Array2, 0, result, Array1.length, Array2.length);

		System.out.println(Arrays.toString(result));
		

	}

}
