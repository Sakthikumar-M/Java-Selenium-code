package Week2_Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Create_Account {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver dr = new ChromeDriver();
		dr.get("http://leaftaps.com/opentaps/control/login");
		dr.findElementById("username").sendKeys("demosalesmanager");
		dr.findElementById("password").sendKeys("crmsfa");
		dr.findElementByClassName("decorativeSubmit").click();
		dr.findElementByClassName("crmsfa").click();
		dr.findElementByClassName("sectionTabButtonSelected").click();
		dr.findElementByLinkText("Create Account").click();
		dr.findElementById("accountName").sendKeys("Test Company");
		dr.findElementByName("description").sendKeys("Selenium Automation Tester");
		dr.findElementByName("groupNameLocal").sendKeys("Grp_local");
		dr.findElementByName("officeSiteName").sendKeys("Office Site");
		dr.findElementByName("annualRevenue").sendKeys("1000000");
		
		
		
		WebElement Industry = dr.findElementByName("industryEnumId");
		Select Industry_dd = new Select(Industry);
		Industry_dd.selectByVisibleText("Computer Software");
		
		WebElement owner = dr.findElementByName("ownershipEnumId");
		Select owner_dd = new Select(owner);
		owner_dd.selectByVisibleText("S-Corporation");
		
		WebElement src = dr.findElementByName("dataSourceId");
		Select src_dd = new Select(src);
		src_dd.selectByVisibleText("Employee");
		
		WebElement mkt = dr.findElementById("marketingCampaignId");
		Select mkt_dd = new Select(mkt);
		mkt_dd.selectByVisibleText("eCommerce Site Internal Campaign");
		
		WebElement state = dr.findElementById("generalStateProvinceGeoId");
		Select state_dd = new Select(state);
		state_dd.selectByVisibleText("Texas");
		
		dr.findElementByClassName("smallSubmit").click();
		
		
	}

}
