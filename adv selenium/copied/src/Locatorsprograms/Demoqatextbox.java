package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Demoqatextbox {


	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(1000);
		driver.findElement(By.id("userName")).sendKeys("Supreetha");
		Thread.sleep(1000);
		driver.findElement(By.id("userEmail")).sendKeys("s4supritha.gowda@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.id("currentAddress")).sendKeys("Nagarbhavi");
		Thread.sleep(1000);
		driver.findElement(By.id("permanentAddress")).sendKeys("Nagarbhavi");
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(5000);
		

	}

}
