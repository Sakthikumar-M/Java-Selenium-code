package Week4_Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Week2_Assignments.dynamic_browsers;

public class frames extends dynamic_browsers {

	public static void main(String[] args) throws Throwable {
		
		browse("chrome","http://leafground.com/pages/frame.html");
		Thread.sleep(5000);
		List<WebElement> l1 = dr.findElements(By.tagName("iframe"));
		
		dr.switchTo().frame(l1.get(0));
		System.out.println();
		System.out.println(dr.findElement(By.tagName("body")).getText());
		dr.findElement(By.xpath("//*[@id='Click']")).click();
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame(l1.get(1));
		l1.add(dr.findElement(By.xpath("//*[@id='frame2']")));
		dr.switchTo().frame(0);
		System.out.println();
		System.out.println(dr.findElement(By.tagName("body")).getText());
		dr.findElement(By.xpath("//*[@id='Click1']")).click();
		dr.switchTo().defaultContent();
		
		dr.switchTo().frame(l1.get(2));
		l1.add(dr.findElement(By.xpath("//*[@id='frame2']")));
		dr.switchTo().frame(0);
		System.out.println();
		System.out.println(dr.findElement(By.tagName("body")).getText());
		
		System.out.println(l1.size());
	}

}
