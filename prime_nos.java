package basics;

public class prime_nos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=100;
		
		for(int i=1;i<=x;i++){
			if(i==2){
				System.out.println(i);
			}
			for(int j=2;j<=i && i%j!=0;j++){
				if(j==i-1)
				System.out.println(i);
			}
		}

	}

}
