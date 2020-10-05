package Week4.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {

	public static void main(String[] args) {
		//*************Launch Application*************//
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://jqueryui.com/sortable/");
				driver.switchTo().frame(0);
				WebElement item1 = driver.findElementByXPath("//li[contains(text(),'Item 1')]");
				WebElement item4 = driver.findElementByXPath("//li[contains(text(),'Item 4')]");
				int x = item4.getLocation().getX();
				System.out.println("X:- " +x);
				int y = item4.getLocation().getY();
				System.out.println("Y:- " +y);
				Actions builder= new Actions(driver);
				builder.dragAndDropBy(item1, x, y).build().perform();
	}

}
