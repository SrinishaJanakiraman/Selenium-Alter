package Basicframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass implements frameworkConstant {


public WebDriver driver;
@BeforeMethod
public void openApp()
{
System.setProperty(chrome_key,chrome_value);
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get(base_url);


}
@AfterMethod
public void closeApp()
{
	driver.close();
}
}



