package scripts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Link_handle {
    public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxOptions opt=new FirefoxOptions();
		opt.addArguments("---start-maximized");
		WebDriver driver=new FirefoxDriver(opt);
		WebDriverWait wait=new WebDriverWait(driver, 5);
		driver.get("file:///C:/Users/sys/Desktop/adv%20sel%20html/primary.html");
		driver.findElement(By.id("email")).sendKeys("helloooooooooooo");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(0));
		driver.findElement(By.id("pass")).sendKeys("worlddddddddddd");
		
	}
}
