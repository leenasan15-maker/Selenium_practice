package seleniumbasics;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	public void verifymultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String parentid=driver.getWindowHandle();
	    WebElement clickme=driver.findElement(By.xpath("//a[text()='Click Here']"));
	    clickme.click();
	    Set<String> handleids=driver.getWindowHandles();
	    Iterator<String> it=handleids.iterator();
	    while(it.hasNext())
	    {
	    	String currentid=it.next();
	    	if(!currentid.equals(parentid))
	    	{
	    		driver.switchTo().window(currentid);
	    		 WebElement emailid=driver.findElement(By.name("emailid"));
	    		 emailid.sendKeys("xyz@abc.com");
	    		 WebElement submit=driver.findElement(By.name("btnLogin"));
	    		 submit.click();   		 
	    	}
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultipleWindowHandling multiplewindowhandling=new MultipleWindowHandling();
		multiplewindowhandling.initializeBrowser();
		multiplewindowhandling.verifymultipleWindow();
		multiplewindowhandling.closeWindow();

	}

}
