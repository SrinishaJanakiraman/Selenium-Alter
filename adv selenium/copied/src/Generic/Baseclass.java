package Generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements Frame1 
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp()
	{
		System.setProperty(Chrome_key, Chrome_value);
		driver=new ChromeDriver();
		driver.get(Base_url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		}
	@AfterMethod
	public void closeapp(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
			Screenshot.screen(driver);
		}
		driver.close();
		
			
		}
	}



