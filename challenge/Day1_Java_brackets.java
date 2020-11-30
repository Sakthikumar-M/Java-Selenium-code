package challenge;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Day1_Java_brackets {

	public static void main(String[] args) {

		String str = "(([]{})";
		char input[] = str.toCharArray();
		Map<Character, Character> map_char = new HashMap<Character, Character>();
		map_char.put('(', ')');
		map_char.put('[', ']');
		map_char.put('{', '}');
		map_char.put('<', '>');
		// Map<Character, Integer> map_int = new HashMap<Character, Integer>();

		int key_count=0;
		int val_count=0;
		for (Entry<Character, Character> map : map_char.entrySet()) {
			
			for (int i = 0; i < input.length; i++) {
				if (map.getKey() == input[i]) {
					key_count++;
				}
				if(map.getValue() == input[i]) {
					val_count++;
				}
			}
			System.out.println(map.getKey()+" occurs  "+key_count+" Times");
			System.out.println(map.getValue()+" occurs  "+val_count+" Times");
			
				if(key_count==val_count) {
					System.out.println("true");
				}else {
					System.out.println("False");
				}
					
			key_count=0;
			val_count=0;
		}
	}

}
