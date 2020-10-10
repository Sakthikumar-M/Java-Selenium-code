package Week4_Assignment;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Week2_Assignments.dynamic_browsers;

public class windows extends dynamic_browsers {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		browse("chrome", "http://leafground.com/pages/Window.html");
		Set<String> s1 = new HashSet<String>();
		List<String> l1 = new ArrayList<String>();
		List<WebElement> button = dr.findElements(By.xpath("//button"));
		
		for (int i = 0; i < button.size(); i++) {
			
			button.get(i).click();
			if(i==0){
				System.out.println("Open Home Page");					
			}else if(i==1){
				System.out.println("Open Multiple Windows");
			}
			else if(i==2){
				System.out.println("Close All Except home window");
			}else if(i==3){
				System.out.println("Wait for 5 seconds");
			}
			button(s1,l1);
		}
		
		dr.quit();
	}
	
	private static void button(Set<String> s1, List<String> l1) throws Throwable {
		Thread.sleep(3000);
		s1 = dr.getWindowHandles();
		System.out.println("No of windows opened "+s1.size());
		l1.addAll(s1);
		for (int i = 1; i < l1.size(); i++) {
			dr.switchTo().window(l1.get(i)).close();
		}
		dr.switchTo().window(l1.get(0));
		s1.clear();
		l1.clear();
	}
}
