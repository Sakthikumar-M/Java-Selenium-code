package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import leaftaps.dynamic_browsers;

public class day8_Selenium_flipkart extends dynamic_browsers {

	RemoteWebDriver dr = null;

	@Test
	public void flipkart() throws Throwable {
		navigate_to("https://www.flipkart.com");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		search_for("Home Theater");
		high_low();

	}

	private void high_low() throws Throwable {
		WebElement highlow = dr.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div/div[2]//div[4]");
		highlow.click();
		Thread.sleep(3000);
		String font_size = highlow.getCssValue("font-weight");
		String font_clr = highlow.getCssValue("color");
		System.out.println(font_clr +" ---- "+ font_size);
		
	}

	public void navigate_to(String website) {
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions opt = new FirefoxOptions();
		opt.addPreference("dom.webnotifications.enabled", false);
		dr = new FirefoxDriver(opt);
		dr.manage().window().maximize();
		dr.get(website);
		dr.findElementByXPath("/html/body/div[2]/div/div/button").click();
	}

	public void search_for(String search_item) {
		WebElement search_field, search;
		search_field = dr.findElementByXPath("//div[@id='container']//input");
		search_field.sendKeys(search_item);
		search = dr.findElementByXPath("//div[@id='container']//button");
		search.click();
		// results = dr.findElementsByXPath("//*[@class='_3O0U0u']/div");
		// System.out.println("Total Search Results: "+results.size());

		String total_products_before = dr.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/span").getText();
		WebElement rate = dr.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[1]/div[2]/div/div/section[6]/div[2]/div/div[1]/div/div/label/div[2]");
		rate.click();
		String total_products_after = dr.findElementByXPath("//*[@id='container']/div/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/span").getText();
		total_prod_compare(total_products_before, total_products_after);
	}

	public void total_prod_compare(String before, String after) {

		int a = 0, b = 0, j = 0;
		String x, y;
		String[] arr1 = before.split(" ");
		String[] arr2 = after.split(" ");

		for (int i = 0; i < arr1.length; i++) {

			if (!arr1[i].equals(arr2[j])) {
				x = arr1[i].replaceAll(",", "");
				a = Integer.parseInt(x);
				y = arr2[j].replaceAll(",", "");
				b = Integer.parseInt(y);
				System.out.println("a = " + x + " and b = " + b);
			}
			j++;
		}

		if (a > b) {
			System.out.println("Value1 = " + a + " is greater than Value2 =" + b);
			System.out.println("Result count reduced After the filter");
		} else {
			System.out.println("Value1 is less than value2");
			System.out.println("Result count equals After the filter");
		}

	}

}
