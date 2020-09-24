package week2.Assignments.Assign1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.html5.WebStorage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editpage {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--start-maximized");
		
		ChromeDriver dr = new ChromeDriver(opt);
		dr.get("http://leafground.com/pages/Edit.html");
		
		
		
		  List<WebElement> l1 = new ArrayList<WebElement>();
		  l1.add(dr.findElement(By.xpath("//*[@id='contentblock']/section/div[1]/div/div/input")));
		  l1.add(dr.findElement(By.xpath("//*[@id='contentblock']/section/div[2]/div/div/input")));
		  l1.add(dr.findElement(By.xpath("//*[@id='contentblock']/section/div[3]/div/div/input")));
		  l1.add(dr.findElement(By.xpath("//*[@id='contentblock']/section/div[4]/div/div/input")));
		  l1.add(dr.findElement(By.xpath("//*[@id='contentblock']/section/div[5]/div/div/input")));
		 
				
		
		  WebElement email = l1.get(0);
		  WebElement append = l1.get(1);
		  WebElement text1 = l1.get(2);
		  WebElement clear_txt = l1.get(3); 
		  WebElement disable_txt = l1.get(4);
		  
		  //Enter your email address 
		  email.sendKeys("sample@gmail.com");
		  
		  //Append a text and press keyboard tab
		  append.sendKeys(append.getText()+"word2");
		  
		  //Get default text entered 
		  System.out.println(text1.getAttribute("value"));
		  
		  //Clear the text 
		  clear_txt.clear();
		  
		  //Confirm that edit field is disabled 
		  boolean status = disable_txt.isEnabled(); if(status==true) {
		  System.out.println("Text box is Enabled"); }else {
		  System.out.println("Text box is Disabled"); }
		 
			
		
	}

}
