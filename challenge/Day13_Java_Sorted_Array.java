package challenge;

import java.util.HashMap;
import java.util.Map;

public class Day13_Java_Sorted_Array {

	public static void main(String[] args) {
//
		int[] arr = { 3, 6, 7, 8, 15 };
		int target = 14;
		int temp = 0, diff = 0;
		boolean flag = false;

		System.out.println("Given Target is : " + target);
		System.out.println("------------------------------------------");

		try {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] == target) {
					System.out.println(target + "  available in Index position [" + i + "]");
					flag = true;
				}
			}

			if (flag == false) {
				// int index = identify_index(arr, target);
				// System.out.println("Target value " + target + " should be placed in Index
				// Position: ["+ index+"]");

				for (int i = 0; i < arr.length; i++) {
					if (target < arr[i]) {
						temp = i;
						break;
					}
				}

				diff = arr[temp] - arr[temp - 1];
				int val = arr[temp - 1];
				int n = 1, count = 0;
				Map<Integer, Integer> mp1 = new HashMap<Integer, Integer>();

				System.out.println("Logic 1 - If user wants to keep the value between existing values Then");
				System.out.println();
				System.out.println("Target value should be kept in Index: [" + temp + "] Between the values " + arr[temp - 1] + " and " + arr[temp]);
				
				System.out.println("-----------------------------------------------------------------");

				System.out.println("Logic 2 - If missing values Between " + arr[temp - 1] + " and " + arr[temp]
						+ " are included in the array then the index should be");
				System.out.println();
				for (int i = 0; i < diff - 1; i++, n++, count++) {
					System.out.println("Value :" + (val + n) + "	Should be kept on Index[" + (temp + count) + "]");
					mp1.put(+(val + n), (temp + count));
				}
				System.out.println("-------------------------------");
				System.out.println("After insertion of missing elements between the values " + arr[temp - 1] + " and "
						+ arr[temp] + " Index of " + target + " should be [" + mp1.get(target) + "]");

			}
		} catch (Exception e) {
			System.out.println("Value out of array value");
		}
	}
}
