package Week3.Assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "$$ Welcome to 2nd Class of Automation $$ ";
		
		// Here is what the count you need to find
				int  letter = 0, space = 0, num = 0, specialChar = 0;
				
		//List lst = new ArrayList();
		char ar[] = new char[test.length()];
		
		System.out.print(test);
		System.out.println();
		
		for (int i = 0; i < ar.length; i++) {
			ar[i]=test.charAt(i);

			if(Character.isLetter(ar[i])==true){
				letter++;
			}else if(Character.isSpaceChar(ar[i])==true){
				space++;
			}else if(Character.isDigit(ar[i])==true){
				num++;
			}else {
				specialChar++;
			}
		}
		
		System.out.println("Letter: "+letter);
		System.out.println("Space: "+space);
		System.out.println("Number: "+num);
		System.out.println("Special Character: "+specialChar);

	}
}
