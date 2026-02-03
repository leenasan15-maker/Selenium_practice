package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends Base {
	public void verifyWebElementCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement textbox=driver.findElement(By.id("single-input-field"));
		//System.out.println(textbox.isDisplayed());
		textbox.sendKeys("Hi");
		WebElement showmessagebutton=driver.findElement(By.id("button-one"));
		System.out.println(showmessagebutton.isDisplayed());
		System.out.println(showmessagebutton.isEnabled());
		showmessagebutton.click();
		WebElement yourmessage=driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText());
		System.out.println(yourmessage.getTagName());
		System.out.println(showmessagebutton.getCssValue("background-color"));
		textbox.clear();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands webelementcommands= new WebElementCommands();
		webelementcommands.initializeBrowser();
		webelementcommands.verifyWebElementCommands();
		webelementcommands.closeWindow();

	}

}
