package Week4.Assignment;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.*;

import com.graphbuilder.curve.Point;

public class Place_item1to4_Assign_3 extends dynamic_browsers {

	public static void main(String[] args) {
				
		// Navigate to page
		browse("chrome","https://jqueryui.com/sortable/");
		
		//Dynamic wait
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement frame1 = dr.findElement(By.xpath("//*[@id='content']/iframe"));
		
		//Go inside frame1
		dr.switchTo().frame(frame1);
		
		// Declare Web Elements		
		WebElement item1 = dr.findElement(By.xpath("//*[@id='sortable']/li[1]"));
		WebElement item5 = dr.findElement(By.xpath("//*[@id='sortable']/li[5]"));
		
		//Declare Actions class object
		Actions act = new Actions(dr);
		
		//Relocate Item1 to Item4
		System.out.println(item5.getLocation());
		org.openqa.selenium.Point p =  item5.getLocation();
		System.out.println(p.getX());
		System.out.println(p.getY());
		
		act.dragAndDropBy(item1, p.getX(), p.getY()).perform();

		//dr.quit();

	}

}
