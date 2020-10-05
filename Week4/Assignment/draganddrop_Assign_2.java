package Week4.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class draganddrop_Assign_2 extends dynamic_browsers {

	public static void main(String[] args) {
			
		//navigate to the webpage
		browse("chrome", "https://jqueryui.com/droppable/");
		
		//Declare webelements for Frame 
		WebElement frame1 = dr.findElement(By.xpath("//*[@id='content']/iframe"));
		
		//go inside the frame
		dr.switchTo().frame(frame1);
		
		//Declare source and target components
		WebElement source1 = dr.findElement(By.xpath("//*[@id='draggable']"));
		WebElement target1 = dr.findElement(By.xpath("//*[@id='droppable']"));
		
		//Declare Action class object
		Actions act = new Actions(dr);		
		
		//perform Drag and Drop
		act.dragAndDrop(source1, target1).build().perform();
		
	}

}
