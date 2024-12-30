package TestRunner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import BaseClass.LibraryClass;
import Hooks.HooksClass;
import pages.HomePage;
import pages.Orderproduct;

public class FlipkartTest  extends LibraryClass{
	@Test
	public void test() throws InterruptedException {
				//LibraryClass name = new LibraryClass();
				//name.setup();
				HomePage name1 = new HomePage(driver);
				name1.pagesearch("iphone");
				HooksClass act=new HooksClass(driver);
				act.pagescroll();
				act.switchtab();
				Orderproduct as=new Orderproduct(driver);
				as.buy();
				as.send("9176709355");
				Thread.sleep(4000);
				as.otp();
				as.mailid("dhamuganesh18@gmail.com");
	}

}
