package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoapps_sync_for_progressbar_ExpWait {

	public static void main(String[] args) {
		
     System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://demoapps.qspiders.com/progress/element?sublist=2");
     WebDriverWait w=new WebDriverWait(driver,4);
      driver.findElement(By.xpath("//input[@placeholder='Enter time in seconds']")).sendKeys("6");
      driver.findElement(By.xpath("//button[text()='Start']")).click();
      WebElement add=driver.findElement(By.xpath("//select"));
      Select sel = new Select(add);
      sel.selectByVisibleText("Yes");
    
     
     
	}

}
