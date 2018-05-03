package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.NIH_FCU_Wrappers;

public class DocumentSearchResults extends NIH_FCU_Wrappers{

	public DocumentSearchResults(RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

//		if(!verifyTitle("Document search results")){
//			reportStep("This is not NIH Document Search Result Page", "FAIL");
//		}
	}


	public DocumentSearchResults selectFirstDocument(){
		clickById("ctl00_ContentPlaceHolder1_ResultsGrid_ctl00__0");
		return this;
	}
	
//	public DocumentSearchResults viewPDF(){
//		clickById("ctl00_ContentPlaceHolder1_ResultsGrid_ctl00_ctl04_gbccolumn");
//		return this;
//	}
//
//	public DocumentSearchResults clickViewPDF(){
//		clickByXpath("//embed[@name='plugin']");
//		return this;
//	}

	
	
	
}
