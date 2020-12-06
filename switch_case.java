package basics;

public class switch_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=30,y=2;
		String operation = "add";
		
		switch(operation){
		
		case "add": System.out.println("Addition of two values :"+(x+y));
				  	break;
				  	
		case "sub": System.out.println("Subtraction of two values :"+(x-y));
	  				break;
	  				
		case "multi": System.out.println("Multiplication of two values :"+(x*y));
	  				  break;
	  	
		case "Div": System.out.println("Multiplication of two values :"+(x/y));
					break;
		
		default: System.out.println("This is a calculation pgm");
			
		}
		

	}

	

}
