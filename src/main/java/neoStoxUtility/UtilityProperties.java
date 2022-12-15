package neoStoxUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

public class UtilityProperties {

	public static String readdatafrompropertyfile(String key) throws IOException {
		         // cerating object of properites
		Properties prop = new Properties();

		        // creating object of fileinputstraemm
		FileInputStream myfile = new FileInputStream("C:\\Users\\Dell\\eclipse-workspace\\23rd_Jul_B_SELENIUM\\myproperties.properties");

		       // to load the file
		prop.load(myfile);

		         // To get the data
		String value = prop.getProperty(key);
		return value;

	}

	
	

	

	public static void wait(WebDriver driver, int waittime) {
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waittime));
		Reporter.log("waiting for " + waittime + "milis", true);
	}

	

}
