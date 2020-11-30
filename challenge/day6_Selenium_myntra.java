package challenge;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class day6_Selenium_myntra {

	public RemoteWebDriver dr;

	@Test
	public void myntra() throws Throwable {
		open_incognito();
		window_dim();
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		do_search();
		mouseover();
		sim_products_listsize();
		close_incognito();
	}

	public void open_incognito() {
		DesiredCapabilities dcap = new DesiredCapabilities();
		ChromeOptions copt = new ChromeOptions();
		copt.addArguments("--start-maximized");
		copt.addArguments("--disable-notifications");
		copt.addArguments("incognito");
		dr = new ChromeDriver(copt);
		dr.get("https://www.myntra.com");
	}

	public void window_dim() {
		Dimension screensize = Toolkit.getDefaultToolkit().getScreenSize();
		double hite = screensize.getHeight();
		double width = screensize.getWidth();
		// call the values using methods
		System.out.println("------------------Windows Dimentions are-----------------");
		System.out.println("Window Height is :" + hite);
		System.out.println("Window Width is :" + width);
		/*
		 * // call the values using direct variables System.out.println("Height" +
		 * screensize.height); System.out.println("Width" + screensize.width);
		 */
	}

	private void do_search() throws Throwable {
		WebElement Search_box = dr.findElementByXPath("//header[@id='desktop-header-cnt']//input");
		String enter_key = Keys.chord(Keys.ENTER);
		Search_box.sendKeys("Sunglasses", enter_key);
		WebElement brand_search = dr.findElementByXPath("(//*[@Class='myntraweb-sprite filter-search-iconSearch sprites-search'])[1]");
		WebElement brand_search_txt = dr.findElementByXPath("(//*[@Class='myntraweb-sprite filter-search-iconSearch sprites-search'])[1]/../input");
		brand_search.click();
		brand_search_txt.sendKeys("Polaroid");
		WebElement check_box = dr.findElementByXPath("//*[@class='brand-list']/li/label");
		check_box.click();
		Thread.sleep(3000);
		WebElement men = dr.findElementByXPath("//*[@class='gender-list']/li[1]/label");
		men.click();
		Thread.sleep(3000);
		WebElement type = dr.findElementByXPath("//*[@class='atsa-filters']/li[8]");
		type.click();
		Thread.sleep(3000);
		WebElement type_values = dr.findElementByXPath("//*[@class='atsa-filters']/li[8]//span");
		type_values.click();
		Thread.sleep(3000);
		WebElement rect = dr.findElementByXPath("//*[@class='atsa-atsaFiltersOptionCtn atsa-atsaShowContainer']//li[5]/label/div");
		rect.click();
		Thread.sleep(3000);
		List<WebElement> products = dr.findElementsByXPath("//*[@class='results-base']/li");
		int size = products.size();
		System.out.println("Product List size is : "+(size-1));
	}

	public void mouseover() {
		Actions act = new Actions(dr);
		WebElement first_prod = dr.findElementByXPath("//*[@class='results-base']/li[1]//img");
		Action mouseover = act.moveToElement(first_prod).build();
		mouseover.perform();
	}
	
	
	public void sim_products_listsize() {
		WebElement view_similar = dr.findElementByXPath("//*[@class='results-base']/li[1]/div[3]/span");
		view_similar.click();
		List<WebElement> sim_products = dr.findElementsByXPath("//*[@class='results-base results-similarGrid']/li");
		System.out.println("Total No of Similar Products are : "+sim_products.size());
		dr.findElementByXPath("//*[@class='halfcard-paddedHeader']//span").click();
		
	}
	
	public void close_incognito() throws Throwable {
		Thread.sleep(5000);
		dr.quit();
	}

}
