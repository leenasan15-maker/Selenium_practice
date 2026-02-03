package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingTable extends Base{
	public void verifyTable()
	{
	driver.navigate().to("https://selenium.qabible.in/table-pagination.php");	
	WebElement table=driver.findElement(By.id("dtBasicExample"));
	//System.out.println(table.getText());
	WebElement heading=driver.findElement(By.xpath("//table[@id='dtBasicExample']/thead/tr[1]"));
	System.out.println(heading.getText());
	WebElement row=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]"));
	System.out.println(row.getText());
	WebElement column=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]/td[3]"));
	System.out.println(column.getText());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingTable handlingtable=new HandlingTable();
		handlingtable.initializeBrowser();
		handlingtable.verifyTable();
		handlingtable.closeWindow();

	}

}
