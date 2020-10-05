package Week4.Assignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_Assign_1 {

	public static void main(String[] args) {
		
		 WebDriverManager.chromedriver().setup();
		  
		  ChromeOptions opt = new ChromeOptions();
		  //Maximize window
		  opt.addArguments("--start-maximized");
		  ChromeDriver dr = new ChromeDriver(opt);
		  
		  dr.get("http://leafground.com/pages/table.html");
		  
		  List <WebElement> lst= new ArrayList<WebElement>();
		  List <String> data= new ArrayList<String>();
		  List <Integer> l1 = new ArrayList<Integer>();
		  WebElement w;
		  String s = null;
		  
		//No of Rows in web Table
		  lst = dr.findElementsByXPath("//*[@id='table_id']//tr");
		  int row_size = lst.size();
		  System.out.println("No of Rows" + row_size);
		  lst.clear();
		  
		//No of Columns in web Table
		  lst = dr.findElementsByXPath("//*[@id='table_id']//tr/th");
		  int col_size = lst.size();
		  System.out.println("No of Rows" + col_size);
		  lst.clear();		  
		
		
		  for (int i = 2; i < row_size; i++) {
			for (int j = 1; j < col_size; j++) {
			
				//Selecting "Learn to interact with Elements" Progress
				s = dr.findElementByXPath("//*[@id='table_id']//tr["+i+"]/td["+j+"]").getText();
				
				if(s.equals("Learn to interact with Elements")) {
					s=dr.findElementByXPath("//*[@id='table_id']//tr["+i+"]/td["+(j+1)+"]").getText();
					System.out.println("Learn to interact with Elements Progress is : "+s);
				}
				
				//Adding Progress column values inside data list 
				if(s.contains("%")) {
					data.add(s);
				}
			 }
		 }
		System.out.println();
		
		//Conversion of String to Integer and sorting
		l1 = sorter(data,l1);
		
		//Converting the least value as String
		String s1 = Integer.toString(l1.get(0));
		
		//Selecting checkbox for the least item
		for (Integer lst1 : l1) {
			System.out.println(lst1);
		}
		
		//Check the Vital Task checkbox corresponding to the least completed progress
		 for (int i = 2; i < row_size; i++) {
				for (int j = 1; j < col_size; j++) {
					
					w = dr.findElementByXPath("//*[@id='table_id']//tr["+i+"]/td["+j+"]");
					if(w.getText().contains(s1)) {
						dr.findElementByXPath("//*[@id='table_id']//tr["+i+"]/td["+(j+1)+"]/input").click();
					}
					
				}
		 }
		
		
	}
	
	public static List<Integer> sorter(List<String> data,List<Integer> l1) {
		
		String str,arr[];
		
		
		//Converting String to integer and storing in Integer list
		  for(int i=0;i<data.size();i++) {
			  str = (String) data.get(i);
			  arr=str.split("%");
			  l1.add(Integer.parseInt(arr[0]));
		  }
		  
		  //Sorting the Integer list
		  Collections.sort(l1);
		  return l1;

	}

}
