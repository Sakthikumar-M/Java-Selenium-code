package Week3.Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicates_collections {

	public static void main(String[] args) {
		
		String text = "We learn java basics as part of java sessions in java week1";
		
		String[] new_txt = text.split(" ");
		
		Set<String> st1 = new TreeSet<String>();
		
		for (int i = 0; i < new_txt.length; i++) {
			//System.out.println(new_txt[i]);
			st1.add(new_txt[i]);
		}
		
		List<String> l1 = new ArrayList<String>(st1);
		
		for (int i = 0; i < l1.size(); i++) {
			//System.out.println(new_txt[i]);
			System.out.println(l1.get(i));
		}		

	}

}
