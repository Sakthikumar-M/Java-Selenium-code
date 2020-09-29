package Week3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class CharOccurance {

	public static void main(String[] args) {
	
	// Check number of occurrences of a char (eg 'e') in a String
		
		String str = "welcome to chennai";
		List<Character> lst = new ArrayList<Character>();
		// declare and initialize a variable count to store the number of occurrences
		int count=0;
		//----Add the string into List--------------------------
		for(int i=0;i<str.length();i++){
			lst.add(str.charAt(i));
			//----count the occurrences of letter 'e'---------------
			if(lst.get(i)=='e'){
				count++;
			}
		}
		//*--------------Print the occurrences-------------------
		System.out.println("Letter 'E' occured "+count+" times");
		
		//----count the occurrences of letter 'e'---------------
		/*for (Character ch : lst) {
			if(ch.charValue()=='e'){
				count++;
			}
		}		*/
		count =0;
		System.out.println();
		for(int x=0;x<lst.size();x++){
			count=0;
			for(int y=x;y<lst.size();y++){
				if(lst.get(x)==lst.get(y)){
					count++;
				}
			}
			System.out.println(lst.get(x)+" occured "+count+" times");
		}
		

	}

}
