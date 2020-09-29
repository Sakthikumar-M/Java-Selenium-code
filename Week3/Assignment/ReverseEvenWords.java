package Week3.Assignment;

import java.util.ArrayList;
import java.util.List;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String tst1[] = test.split(" ");
		List<Character> lst = new ArrayList<Character>();
		List<Character> lst2 = new ArrayList<Character>();
		
		
		/*for(int i=0;i<tst1.length;i++){
			System.out.println(tst1[i].length());
		}*/
		
		/*for(int j=0;j<tst1[3].length();j++){
			System.out.println(tst1[3].charAt(j));
		}*/
		
		
		/*for (int i = 0; i < tst1.length; i++) {
			for(int j=0; j<tst1[i].length();j++){
				lst.add(tst1[i].charAt(j));
			}
		}*/
		
		for (int i = 0; i < tst1.length; i++) {
			lst.clear();
			if(i%2!=0){
				for(int j=tst1[i].length()-1; j>=0;j--){					
					lst.add(tst1[i].charAt(j));
				}
				lst2.addAll(lst);
				lst2.add(' ');				
			}else{
				for(int j=0; j<tst1[i].length();j++){
					lst.add(tst1[i].charAt(j));
				}
				lst2.addAll(lst);
				lst2.add(' ');				
			}
			
		}
		
		for (int i = 0; i < lst2.size(); i++) {
			System.out.print(lst2.get(i));
			System.out.print(" ");
		}
	
	}

}
