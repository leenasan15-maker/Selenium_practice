package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base{
	public void verifyRightClick()
	{
	WebElement others=driver.findElement(By.id("others"));
	Actions actions=new Actions(driver);
	actions.contextClick(others).build().perform();	
	}
	public void verifyMouseOver()
	{
		WebElement others=driver.findElement(By.id("others"));
		Actions actions=new Actions(driver);
		actions.moveToElement(others).build().perform();
	}
	public void verifyDoubleClick()
	{
	WebElement others=driver.findElement(By.id("others"));
	Actions actions=new Actions(driver);
	actions.doubleClick(others).build().perform();	
	}
	public void verifyDragandDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drageme=driver.findElement(By.id("draggable"));
		WebElement drophere=driver.findElement(By.id("droppable"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(drageme, drophere).build().perform();
	}
	public void verifyKeyboardActions() throws AWTException
	{
		Robot rob=new Robot();
	    rob.keyPress(KeyEvent.VK_CONTROL); // new Tab Cntrl+T
	    rob.keyPress(KeyEvent.VK_T);
	    rob.keyRelease(KeyEvent.VK_CONTROL);
	    rob.keyRelease(KeyEvent.VK_T);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions handlingactions=new HandlingActions();
		handlingactions.initializeBrowser();
	//	handlingactions.verifyRightClick();
		//handlingactions.verifyMouseOver();
		//handlingactions.verifyDoubleClick();
		//handlingactions.verifyDragandDrop();
		try {
			handlingactions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		handlingactions.closeWindow();

	}

}
