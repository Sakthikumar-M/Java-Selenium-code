package Week4.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Textchange_Assign4_3 extends dynamic_browsers {

	public static void main(String[] args) {

		browse("chrome","http://leafground.com/pages/TextChange.html");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement button = dr.findElement(By.xpath("//*[@id='btn']"));
		
		if(button.getText().equals("Click ME!")){
			System.out.println("Button text is Click ME!");
		}
		
		button.click();
		Alert a = dr.switchTo().alert();
		
		System.out.println("Alert box name is: "+a.getText());
		a.accept();
	}

}
