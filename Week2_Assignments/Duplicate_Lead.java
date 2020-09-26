package Week2_Assignments;

import org.openqa.selenium.By;

public class Duplicate_Lead extends Delete_Lead{

	static String lead_name;
	
	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		login();
		find_Lead();
		search_Lead_by_email();
		select_record();
		duplicate();
		create_Lead();
		dr.quit();
	}
	
	private static void create_Lead() throws Throwable {
		//LeadName
		lead_name = dr.findElement(By.xpath("(//*[@name='companyName'])[2]")).getAttribute("value");
		dr.findElement(By.xpath("//*[@name='submitButton']")).click();
		String lead_dup = dr.findElement(By.xpath("//*[@id='viewLead_companyName_sp']")).getText();
		Thread.sleep(5000);
		System.out.println("Lead Name is:"+lead_name);
		System.out.println("Lead dup Name is:"+lead_dup);
		if(lead_dup.contains(lead_name)){			
			System.out.println("Lead Name Matching");
		}else{
			System.out.println("Lead Name Not Matching");
		}
	}

	public static void search_Lead_by_email() {
		dr.findElement(By.xpath("(//*[contains(@class,'x-tab-strip-text ')])[3]")).click();
		dr.findElement(By.xpath("//*[@name='emailAddress']")).sendKeys("@gmail.com");
		dr.findElement(By.xpath("(//*[@class='x-panel-btn-td'])[6]/table/tbody/tr/td[2]")).click();
	}
	
	public static void duplicate()throws Throwable{
		dr.findElement(By.xpath("(//*[@class='frameSectionExtra'])[2]/a[1]")).click();
		String text1 = dr.findElement(By.xpath("//*[@id = 'sectionHeaderTitle_leads']")).getText();
		Thread.sleep(5000);
		if(text1.contains("Duplicate Lead")){
			System.out.println("Page Title matching");
		}else{
			System.out.println("Page Title Mismatch");
		}
	}
}
