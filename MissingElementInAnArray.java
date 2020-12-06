package basics;

import java.lang.reflect.Array;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] aray ={1,2,6,4,8,12};
			
		sorting srt = new sorting();
		
		srt.sort_asc(aray);
			
		int diff,n;
		
		for(int x=0;x<aray.length;x++){
			System.out.print(" "+aray[x]);
		}
		
		System.out.println("Missing nos");
		
		for(int i=0;i<aray.length-1;i++){

			if(aray[i+1]-aray[i]>1){
				diff = aray[i+1]-aray[i];
				
				for(int x=1;x<=diff-1;x++){
					n = aray[i]+x;
					
					System.out.print(" "+n);
				}
			}
		}
		
				
		//System.out.println(start+" , "+end);
		
		//int[] res1_array = new int[(end-start)+1];
		//System.out.println(res1_array.length);
		
		/*for(int x=0;x<res1_array.length;x++){
			res1_array[x] = start;
			start++;
			//System.out.println("["+x+"]"+res1_array[x]);
		}*/
		
		/*for(int y=0;y<res1_array.length;y++){
			
			if(res1_array[y]!= sorted_array[y]){
				System.out.println(res1_array[y]);
			}
			
		}*/
		
		
	}

}
