package week1.day1_assignment;

import java.util.Scanner;

public class odd_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the range for odd nos: ");
		int val = scn.nextInt();
		
		for(int i=0;i<=val;i++) {
			if(i%2!=0)
			System.out.println(i);
		}
	}

}
