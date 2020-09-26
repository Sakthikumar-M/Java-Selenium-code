package Week2_Assignments;

import org.openqa.selenium.By;


public class Delete_Lead extends Edit_Lead {
	
	static String lead_id;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		login();
		find_Lead();
		lead_search();
		select_record();
		delete_and_confirm();
		dr.quit();
		
	}

	public static void lead_search(){
		dr.findElement(By.xpath("(//*[@class='x-tab-strip-text '])[2]")).click();
		dr.findElement(By.xpath("//*[contains(@id,'ext-gen') and contains(@name,'phoneNumber')]")).sendKeys("1");
		dr.findElement(By.xpath("(//*[@class='x-panel-btn-td'])[6]/table/tbody/tr/td[2]")).click();
	}
	
	public static void select_record() throws InterruptedException{
		Thread.sleep(5000);
		//lead_no
		lead_id = dr.findElement(By.xpath("((//*[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a)[1]")).getText();
		//Select Record text
		dr.findElement(By.xpath("((//*[@class='x-grid3-row-table'])[1]/tbody/tr/td/div/a)[1]")).click();
	}
	
	public static void delete_and_confirm() throws Throwable {
				//delete Record				
				dr.findElement(By.xpath("(//*[@class='frameSectionExtra'])[2]/a[4]")).click();
				//click find leads
				dr.findElement(By.xpath("//*[@class='shortcuts']/li[3]")).click();
				//LeadID
				dr.findElement(By.xpath("//input[@name='id']")).sendKeys(lead_id);
				//find leads button
				dr.findElement(By.xpath("(//*[@class='x-btn-center'])[7]")).click();
				Thread.sleep(5000);
				String record_check= dr.findElement(By.xpath("//*[@class='x-paging-info']")).getText();
				System.out.println(record_check);
				
				if(record_check.contains("No records")){
					System.out.println("Record is deleted");
				}else
				{
					System.out.println("Record is still exist");
				}

	}
}
