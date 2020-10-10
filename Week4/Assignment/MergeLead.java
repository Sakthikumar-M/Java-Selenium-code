package Week4_Assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Week2_Assignments.Edit_Lead;

public class MergeLead extends Edit_Lead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		login();
		MergeLeadspage();
	}

	public static void MergeLeadspage() {
		dr.findElement(By.xpath("//li[@class='sectionTabButtonUnselected'][1]")).click();
		dr.findElement(By.xpath("//*[@class='shortcuts']/li[4]")).click();
		
		WebElement fromlead = dr.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[1]"));
		WebElement tolead = dr.findElement(By.xpath("(//table[@class='twoColumnForm']//a)[2]"));
		WebElement leadid = dr.findElement(By.xpath("//*[@id='ext-gen25']"));
		WebElement find_lead = dr.findElement(By.xpath("//*[@id='ext-gen114']"));		
		WebElement searchresult = dr.findElement(By.xpath("//*[@id='ext-gen306']"));
		
		
		fromlead.click();
		Set<String> from = dr.getWindowHandles();
		java.util.List<String> ls = new ArrayList<String>(from);
		dr.switchTo().window(ls.get(1));		
		leadid.sendKeys("10036");
		find_lead.click();
		searchresult.click();
		}

}
