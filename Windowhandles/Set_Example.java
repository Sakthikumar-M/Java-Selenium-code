package Windowhandles;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.checkerframework.checker.units.qual.s;

public class Set_Example {

	public static void main(String[] args) {
		
		Set<String> s = new HashSet<String>();
		
		s.add("apple");
		s.add("orange");
		s.add("pine");
		s.add("mosambi");
		
		Iterator<String> I = s.iterator();
		
		for (int j = 0; j < s.size(); j++) {
			System.out.println(I.next());
		}
		
		/*
		 * for (String iter : s) { System.out.println(iter); }
		 */
		 
	}

}
