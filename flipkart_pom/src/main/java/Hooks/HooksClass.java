package Hooks;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class HooksClass {
	WebDriver driver;
	public HooksClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
			
		}


	public void switchtab() {
		
		 String parentwindow=driver.getWindowHandle();
		 Set<String>windows= driver.getWindowHandles();
		 Iterator<String>iterator=windows.iterator();
		 System.out.println(driver.getTitle());
			while(iterator.hasNext()) {
				String childwindow=iterator.next();
				if(!parentwindow.equals(childwindow)) {
					driver.switchTo().window(childwindow);
					System.out.println(driver.getTitle());
					System.out.println("passed");	
                      	}

                    }
	}
			public void pagescroll() {
				JavascriptExecutor js=(JavascriptExecutor)driver;
				WebElement iphone=driver.findElement(By.xpath("//*[@data-id='MOBH4DQFVXNS5ZJH']"));
				js.executeScript("arguments[0].scrollIntoView();", iphone);
			    iphone.click();
			   
	        }}
         
