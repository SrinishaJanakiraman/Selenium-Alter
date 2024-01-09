package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Perfrormaction {

	public Perfrormaction() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.Facebook.com/");
	    Thread.sleep(1000);
	    driver.findElement(By.id("email")).sendKeys("Hello");
	    driver.findElement(By.id("pass")).sendKeys("password");
	    driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
	    Thread.sleep(1000);
	    driver.quit();
	    
	    
	    

	}

}
