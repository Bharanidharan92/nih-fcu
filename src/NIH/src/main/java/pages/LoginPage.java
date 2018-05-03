package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.NIH_FCU_Wrappers;

public class LoginPage extends NIH_FCU_Wrappers{

	public LoginPage(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Login to repository")){
			reportStep("This is not NIH Login Page", "FAIL");
		}
	}


	public LoginPage enterUsername(String data){
		enterById("ctl00_ContentPlaceHolder1_txtUsername", data);
		return this;
	}

	public LoginPage enterPassword(String data){
		enterByXpath("//input[@type='password']", data);
		return this;
	}

	public DocumentSearch clickLogin(){
		clickById("ctl00_ContentPlaceHolder1_btnLogin");		
		/*HomePage hm = new HomePage();
		return hm;*/
		return new DocumentSearch(driver,test);


	}
}
