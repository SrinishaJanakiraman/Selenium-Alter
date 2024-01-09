package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Youtube {



	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
driver.get("https://www.youtube.com/");
Thread.sleep(1000);

driver.quit();


	}

}
