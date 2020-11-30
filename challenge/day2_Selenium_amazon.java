package challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day2_Selenium_amazon {

	public static RemoteWebDriver dr = null;

	@Test
	public void chairs() throws Throwable {
		browse("https:\\www.amazon.in");
		do_search("Furniture", "chairs for computer table");
		Thread.sleep(2000);
		find_name();
	}

	public void browse(String website) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		opt.addArguments("--disable-notifications");
		opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		dr = new ChromeDriver(opt);
		dr.get(website);
	}

	public void do_search(String ddvalue, String search_criteria) {
		WebElement ddelement = dr.findElementById("searchDropdownBox");
		Select dropdown = new Select(ddelement);
		dropdown.selectByVisibleText(ddvalue);
		WebElement search_field = dr.findElementById("twotabsearchtextbox");
		search_field.sendKeys(search_criteria);
		WebElement search = dr.findElementByXPath("//*[@id='nav-search-submit-text']/input");
		search.click();
	}

	public void find_name() throws Throwable {
		List<WebElement> lst1 = dr.findElementsByXPath("//*[@class='a-size-base-plus a-color-base a-text-normal']");
		String x, y;
		System.out.println(lst1.size());

		List<WebElement> lst2 = dr.findElementsByXPath("//span[@class='a-price-whole']");
		List<Integer> price_list = new ArrayList<Integer>();

		for (int i = 0; i < lst2.size(); i++) {
			x = lst2.get(i).getText();
			y = x.replaceAll(",", "");
			price_list.add(Integer.parseInt(y));
		}

		for (Integer price : price_list) {
			System.out.println(price);
		}

		Collections.sort(price_list);
		int size = price_list.size() - 1;
		int bigger = price_list.get(size);
		System.out.println("Highest Chair Price is : " + bigger);

		String val = Integer.toString(bigger);
		int check = val.length() - 3;
		String a = val.substring(0, check);
		String b = val.substring(check);
		String text = String.join(",", a, b);
		System.out.println(text);
		// dr.findElementByXPath("(//span[contains(text(),"+'"'+text+'"'+")])[1]/preceding::span[2]").click();
		Thread.sleep(4000);
		dr.findElementByXPath("(//span[contains(text()," + "'" + text + "'" + ")])[1]/preceding::img[1]").click();
		Thread.sleep(8000);
		dr.findElementByXPath("(//*[@id='acrCustomerReviewText'])[1]").click();
		Thread.sleep(4000);
		String rating = dr
				.findElementByXPath("//*[@id='reviewsMedley']/div/div[1]/div[2]/div[1]/div/div[2]/div/span/span")
				.getText();
		System.out.println(rating);

		/*
		 * Thread.sleep(4000); Set<String> pop = dr.getWindowHandles(); Iterator<String>
		 * iter = pop.iterator(); dr.switchTo().window(iter.next());
		 * System.out.println(dr.getTitle());
		 */

		// String rating =
		// dr.findElementByXPath("//*[contains(@id,'a-popover-content')]/div/div/div/div/i/span").getText();
		// System.out.println(rating);

		/*
		 * for(int j=0;j<lst1.size();j++) { System.out.println(lst1.get(j).getText()+
		 * "======" +lst2.get(j).getText()); }
		 */

		// System.out.println(price_list.size());

		/*
		 * for (Integer price : price_list) { System.out.println(price);
		 * System.out.println(); }
		 */

	}

	@AfterTest
	public void close() {
		dr.quit();
	}

}
