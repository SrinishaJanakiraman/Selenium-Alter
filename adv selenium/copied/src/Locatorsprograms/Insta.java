package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Insta {

	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");
		driver.findElement(By.name("username")).sendKeys("supreethaum.a6@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Supritha@123");
		driver.findElement(By.xpath("//div[text()='Log in']")).click();
		

	

	}

}
