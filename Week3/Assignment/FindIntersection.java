package Week3.Assignment;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ar1[] = {3,2,11,4,6,7};
		int ar2[] = {1,2,8,4,9,7};
		
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar2.length; j++) {
				if (ar1[i]==ar2[j]) {
					System.out.println("Common values between array1 and array2 are : "+ar1[j]);
				}
			}
		}

		
	}

}
