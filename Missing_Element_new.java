package basics;

public class Missing_Element_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] aray ={1,2,6,4,8,12};
		
		Missing_Element_new my_sorting = new Missing_Element_new();
		my_sorting.sort_asc(aray);
			
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
	}
	
	public int[] sort_asc(int aray[]){
			int temp = 0;			
			for(int i=0;i<aray.length;i++){
				for(int j=0;j<aray.length;j++){
					
					if(aray[i]<aray[j]){
						temp = aray[i];
						aray[i]=aray[j];
						aray[j]=temp;
						}
					
					}			
		}
		return aray;
	}

}
