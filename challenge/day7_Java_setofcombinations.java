package challenge;

import org.testng.annotations.Test;

public class day7_Java_setofcombinations {

	static int x = 0;

	@Test
	public void combination() {

		int[] arr = { 1, 2, 1, 1, 4, 2, 1, 3};
		int k = 3, count = 0, x = 0;
		System.out.println();
		System.out.println("Combinations are");
		System.out.println("================");
		
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] + arr[j] == k) {
					System.out.println("Array[" + i + "] + Array[" + j + "]  = " + arr[i] + " + " + arr[j]);
					count++;
					break;
				}
			}
			if (arr[i] == k) {
				x++;
				count++;
			}
		}
		System.out.println();
		System.out.println("occurances of "+k+" is "+ x +" Times");
		System.out.println("Total No of Sub arrays whose sum "+k+" is = " + count);
		System.out.println();
		System.out.println();
	}

}
