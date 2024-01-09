package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class DefectTakesScreenshot {

	public DefectTakesScreenshot() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./software/geckodriver.exe");
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(1000);
		 WebElement txt = driver.findElement(By.name("q"));
		 txt.
		 
		 

	}

}
