package Locatorsprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Demoshopapp {

	
	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/"); 
		Thread.sleep(1000);
       driver.findElement(By.xpath("//a[text()='Log in']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("supreetha.a6@gmail.com");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("supritha@123");
       Thread.sleep(1000);
       driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
       Thread.sleep(1000);
       driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[4]")).click();
       Thread.sleep(1000);
	driver.manage().window().maximize();
	 WebElement drop_down=driver.findElement(By.xpath(("//select[@id='products-orderby']")));
	 Select sel=new Select(drop_down);
	 sel.selectByVisibleText("Name: A to Z");
	 
	WebElement drop_down2=driver.findElement(By.xpath(("//select[@id='products-pagesize']")));
	Select sel1=new Select(drop_down2);
	sel1.selectByIndex(2);
	WebElement drop_down3=driver.findElement(By.xpath(("//select[@id='products-viewmode']")));
	Select sel2=new Select(drop_down3);
	sel2.selectByVisibleText("List");
	WebElement btn=driver.findElement(By.xpath("//div[@class='product-list']/div[1]/div[1]/div[2]/div[3]/div[2]"));
	btn.click();
	Thread.sleep(1000);
	WebElement conf=driver.findElement(By.xpath("//div[@id='bar-notification']"));
	Thread.sleep(1000);
	if(conf.isDisplayed())
	{
		System.out.println("confirm msg");
		
	}
	else
	{
		System.out.println("in correct msg");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\comp\\Desktop\\defectreport\\defect2.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(1000);
		driver.quit();
			}

	
	
	}

}
