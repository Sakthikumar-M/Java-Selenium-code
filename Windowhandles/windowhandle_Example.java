package Windowhandles;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WindowType;

public class windowhandle_Example extends dynamic_browsers {

	public static void main(String[] args) throws Throwable {
		
			browse("chrome", "https://www.naukri.com");
			Set<String> s1 = dr.getWindowHandles();
			//Iterator<String> it = s1.iterator();
			
			//new tab creation
			dr.switchTo().newWindow(WindowType.TAB);
			dr.get("https://www.google.com");
			
			List<String> l1 = new ArrayList<String>(s1);			
			
			//Switch the control to main window
			//dr.switchTo().window(l1.get(0));
			//or below command will switch control to main window
			dr.switchTo().defaultContent();
			
			Thread.sleep(5000);
			for (int i = 1; i < l1.size(); i++) {
				dr.switchTo().window(l1.get(i));
				dr.close();
			}
	}

}
