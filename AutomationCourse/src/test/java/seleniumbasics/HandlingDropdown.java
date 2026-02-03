package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown extends Base {
	public void verifyDropdown()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdownmenu1=driver.findElement(By.id("dropdowm-menu-1"));
		Select select=new Select(dropdownmenu1);
	//	select.selectByIndex(1);
	//	select.selectByValue("python");
		select.selectByVisibleText("SQL");	
	}
	
	public void verifyCheckbox()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox=driver.findElement(By.xpath("//input[@value='option-1']"));
		checkbox.click();
	
	}
	
	public void verifyRadiobutton()
	{
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton=driver.findElement(By.xpath("//input[@name='color' and @value='blue']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdown handlingdropdown=new HandlingDropdown();
		handlingdropdown.initializeBrowser();
		// handlingdropdown.verifyDropdown();
		//handlingdropdown.verifyCheckbox();
		handlingdropdown.verifyRadiobutton();
		handlingdropdown.closeWindow();

	}

}
