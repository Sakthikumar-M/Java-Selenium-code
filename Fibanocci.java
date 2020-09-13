package week1.day1_assignment;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0,b=1,c,val;
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter the required Fibanocci value: ");
		val = scn.nextInt();
		
		for(int n=0;n<val;n++) 
		{
			c = a+b;
			System.out.println(a+"+"+b+"+"+"="+c);
			a=b;
			b=c;
			
		}
	}

}
