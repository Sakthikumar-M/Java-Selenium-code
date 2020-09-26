package Week2_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Single_Script.dynamic_browsers;

public class dropdown_value extends dynamic_browsers {

	public static void main(String[] args) {
		
		browse("chrome","https://www.irctc.co.in/nget/train-search");
		
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String button="/html/body/app-root/app-home/div[1]/app-header/p-dialog[2]/div/div[2]/div/form/div[2]/button";
		String to = "//*[@id='destination']/span/input";
		String cities = "//*[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-star-inserted']/li";
		
		dr.findElement(By.xpath(button)).click();
		dr.findElement(By.xpath(to)).click();
		dr.findElement(By.xpath(to)).sendKeys("e");
		//System.out.println("Size of the list is: "+dr.findElement(By.xpath(cities)).);
		int size = cities.length();
		
		System.out.println("drropdown size is: "+size);
		
		String x = "//*[@class='ui-autocomplete-items ui-autocomplete-list ui-widget-content ui-widget ui-corner-all ui-helper-reset ng-star-inserted']/li[";
		String y = "]";
		
		WebElement n = null;
		
		// selecting x and y co-ordinate position using point class
		
		/*WebElement element = driver.findElement(By.id("hplogo"));
		  
		  Point location = element.getLocation();
		  int x = location.getX();
		  int y = location.getY();
		  System.out.println("Coordinates of an element is : " + x + " and " + y);*/
		
		
		for(int i=1;i<size;i++){
			n = dr.findElement(By.xpath(x+i+y));
			if(n.getText().contains("ERANIEL"))
			{
				n.click();
				break;
			}
		}
		
		
		
	}
		

}
