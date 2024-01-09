import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenshot {

	public TakeScreenshot() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dst = new File("\"C:\\Users\\comp\\Desktop\\Defectscreenshot\\defectscreenshot.jpeg");
		FileHandler.copy(src, dst);
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
