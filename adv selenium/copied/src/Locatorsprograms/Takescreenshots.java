package Locatorsprograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Takescreenshots {


	public static void main(String[] args) throws InterruptedException, IOException {

System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.Facebook.com/");
Thread.sleep(1000);

TakesScreenshot ts=(TakesScreenshot)driver;
File src=ts.getScreenshotAs(OutputType.FILE);
File dst=new File("C:\\Users\\comp\\Desktop\\defectreport\\defect2.jpeg");
FileHandler.copy(src, dst);
Thread.sleep(1000);
Runtime.getRuntime().exec(	"C:\\Users\\comp\\Desktop\\autoit\\autofill.exe");
driver.quit();
	}

}