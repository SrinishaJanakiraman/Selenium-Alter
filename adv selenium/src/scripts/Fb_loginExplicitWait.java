package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Fb_loginExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.urlContains("facebook"));
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.id("pass")).sendKeys("123456");

	}

}
