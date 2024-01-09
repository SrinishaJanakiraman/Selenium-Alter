package Hybrid_framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class implements FrameworkConstant
{
	public WebDriver driver;
	@BeforeMethod
	public void openapp() 
	{
		System.setProperty(chrome_key, chrome_value);
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get(base_url);
	}
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}


}
