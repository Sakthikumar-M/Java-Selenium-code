package Windowhandles;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dynamic_browsers {

	public static WebDriver dr = null;

	public static void browse(String browser,String link){
		
		switch(browser){
		
		case "chrome"	:  	//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
							WebDriverManager.chromedriver().setup();
							ChromeOptions copt = new ChromeOptions();
							copt.addArguments("--start-maximized");
							copt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
							copt.addArguments("--disable-notifications");
							copt.addArguments("ignore-certificate-errors");
							copt.addArguments("--silent");
							dr = new ChromeDriver(copt);
							dr.get(link);
							break;
						
		case "ie"		: 	//System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
							WebDriverManager.iedriver().setup();
							dr = new InternetExplorerDriver();
							dr.get(link);
							break;
														
		case "firefox"	:	WebDriverManager.firefoxdriver().setup();
							FirefoxOptions fopt = new FirefoxOptions();
							fopt.setPageLoadStrategy(PageLoadStrategy.EAGER);
							FirefoxProfile fpro = new FirefoxProfile();
							fpro.setPreference("dom.webnotifications.enabled", false);
							dr = new FirefoxDriver();
							dr.get(link);
							break;
							
		}
		
	}
}
