package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;




public class Instagram {


	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./softwares/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("supreethaum.a6@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Supritha@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	}

}