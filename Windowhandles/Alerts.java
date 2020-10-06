package Windowhandles;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts extends dynamic_browsers {

	private static final Function<? super WebDriver, Object> ExpectedConditions = null;

	public static void main(String[] args) throws Throwable {
		
		browse("chrome","http://leafground.com/pages/Alert.html");
		WebElement button = dr.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));
		button.click();
		WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
		wait.until(org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent());
		Alert a = dr.switchTo().alert();
		a.accept();

	}

}
