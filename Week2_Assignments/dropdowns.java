package Week2_Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class dropdowns extends dynamic_browsers {

	public static void main(String[] args) {
		
		browse("chrome","http://www.leafground.com/pages/Dropdown.html");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement dd = null;
		Select d1,d2,d3,d4,d5;
		
		//Select Training Program using Index
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[1]"));
		d1 = new Select(dd);
		d1.selectByIndex(1);
		
		//Select Training Program using Text
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[2]"));
		d2 = new Select(dd);
		d2.selectByVisibleText("Appium");
		
		//Select Training Program using Value
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[3]"));
		d3 = new Select(dd);
		d3.selectByValue("2");
		
		//Get the Number Of Dropdown Option
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[4]"));
		d4 = new Select(dd);
		List<WebElement> l1= d4.getOptions();
		System.out.println("Dropdown Size is:"+l1.size());
		
		for(WebElement e1: l1){
			System.out.println(e1.getText());
		}
				
		//Select value by send keys
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[5]"));
		dd.sendKeys("Selenium");
		
		//Multiselection
		dd = dr.findElement(By.xpath("(//*[@id='contentblock']/section/div/select)[6]"));
		d5 = new Select(dd);
		d5.selectByIndex(2);
		d5.selectByIndex(3);		
		
	}

}
