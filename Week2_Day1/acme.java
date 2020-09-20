package Week2_Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.internal.MouseAction.Button;
import org.openqa.selenium.support.ui.Select;

public class acme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://acme-test.uipath.com/login");
		dr.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		dr.findElementById("password").sendKeys("leaf@12");
		dr.findElementByClassName("btn-primary").click();
		String title = dr.findElementByClassName("navbar-brand").getText();
		System.out.println("Title is:" +title);
		dr.close();
		dr.quit();
	}

}
