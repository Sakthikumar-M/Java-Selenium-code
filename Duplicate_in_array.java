package basics;

public class Duplicate_in_array {

	public static void main(String[] args) {
		
		int[] arra = {1,2,3,3,3,1,5};
		int count=0,temp=0,cnt=0,x=0;
		
		for(int i=0;i<arra.length;i++){
			
			for(int j=0;j<arra.length;j++){
				
				if(arra[i]==arra[j]){
					count++;
					if(count>1){
						temp = arra[i];
					}
				}				
				//System.out.println(" arra[i] is :"+arra[i]+" arra[j] is :"+arra[j]+" Count is :"+count+" temp is"+temp);
			}
			
			if(count>1){
			System.out.println(" Value "+temp + " Duplicates to :"+count+"times");
			System.out.println();
			}
			count = 0;
		}
		
		//System.out.println(temp+" , "+count);

	}

}
