package pages;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Orderproduct {
	WebDriver driver;
	
	public Orderproduct(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//*[@class='QqFHMw vslbG+ _3Yl67G _7Pd1Fp']")
	WebElement buynow;
	@FindBy(xpath = "//*[@class='r4vIwl Jr-g+f']")
	WebElement Number;
	@FindBy(xpath = "//*[@class='QqFHMw YhpBe+ _7Pd1Fp']")
	WebElement enterclick;
	@FindBy(xpath = "//*[@class='r4vIwl zgwPDa Jr-g+f']")
	WebElement OTP;
	@FindBy(xpath = "//*[@class='QqFHMw YhpBe+ _7Pd1Fp']")
	WebElement login;
	@FindBy(xpath = "//*[@placeholder='Enter your email ID']")
	WebElement MailID;
	@FindBy(xpath = "//*[@class='QqFHMw VuSC8m _7Pd1Fp']")
	WebElement continueclick;
	@FindBy(xpath = "//*[@class='QqFHMw _0ofT-K M5XAsp']")
	WebElement AccandCon;
	
	public void buy(){
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		buynow.click();
	}
	
	public void send(String a) {
		Number.sendKeys(a);
		enterclick.click();
	}
	
	public void otp() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a OTP");
		String otp=sc.next();
		OTP.sendKeys(otp);
		sc.close();
		login.click();
		
	}
	
		public void mailid(String mailid) {
		MailID.sendKeys(mailid);
		continueclick.click();
		AccandCon.click();	
		
	}
}
