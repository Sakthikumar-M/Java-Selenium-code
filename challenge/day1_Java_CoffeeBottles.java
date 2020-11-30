package challenge;

import java.util.Scanner;

public class day1_Java_CoffeeBottles {

	public static int n, xchange, new_bottles, remainder, next_val = 0,total = 0;

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scn= new Scanner(System.in);
		System.out.print("Total no of cold coffee Bottles : ");
		n= scn.nextInt();
				
		System.out.print("No of Exchange Bottles : ");
		xchange= scn.nextInt();
		
		System.out.println();
		int temp = n,i=1;
			while(n>=xchange) {
				System.out.println("Exchange Cycle "+i);
				System.out.println();
				new_bottles = n/xchange;
				System.out.println("New bottles : "+new_bottles);
				remainder = n%xchange;
				System.out.println("Remaining bottles : "+remainder);
				total = new_bottles+remainder;
				n=total;
				//System.out.println("total new+remainder: "+total);
				next_val = next_val+new_bottles;
				System.out.println("total new bottles :"+next_val);				
				//System.out.println("N value" +n);
				System.out.println();
				i++;
			}
			System.out.println("No of Coffee bottles you can have:"+(temp+next_val));
		}

}
