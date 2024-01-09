package Locatorsprograms;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demowebpage1 {


	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
	}

}
