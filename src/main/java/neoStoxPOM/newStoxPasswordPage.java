package neoStoxPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import neoStoxUtility.UtilityProperties;



public class newStoxPasswordPage {

	@FindBy (id = "txt_accesspin") private WebElement passwordFiled;
	@FindBy(xpath = "//a[text()='Submit']") private WebElement submitButton;
	public void NeoStoxPasswordPage(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	public void sendPassword(WebDriver driver,String pass)
	{
	UtilityProperties.wait(driver, 1000);
	passwordFiled.sendKeys(pass);
	Reporter.log("sending password", true);
	}
	public void clickOnSubmitButton(WebDriver driver)
	{
	UtilityProperties.wait(driver, 1000);
	submitButton.click();
	Reporter.log("Clicking on submit button", true);
	}
	
	
	
	
	
	
	
	
	
	
}
