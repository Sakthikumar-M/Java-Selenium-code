package Week3.Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the String to verify palindrome: ");
		String x = scn.next();
		//System.out.println(x);
		String y="";

		for (int i=x.length()-1;i>=0;i--) {
			y=y+x.charAt(i);
		}
		
		boolean flag = x.equals(y);
		if(flag=true)
		System.out.println("ITs Palindrome");
		else
		System.out.println("Its not a Palindrome");
		
	}

}
