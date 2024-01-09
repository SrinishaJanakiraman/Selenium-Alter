package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb_nElements_runner 
{
@Test
public void run() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	pom_nElements p=new pom_nElements(driver);
	p.enter_un().sendKeys("srinisha");
	Thread.sleep(1000);
	p.enter_pass().sendKeys("byeeee");
	Thread.sleep(1000);
	p.login_clk().submit();
	
}

}
