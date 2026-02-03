package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	public void verifyLocators()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		driver.findElement(By.id("button-one"));
		driver.findElement(By.className("btn btn-primary"));
		driver.findElement(By.tagName("button"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Simple Form Demo"));
		driver.findElement(By.partialLinkText("Simple"));
		//tagname[attribute='attribute value']  //css selector
		driver.findElement(By.cssSelector("button[id='button-one']"));	
	// absolute xpath - 	/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button
	// relative xpath - 	//tagname[@attribute='attributevalue']
		driver.findElement(By.xpath("//button[@id='button-one']"));
		//xpath feature --   //tagname[text()='show message']
		driver.findElement(By.xpath("//button[text()='Show Message']"));
		driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div"));
		driver.findElement(By.xpath("//div[@class='card']//descendant::div"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators=new Locators();
		locators.initializeBrowser();
		locators.verifyLocators();
		locators.closeWindow();

	}

}
