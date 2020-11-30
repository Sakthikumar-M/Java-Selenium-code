package challenge;

import java.util.ArrayList;
import java.util.List;

public class day5_Java_vowels_multiple_Logic {

	public static void main(String[] args) {

		String input1 = "Apple is a fruit";
		String input2 = "You will WIN this";
		char[] vowels = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };

		System.out.println("Given Input 1: " + input1);
		String final_value1 = logic1(input1, vowels);
		System.out.println("Answer using Logic 1 : " + final_value1);
		System.out.println();
		System.out.println("Given Input 2: " + input2);
		String final_value2 = logic2(input2);
		System.out.println("Answer using Logic 2 : " + final_value2);
	}

	// Logic using ReplaceAll
	public static String logic2(String input) {
		String vowels_string = "[aeiouAEIOU]";
		String output1 = input.replaceAll(vowels_string, "");// remove the vowels
		String output2 = output1.replaceAll(" ", "");// remove the space
		return output2;
	}

	// Logic using without ReplaceAll
	public static String logic1(String input, char[] vowels) {

		// Converting string to character Array
		char[] arr = input.toCharArray();
		int k = 0, n = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < vowels.length && arr[i] != vowels[j]; j++) {
				// if the array value is not a vowel then inner loop will run till the vowel
				// array length else it will be lesser
				k++;
			}

			// So if counter length is lesser than vowel array length then the value is a
			// vowel. So replace it with space
			if (k != vowels.length) {
				arr[i] = ' ';
			}
			n++;
			k = 0;
		}

		/*
		 * String output1 = String.valueOf(arr);//Character array to string conversion
		 * String output2 = output1.replaceAll(" ", "");//REmoval of space
		 * return(output2);
		 */

		char[] ans = new char[n];
		int x = 0;
		// Move only alphabets from char arr[] to ans[] to remove space
		for (int i = 0; i < arr.length; i++) {
			if (Character.isAlphabetic(arr[i])) {
				ans[x] = arr[i];
				x++;
			}
		} 
		// change the ans[] array to string
		String answer = String.valueOf(ans); // return the value
		return (answer);

	}

}
