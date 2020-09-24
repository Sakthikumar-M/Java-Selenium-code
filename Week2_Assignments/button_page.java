package week2.Assignments.Assign1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class button_page {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		
		ChromeDriver dr = new ChromeDriver(opt);
		dr.get("http://leafground.com/pages/Button.html");
		
		List<WebElement>lst = new ArrayList<WebElement>();
		lst.add(dr.findElement(By.xpath("//*[@id='home']")));
		lst.add(dr.findElement(By.xpath("//*[@id='position']")));
		lst.add(dr.findElement(By.xpath("//*[@id='color']")));
		lst.add(dr.findElement(By.xpath("//*[@id='size']")));
		
		WebElement b1,b2,b3,b4;
		
		b1 = lst.get(0);
		b2 = lst.get(1);
		b3 = lst.get(2);
		b4 = lst.get(3);
		
		//Find position of button (x,y)
		Point loc = b2.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println("Button Position: ("+x+","+y+")");
		
		//Find button color
		String color = b3.getAttribute("style");
		System.out.println("Button Color is: "+color);
		
		//Find the height and width
		System.out.println("Size of the button: "+b4.getSize());
		
		//Click button to travel home page
		b1.click();

	}

}
