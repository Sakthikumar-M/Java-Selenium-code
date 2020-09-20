package Week2_Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLEad {
	
	public static void main(String args[]){
	
		//WebDriverManager.chromedriver().setup();
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.findElementById("username").sendKeys("demosalesmanager");
		dr.findElementById("password").sendKeys("crmsfa");
		dr.findElementByClassName("decorativeSubmit").click();
		dr.findElementByClassName("crmsfa").click();
		dr.findElementByClassName("sectionTabButtonSelected").click();
		dr.findElementByLinkText("Create Lead").click();
		dr.findElementById("createLeadForm_companyName").sendKeys("Test Company");
		dr.findElementById("createLeadForm_firstName").sendKeys("FirstName1");
		dr.findElementById("createLeadForm_lastName").sendKeys("LastName1");
		
		WebElement source = dr.findElementById("createLeadForm_dataSourceId");
		Select src_dd = new Select(source);
		src_dd.selectByVisibleText("Employee");
		
		WebElement mk_camp = dr.findElementById("createLeadForm_marketingCampaignId");
		Select merk_dd = new Select(mk_camp);
		merk_dd.selectByVisibleText("Pay Per Click Advertising");
		
		WebElement indus = dr.findElementById("createLeadForm_industryEnumId");
		Select indus_dd = new Select(indus);
		indus_dd.selectByVisibleText("Telecommunications");
		
		WebElement owner = dr.findElementById("createLeadForm_ownershipEnumId");
		Select owner_dd = new Select(owner);
		owner_dd.selectByVisibleText("Corporation");
		
		WebElement ctry = dr.findElementById("createLeadForm_generalCountryGeoId");
		Select ctry_dd = new Select(ctry);
		ctry_dd.selectByVisibleText("India");
		
		dr.findElementByName("submitButton").click();
		String title = dr.findElementById("sectionHeaderTitle_leads").getText();
		System.out.println("Title is :" +title);
		}
}
