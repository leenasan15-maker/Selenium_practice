package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base{
	public void verifyFileUploadUsingSendKeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.id("uploadfile_0"));
		choosefile.sendKeys("C:\\Users\\Hai\\eclipse-workspace\\AutomationCourse\\src\\test\\resources\\Core Java Checklist .pdf");
		WebElement checkbox=driver.findElement(By.id("terms"));
		checkbox.click();
		WebElement submit=driver.findElement(By.id("submitbutton"));
		submit.click();
	}
	
	public void verifyFileUploadUsingRobotClass() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement fileselect=driver.findElement(By.id("pickfiles"));
		fileselect.click();
		StringSelection select=new StringSelection("C:\\Users\\Hai\\eclipse-workspace\\AutomationCourse\\src\\test\\resources\\Sample.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(select, null);
	    Robot r=new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFileUpload handlingfileupload=new HandlingFileUpload();
		handlingfileupload.initializeBrowser();
		//handlingfileupload.verifyFileUploadUsingSendKeys();
		try {
			handlingfileupload.verifyFileUploadUsingRobotClass();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handlingfileupload.closeWindow();

	}

}
