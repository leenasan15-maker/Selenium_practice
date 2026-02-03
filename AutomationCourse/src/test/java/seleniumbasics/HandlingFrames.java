package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFrames extends Base{
	
	public void verifyFrame()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement> totalframes=driver.findElements(By.tagName("iframe"));
		System.out.println(totalframes.size());
		WebElement frame=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(frame);
		WebElement thisisasamplepage=driver.findElement(By.id("sampleHeading"));
		System.out.println(thisisasamplepage.getText());
		driver.switchTo().defaultContent();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingFrames handlingframes=new HandlingFrames();
		handlingframes.initializeBrowser();
		handlingframes.verifyFrame();
		handlingframes.closeWindow();

	}

}
