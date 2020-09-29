package Week3.Assignment;

public class RemoveDuplicates_2_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We week1 of learn java basics as part of java sessions in java week1";
		String txt1[] = text.split(" ");
		String txt2[] = txt1;
		int count=0;
		
		for (int i = 0; i < txt1.length; i++) {
			count=0;
			for (int j = 0; j < txt1.length; j++) {
				
				if(txt1[i].equals(txt1[j])){
					count++;
					txt2[i]=txt1[i];
				}
				if(count>1){
					txt2[i] = "";					
				}
				
				//System.out.println("Array1 : "+txt1[i]+   " Array2 : "+txt1[j] +"   Count is: "+count);
			}		
		}

		for (int i = 0; i < txt1.length; i++) {
			System.out.println(txt2[i]);
		}

	}

}
