package Week3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ReverseString {

	public static void main(String[] args) {
		
		// Here is the input
		String test = "feeling good";
		
		List lst = new ArrayList();
		
		for(int i=test.length()-1;i>=0;i--){
			
			lst.add(test.charAt(i));
			
		}
		
		System.out.println(lst);

	}

}
