package pom_scripts;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class fb_method_runner {

				
			@Test
			public void run() throws InterruptedException {
				System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.facebook.com");
				fb_method p=new fb_method(driver);
				p.enter_un();
				Thread.sleep(1000);
				driver.navigate().refresh();
				
		}
		
	}

