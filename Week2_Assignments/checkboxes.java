package Week2_Assignments;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class checkboxes extends dynamic_browsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		browse("chrome","http://www.leafground.com/pages/checkbox.html");
		
		List<WebElement> l1 = dr.findElements(By.xpath("//*[@class='example']/div/input/."));
		/*for(WebElement e: l1)
		System.out.println(e);*/
		
		//Select the languages that you know
		l1.get(0).click();
		l1.get(1).click();
		l1.get(2).click();
		
		//Confirm Selenium is checked
		boolean b = l1.get(5).isSelected();
		if(b==true){
			System.out.println("Selenium checkbox is checked");
		}else{
			System.out.println("Selenium Unchecked");
		}
		
		//DeSelect only checked
		boolean f1 = l1.get(6).isSelected();
		boolean f2 = l1.get(7).isSelected();
		
		if(f1==true){
			l1.get(6).click();
		}else if(f2==true){
			l1.get(7).click();
		}
		
		//Select all below checkboxes
		l1.get(8).click();
		l1.get(9).click();
		l1.get(10).click();
		l1.get(11).click();
		l1.get(12).click();
		
	}
		
}
