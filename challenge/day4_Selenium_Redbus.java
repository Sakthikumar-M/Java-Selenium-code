package challenge;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day4_Selenium_Redbus {

	public RemoteWebDriver dr = null;

	@Test
	public void redbus() throws Throwable {
		String website = "https://www.redbus.in";
		browse(website);
		search();
		Thread.sleep(5000);
		list_of_buses();

	}

	public void list_of_buses() {
		List<WebElement> buses = dr.findElementsByXPath("//*[@class='bus-items']/div");
		System.out.println("Total Buses are : " + buses.size());
	}

	public void search() throws Throwable {

		// Pass value "To" Field
		WebElement to_field = dr.findElementById("dest");
		to_field.sendKeys("Bangalore (All Locations)");
		Thread.sleep(4000);

		// Pass value "From" Field
		String from_value = Keys.chord(Keys.SHIFT, Keys.TAB, "Chennai (All Locations)");
		to_field.sendKeys(from_value);
		Thread.sleep(4000);
		dr.findElementById("onward_cal").click();

		// Select Next Month First Monday Date
		String button = "//*[@id='rb-calendar_onward_cal']/table//tr[1]/td[3]/button";
		dr.findElementByXPath(button).click();
		List<WebElement> cal = dr.findElementsByXPath("//th[contains(text(),'Mo')]/following::tr/td[1]");
		List<String> val = new ArrayList<String>();

		// Select the date values except space
		for (WebElement lst : cal) {
			if (!lst.getText().isEmpty()) {
				val.add(lst.getText());
			}
		}
		String first_monday = val.get(0);
		System.out.println("First Monday Date is : " + first_monday);

		// Select first monday from calender
		for (WebElement values : cal) {
			if (values.getText().equals(first_monday)) {
				values.click();
			}
		}

		// Search button click
		Thread.sleep(4000);
		dr.findElementById("search_btn").click();

	}

	public void browser_version() {
		String version = dr.getCapabilities().getVersion();
		String bro_name = dr.getCapabilities().getBrowserName();
		String platform = dr.getCapabilities().getPlatform().name();
		System.out.println("Browser Name :" + bro_name + "   Version is : " + version + "   Platform is:  " + platform);
	}

	public void browse(String website) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions opt = new EdgeOptions();
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-notifications");
		dr = new EdgeDriver(opt);
		browser_version();
		dr.get(website);
	}

	@AfterTest
	public void close() throws Throwable {
		Thread.sleep(6000);
		dr.quit();
	}

}
