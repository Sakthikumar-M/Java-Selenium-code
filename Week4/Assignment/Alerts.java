package Week4_Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Week2_Assignments.dynamic_browsers;

public class Alerts extends dynamic_browsers {

	public static void main(String[] args) {
		
		browse("chrome","http://leafground.com/pages/Alert.html");
		
		Alert a1 =null;
		
		List<WebElement> l1 = dr.findElements(By.xpath("//button"));
		
		//WebDriverWait wait = new WebDriverWait(dr, Duration.ofSeconds(5));
		//wait.until(ExpectedConditions.alertIsPresent());
		
		l1.get(0).click();
		a1 = dr.switchTo().alert();
		a1.accept();
		dr.switchTo().defaultContent();
		
		l1.get(1).click();
		a1 = dr.switchTo().alert();
		a1.accept();
		System.out.println(dr.findElement(By.xpath("//*[@id='result']")).getText());
		dr.switchTo().defaultContent();
		
		l1.get(2).click();
		a1 = dr.switchTo().alert();
		a1.sendKeys("sakthi");
		a1.accept();
		System.out.println(dr.findElement(By.xpath("//*[@id='result1']")).getText());
		dr.switchTo().defaultContent();
		
		l1.get(3).click();
		a1 = dr.switchTo().alert();
		System.out.println(a1.getText());
		a1.accept();
		dr.switchTo().defaultContent();
		
		l1.get(4).click();
		//a1 = dr.switchTo().alert();
		//System.out.println(a1.getText());
		dr.findElement(By.xpath("/html/body/div[2]/div/div[2]/div/button")).click();
		//a1.accept();
		//dr.switchTo().defaultContent();
		
		dr.quit();
		
				
	}

}
