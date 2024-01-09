package jdbcprogramss;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class prop_fetch {

	@Test
	public void Testdata() throws FileNotFoundException, InterruptedException
	{
		FileInputStream fis=new FileInputStream("./jdbc/data12.properties");
		Properties p=new Properties();
		String user=p.getProperty("un");
		String pass=p.getProperty("pwd");
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.name("username")).sendKeys(user);
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys(pass,Keys.ENTER);
		
		
	}
}
