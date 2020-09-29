package Week3.Assignment;

public class SumofDigitsfromstring_Method_2 {

	public static void main(String[] args) {
		String txt = "Tes12Le79ad65";
		char txt2[] = new char[txt.length()];
		int sum=0;
//		boolean flg = Character.isAlphabetic(txt.charAt(0));
//		txt.replaceAll("T", " ");
		
		for (int i = 0; i < txt.length(); i++) {
			txt2[i]=txt.charAt(i);
			if(Character.isDigit(txt2[i])==true){
				System.out.println(txt2[i]);				
				sum=sum+Character.getNumericValue(txt2[i]);
			}
		}
		
		System.out.println(sum);

		/*for (int i = 0; i < txt.length(); i++) {
			if(Character.isAlphabetic(txt.charAt(i))==true){
				txt="";
			}else{
				txt2[i]=txt;
			}
		}*/
		
		
		

	}

}
