package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}

	
	@FindBy(xpath = "//*[@placeholder='Search for Products, Brands and More']")
	WebElement ProductSearch;
	
	@FindBy(xpath = "//*[@class='_2iLD__']")
	WebElement search;
	
	@FindBy(xpath = "//*[@data-id='MOBH4DQFVXNS5ZJH']")
	WebElement iphone;
	
	public void pagesearch(String productName) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		ProductSearch.sendKeys(productName);
		search.click();
		iphone.click();
		
	}

}
