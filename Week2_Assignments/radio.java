package Week2_Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class radio extends dynamic_browsers{

	public static void main(String[] args) {
		
		browse("chrome","http://www.leafground.com/pages/radio.html");
		
		//Are you enjoying the classes
		dr.findElement(By.id("yes")).click();
		
		//Find default selected radio button
		WebElement radio1 = dr.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[2]/input"));
		WebElement radio2 = dr.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/label[3]/input"));
		WebElement n;
		if(radio1.isSelected()==true){
			System.out.println("UnChecked - Radio button is enabled");
		}else if(radio2.isSelected()==true){
			System.out.println("Checked - Radio button is enabled");
		}else{
			System.out.println("No Radio button is selected");
		}
		
		//Select your age group
		n= dr.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[1]"));
		WebElement n1 = dr.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input[2]"));
		if(n1.isSelected()==false){
			n1.click();
		}else{
			n.click();
			n1.click();
		}
		
	}

}
