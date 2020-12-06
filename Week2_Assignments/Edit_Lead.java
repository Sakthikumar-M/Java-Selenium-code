package Week2_Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class Edit_Lead extends dynamic_browsers {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		login();
		find_Lead();
		edit_lead();		
		select_record();
		title_comparision();
		edit_update();
		company_name_update_chk();
		dr.quit();
		
	}
	
	public static void login(){
		browse("chrome","http://leaftaps.com/opentaps/control/main");
		dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		dr.findElement(By.id("username")).sendKeys("demosalesmanager");
		dr.findElement(By.id("password")).sendKeys("crmsfa");
		dr.findElement(By.className("decorativeSubmit")).click();
		dr.findElement(By.linkText("CRM/SFA")).click();
	}
	
	public static void find_Lead(){
		dr.findElement(By.xpath("//li[@class='sectionTabButtonUnselected'][1]")).click();
		dr.findElement(By.xpath("//*[@class='shortcuts']/li[3]")).click();
		
	}
	
	public static void edit_lead(){
		dr.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("test");
		dr.findElement(By.xpath("(//*[@class='x-panel-btn-td'])[6]/table/tbody/tr/td[2]")).click();
	}
	
	public static void select_record() throws InterruptedException{
		Thread.sleep(5000);
		//Select Record text
		dr.findElement(By.xpath("((//*[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a)[1]")).click();
	}
	public static void title_comparision() throws Throwable{
		Thread.sleep(5000);
		String title = dr.findElement(By.xpath("//*[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println(title);
		Thread.sleep(5000);
		if(title.contains("View Lead")){
			System.out.println("Title matched");
		}else{
			System.out.println("Title Mismatch"+title);
		}
	}
	public static void edit_update(){
		dr.findElement(By.xpath("//*[@class='frameSectionExtra']/a[3]")).click();
		dr.findElement(By.xpath("(//*[@name='companyName'])[2]")).clear();
		dr.findElement(By.xpath("(//*[@name='companyName'])[2]")).sendKeys("Testing Changes");
		dr.findElement(By.xpath("(//*[@name='submitButton'])[1]")).click();
	}
	public static void company_name_update_chk() throws Throwable{
		String updated_name = dr.findElement(By.xpath("//*[@id='viewLead_companyName_sp']")).getText();
		System.out.println(updated_name);
		Thread.sleep(5000);
		if(updated_name.contains("Testing Changes")){
			System.out.println("Updated title is displayed");
		}else{
			System.out.println("Updated title is not displayed");
		}
	}

}
