package neoStoxBase;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperties;

public class BaseProperties {
	//OLD protected  WebDriver driver;
	//NEW protected static WebDriver driver;
	
	protected static WebDriver driver;
	
	
	public void launchBrowser() throws IOException
	{
		
    System.setProperty("webdriver.chrome.driver","D:\\\\@VELOCITY 23RD JULLY\\\\AUTOMATION NOTES\\\\Selenium\\\\chromedriver.exe");
	driver= new ChromeDriver();
	driver.get(UtilityProperties.readdatafrompropertyfile("url"));
	driver.manage().window().maximize();
	Reporter.log("Launching browser",true);

	}
	
	
	public static void closingBrowser(WebDriver driver) throws InterruptedException
	{
	Reporter.log("closing browser", true);
	Thread.sleep(500);
	driver.close();
	}
}
