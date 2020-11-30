package challenge;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day10_Selenium_ojio {
	
	RemoteWebDriver dr = null;
	@Test
	public void ojio() {
		browse("https://www.ajio.com");
		dr.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		navigate_to();
	}

	public void navigate_to() {
		WebElement women = dr.findElementByXPath("(//*[@id='appContainer']//div[3]//ul/li[1]/following::li[2])[1]");
		WebElement brands = dr.findElementByXPath("(//*[@id='appContainer']//div[3]//ul/li[1]/following::li[2])[1]/div/ul/li[2]/a");
		//women.click();
		Actions act = new Actions(dr);
		act.moveToElement(women).moveToElement(brands).click().perform();		
	}

	public void browse(String Link) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--start-maximized");
		copt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		copt.addArguments("--disable-notifications");
		copt.addArguments("ignore-certificate-errors");
		copt.addArguments("--silent");
		dr = new ChromeDriver(copt);
		dr.get(Link);
		
	}

}
