package basics;

public class sorting {

		//int[] aray ={4,5,3,1,2,6};

		
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

		/*for(int n=0;n<aray.length;n++){
		System.out.println(aray[n]);
	}*/
		
		public int[] sort_desc(int aray[]){
			int temp = 0;			
			for(int i=0;i<aray.length;i++){
				for(int j=0;j<aray.length;j++){
					
					if(aray[i]>aray[j]){
						temp = aray[i];
						aray[i]=aray[j];
						aray[j]=temp;
						}
					
					}			
		}
		return aray;
	}
		
		


}
