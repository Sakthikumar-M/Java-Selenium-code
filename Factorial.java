package week1.day1_assignment;

import java.util.Scanner;

public class Factorial {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		fact();
		
	}
	public static void fact() {
		
		System.out.println("Enter the Required Factorial No:");
		double value = scn.nextInt();
		double temp = 1;
		
		for(int n=1;n<=value;n++) {
			temp = temp*n;
		}
		
		System.out.println("Factorial is : "+temp);		
		
	}
	
	


}
