package Week2_Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Single_Script.dynamic_browsers;

public class Hyperlink extends dynamic_browsers {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		browse("chrome","http://leafground.com/pages/Link.html");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		List<WebElement> li = dr.findElements(By.xpath("//*[@id='contentblock']/section//a"));
		
		List<String> li1 = new ArrayList<String>();
		String n1 = "(//*[@id='contentblock']/section//a)[";
		String n2 = "]";
		for(int i=1;i<=li.size();i++){
			li1.add(n1+i+n2);
		}
			
		//Goto Home page
		WebElement b1 = dr.findElement(By.xpath(li1.get(0)));
		b1.click();
		
		//Where I am supposed to go without clicking me
		WebElement link = dr.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/./a"));
		link.click();
		WebElement b2 = dr.findElement(By.xpath(li1.get(1)));
		System.out.println("Where I am supposed to go - is:"+b2.getAttribute("href"));
		
		//Verify am I broken
		WebElement b3 = dr.findElement(By.xpath(li1.get(2)));
		b3.click();
		String title = dr.getTitle();
		
		if(title.contains("HTTP Status 404")){
			System.out.println("the navigated page is broken");
			dr.navigate().to("http://leafground.com/pages/Link.html");
		}else{
			System.out.println("The page is Active");
			dr.navigate().to("http://leafground.com/pages/Link.html");
		}		
		
		//Goto Home Page (interact with the same link name)
		WebElement b4 = dr.findElement(By.xpath(li1.get(3)));
		b4.click();
		WebElement x = dr.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[3]/./a"));
		x.click();
		
		
		//No of Links		
		System.out.println("Total no of link on the page is :"+li1.size());
		
		/*for(Iterator it = li1.iterator();it.hasNext();){
			System.out.println(it.next());
		}*/
		
		System.out.println( "Below are the Links");
		for(String e:li1){
			System.out.println(e);
		}
		
		
	}

}
