package tr.org.linux.kamp.array;

import java.util.Arrays;

public class CompareArrays {

	public static void main(String[] args) {

		int[] intArray = {4,8,15,6,8,7};
		int[] intArray1 = {4,8,15,6,8,77};
		
		boolean result = Arrays.equals(intArray1, intArray);
		
		System.out.println(result);
	}

}
