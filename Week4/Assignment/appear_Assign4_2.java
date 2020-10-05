package Week4.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class appear_Assign4_2 extends dynamic_browsers {

	public static void main(String[] args) {
		
		browse("chrome", "http://leafground.com/pages/appear.html");
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(dr, 50);
		long time = System.currentTimeMillis();
		
		final By button = By.xpath("//*[@id='btn']/b");
		wait.until(ExpectedConditions.visibilityOfElementLocated(button));
		System.out.println(String.format("The button appeared after %d miliseconds", System.currentTimeMillis() - time));
		
		WebElement but = dr.findElement(By.xpath("//*[@id='btn']/b"));
		System.out.println("button name is : "+but.getText());
	}

}
