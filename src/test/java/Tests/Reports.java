package Tests;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.homePage;
import Pages.reportsPage;
import utilities.baseDriver;
import utilities.commonMethods;

public class Reports extends baseDriver {
	
	
	homePage p;
	
	reportsPage r;
	
	commonMethods c;
	
	
	@BeforeTest
	
	public void beforeTest() {
		
		launchBrowser();
		
		navigateToUrl("https://www.kentair.org.uk/");
		
		
		p=new homePage(driver);
		
		
     	p.clickOnAcceptCookies();
		
		
	}
	
	
	
	@Test
	
	public void validateReports() throws Exception  {
		
		r=new reportsPage(driver);
		
		r.clickOnReports();
		
		c=new commonMethods(driver);
		
		c.scrollDown(1000);
		
		Thread.sleep(3000);
		
		r.clickOnNextButton();
		
		r.insertReportData();
		
	}



	

}
