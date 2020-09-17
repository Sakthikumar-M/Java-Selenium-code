package basics;

public class second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aray ={4,5,3,1,2,6};
		
		sorting srt = new sorting();
		
		int[] result = srt.sort_desc(aray);
		
		System.out.println("Second Largest No in the array is :"+result[1]);
	}

}
