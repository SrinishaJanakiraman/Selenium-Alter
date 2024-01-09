package Locatorsprograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("name")).sendKeys("Supreetha");
	
		driver.findElement(By.name("email")).sendKeys("s4supritha.gowda@gmail.com");

		driver.findElement(By.name("password")).sendKeys("1234");

	
		driver.quit();
	}

}
