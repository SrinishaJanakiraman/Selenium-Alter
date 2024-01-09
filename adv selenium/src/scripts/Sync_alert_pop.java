package scripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sync_alert_pop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("---start-maximized");
		WebDriver driver=new ChromeDriver(opt);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1234",Keys.ENTER);
		Thread.sleep(2000);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//wait.until(ExpectedConditions.alertIsPresent()).accept();
	}

}
