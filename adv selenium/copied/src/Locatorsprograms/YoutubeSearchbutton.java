package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class YoutubeSearchbutton {


	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
Thread.sleep(1000);
driver.findElement(By.name("search_query")).sendKeys("Mungarumale");
driver.findElement(By.xpath("//div[@id='start']")).click();
Thread.sleep(5000);
driver.quit();



	}

}
