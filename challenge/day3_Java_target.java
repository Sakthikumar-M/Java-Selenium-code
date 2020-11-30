package challenge;

import java.util.Scanner;

public class day3_Java_target {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2 };
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the Target value = ");
		int ans = scn.nextInt();
		System.out.println();
		@SuppressWarnings("unused")
		boolean flag = target(arr, ans);
		if (flag == false) {
			System.out.println("No matching value in array");
		}

	}

	static int x = 0;

	public static boolean target(int[] arr, int ans) {
		boolean flag = false;
		for (int i = 0; i < arr.length; i++) {
			x = i + 1;
			for (int j = x; j < arr.length; j++) {
				if (arr[i] + arr[j] == ans) {
					System.out.println("Array[" + i + "] + Array[" + j + "]  = " + arr[i] + " + " + arr[j]);
					flag = true;
				}
			}
		}
		return flag;
	}

}
