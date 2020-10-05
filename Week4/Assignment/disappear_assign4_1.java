package Week4.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class disappear_assign4_1 extends dynamic_browsers {


	public static void main(String[] args) throws Exception {
		
		browse("chrome", "http://leafground.com/pages/disapper.html");
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(dr, 50);
		long time = System.currentTimeMillis();
		
		final By button = By.xpath("//*[@id='btn']/b");
		wait.until(ExpectedConditions.visibilityOfElementLocated(button));
		System.out.println(String.format("The button appeared until %d miliseconds", System.currentTimeMillis() - time));
		
		wait.until(ExpectedConditions.invisibilityOfElementLocated(button));
		System.out.println(String.format("The button disappeared after %d miliseconds", System.currentTimeMillis() - time));	

	}

}
