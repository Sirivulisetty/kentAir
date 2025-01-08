package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.commonMethods;
import utilities.excelWriter;

public class reportsPage {
	
	WebDriver driver;
	
	
	
	public reportsPage(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(xpath="//a[text()='Reports']")
	WebElement reports;
	
	@FindBy(xpath="//table[@role='table']//tr/td[1]/a")
	List<WebElement> reportName;
	
	@FindBy(xpath="//table[@role='table']//tr/td[2]/span")
	List<WebElement> publishedDate;
	
	@FindBy(xpath="//button[@class='btn btn-outline-dark'][2]")
	WebElement nextButton;
	
	
	@FindBy(xpath="//table[@role='table']//tr/td[3]")
	List<WebElement> author;
	
	
	public void clickOnReports() {
		
		reports.click();
		
	}
	
	
	public void clickOnNextButton() {
		
		nextButton.click();
		
	}
	
	public void insertReportData() throws Exception {
		
		Thread.sleep(3000);
		
		for(int i=0;i<reportName.size();i++) {
			
			String text=reportName.get(i).getText();
			
			String date=publishedDate.get(i).getText();
			
			String authorName=author.get(i).getText();
			
			System.out.println(text);
			
			excelWriter.writeData(i+1,1, text);
			
			excelWriter.writeData(i+1,2, date);
			
			excelWriter.writeData(i+1,3, authorName);
			
			
		}
	}
	

}
