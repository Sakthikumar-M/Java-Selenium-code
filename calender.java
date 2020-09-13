package Others;

import java.util.ArrayList;
import java.util.List;

public class calender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object> month = new ArrayList<Object>();
		
		month.add("JANUARY");
		month.add("FEBRUARY");
		month.add("MARCH");
		month.add("APRIL");
		month.add("MAY");
		month.add("JUNE");
		month.add("JULY");
		month.add("AUGUST");
		month.add("SEPTEMBER");
		month.add("OCTOBER");
		month.add("NOVEMBER");
		month.add("DECEMBER");
		
			
		int[] mdays = {31,28,31,30,31,30,31,31,30,31,30,31}; 
		
		
		for(int i=0;i<mdays.length;i++) {
			System.out.println(month.get(i));
			for(int j=1;j<=mdays[i];j++) {
				System.out.print(" "+j+" ");
				
				if(j%5==0) {
					System.out.println();
				}
			}
			System.out.println();
			System.out.println();
			
		}
		
		

	}

}
