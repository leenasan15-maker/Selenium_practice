package seleniumbasics;

public class BrowserCommands extends Base {
	
	public void VerifyCommands()
	{
		String title=driver.getTitle();
		System.out.println(title);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);
		String source=driver.getPageSource();
		System.out.println(source);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserCommands browsercommand=new BrowserCommands();
		browsercommand.initializeBrowser();
		browsercommand.VerifyCommands();
		browsercommand.closeWindow();
	
	}

}
