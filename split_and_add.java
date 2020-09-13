package week1.day1_assignment;

import java.util.Scanner;

public class split_and_add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the value: ");
		int val = scn.nextInt();
		int a=0,b=0,temp=0;
		
		while(val>0) {
			a = val/10;
			b = val%10;
			
			val= a;
			temp = temp+b;
			//System.out.print(b);
		}
		//System.out.println();
		System.out.println(temp);
		
	}

}
