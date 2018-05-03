package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.NIH_FCU_Wrappers;

public class DocumentSearch extends NIH_FCU_Wrappers {

	public DocumentSearch(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

//		if(!verifyTitle("	Document Search")){
//			reportStep("This is not NIH Document Search Page", "FAIL");
//		}
	}


	public DocumentSearch enterMemberName(String data){
		enterByName("ctl00$ContentPlaceHolder1$txtCustomerName", data);
		return this;
	}

	public DocumentSearchResults clickSearchButton(){
		clickById("ctl00_ContentPlaceHolder1_btnSearch");
		return new DocumentSearchResults(driver, test);

	}
}