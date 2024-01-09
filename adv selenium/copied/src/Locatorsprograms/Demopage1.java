package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demopage1 {

	public Demopage1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		WebElement drop_down=driver.findElement(By.xpath("//ul[@class='top-menu']//li[2]"));
			drop_down.click();

driver.findElements(By.xpath("//ul[@class='top-menu']//li[2]/ul[1]/li[1]/a[1])"));


		
		
	}

}
