package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Demoapps_sync_for_frame_ExpWait {
	@Test

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	     ChromeOptions opt = new ChromeOptions();
	     opt.addArguments("Start maximized");
	     WebDriver driver=new ChromeDriver(opt);
	     WebDriverWait wait=new WebDriverWait(driver, 5);
	     driver.get("https://demoapps.qspiders.com/frames/nested?sublist=1");
	     driver.findElement(By.id("email")).sendKeys("Admin@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Admin@1234");
	     driver.findElement(By.id("confirm-password")).sendKeys("Admin@1234");
	     wait.until(ExpectedConditions.));
	}

}
