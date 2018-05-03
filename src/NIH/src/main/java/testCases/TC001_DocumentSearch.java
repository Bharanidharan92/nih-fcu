package testCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wrappers.NIH_FCU_Wrappers;

public class TC001_DocumentSearch extends NIH_FCU_Wrappers {

	
		// TODO Auto-generated method stub
		@BeforeClass()
		public void setData(){
			browserName = "chrome";
			Url = "urlName" ;
			testCaseName = "Document Search Test";
			testDescription = "Testing Document Search Functionality";
			category = "Regression";
			authors = "Bharanidharan";
			dataSheetName = "TC001";
			
		}
		
		
		
		@Test(dataProvider = "fetchData")
		public void DocumentSearch(String url,String uName, String pwd, String mName){		
			driver.get(url);
			new LoginPage(driver, test)
			.enterUsername(uName)
			.enterPassword(pwd)
			.clickLogin()
			.enterMemberName(mName)
			.clickSearchButton()
			.selectFirstDocument();
			
			
			
			
	}

}
