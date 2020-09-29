package Week3.Assignment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class anagram {

	public static void main(String[] args) {

		String txt1 = "stops";
		String txt2 = "potss";
		int len1,len2;
		len1 = txt1.length();
		len2 = txt2.length();
		List<Character> l1 = new ArrayList<Character>();
		List<Character> l2 = new ArrayList<Character>();
		
		if(len1==len2){
			for (int i = 0; i < len1; i++) {
				l1.add(txt1.charAt(i));				
			}
			
			for (int i = 0; i < len2; i++) {
				l2.add(txt2.charAt(i));				
			}
			
			Collections.sort(l1);
			Collections.sort(l2);
			
			if(l1.equals(l2)){
				System.out.println("Both Strings are Equal");
			}else{
				System.out.println("Not Equal");
			}
		}
	}

}
