package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclickme=driver.findElement(By.id("alertButton"));
		simpleclickme.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmclickme=driver.findElement(By.id("confirmButton"));		
		confirmclickme.click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptclickme=driver.findElement(By.id("promtButton"));	
		promptclickme.click();
		Alert alert=driver.switchTo().alert();
	    alert.sendKeys("hi, hello..");
	    alert.accept();
     	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling alerthandling=new AlertHandling();
		alerthandling.initializeBrowser();
		//alerthandling.verifySimpleAlert();
		//alerthandling.verifyConfirmAlert();
		alerthandling.verifyPromptAlert();
		alerthandling.closeWindow();

	}

}
