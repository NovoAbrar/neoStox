package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperties;



public class neoStoxSingUp {

	@FindBy(id="MainContent_signinsignup_txt_mobilenumber") private WebElement mobileNumField;
	@FindBy(xpath = "//a[@id='lnk_signup1']") private WebElement signInButton;
	public void NeoStoxSignLogin(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void sendMobileNum(WebDriver driver,String mobNum)
	{
	UtilityProperties.wait(driver, 1000);
	mobileNumField.sendKeys(mobNum);
	Reporter.log("sending mobile number..", true);
	}
	public void clickOnSignInButton(WebDriver driver)
	{
	UtilityProperties.wait(driver, 1000);
	signInButton.click();
	Reporter.log("clicking on sign in Button", true);
	}
}

