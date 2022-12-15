package neoStoxTestClasses;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import neoStoxBase.BaseProperties;
import neoStoxBase.BaseProperties;
import neoStoxPOM.neoStoxHomePage;
import neoStoxPOM.newStoxPasswordPage;
import neoStoxPOM.neoStoxSingUp;
import neoStoxUtility.UtilityProperties;


public class ValidateNeoStoxUserProperties extends BaseProperties {
	neoStoxSingUp login;
	newStoxPasswordPage password;
	neoStoxHomePage home;

	@BeforeClass
	public void launchNeoStox() throws IOException {
		launchBrowser();
		login = new neoStoxSingUp();
		password = new newStoxPasswordPage();
		home = new neoStoxHomePage();
	}

	@BeforeMethod
	public void loginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException {
		login.sendMobileNum(driver, UtilityProperties.readdatafrompropertyfile("mobilNum"));
		login.clickOnSignInButton(driver);
		Thread.sleep(2000);
		password.sendPassword(driver, UtilityProperties.readdatafrompropertyfile("password"));
		password.clickOnSubmitButton(driver);
		Thread.sleep(1000);
		home.popUpHandle(driver);
	}

	
	@AfterMethod
	public void logout() {
		home.logoutFormNeoStox(driver);
	}

	@AfterClass
	public void closeApplication() throws InterruptedException {
		closingBrowser(driver);
	}

}
