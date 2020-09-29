package Week3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		
		String test = "changeme";
		
		List<Character> lst = new ArrayList<Character>();
		
		//System.out.println(test.toUpperCase().charAt(1));
		
		for (int i = 0; i < test.length(); i++) {
			if(i%2!=0){
			lst.add(test.toUpperCase().charAt(i));
			}else{
				lst.add(test.charAt(i));
			}
		}
				

		
		System.out.println(lst);

	}

}
