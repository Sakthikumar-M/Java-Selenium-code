package Week4.Day2;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Action_Method1 {
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/selectable/");
		
		Actions builder=new Actions(driver);
		driver.switchTo().frame(0);
		
		List<WebElement> itemList = driver.findElementsByXPath("//*[@id='selectable']/li");
		System.out.println(itemList.size());
		
		List <String> lst = new ArrayList<String>();
		
		for(int x = 0;x<itemList.size();x++){
			lst.add("//*[@id='selectable']/li["+(x+1)+"]");
			System.out.println(lst.get(x));
		}
				
		for (int i = 0; i < lst.size(); i++) 
		{
			if(i%2==0)
			{
				WebElement itemLists = driver.findElementByXPath(lst.get(i));
				System.out.println(itemLists.getText());
				Thread.sleep(5000);
				builder.keyDown(Keys.CONTROL).click(itemLists).build().perform();
				if(i==7){
					break;
				}else{
				builder.keyUp(Keys.CONTROL).build().perform();
				}
			}
		}		

	}

}
