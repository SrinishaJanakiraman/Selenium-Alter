package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cityselect1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/comp/Desktop/Selenium%20html%20store/city_dropdown.html");
	Thread.sleep(1000);
	WebElement drop_down=driver.findElement(By.xpath("//select[@id='city-dropdown']"));
	Select sel=new Select(drop_down);
	sel.selectByIndex(0);
	sel.selectByValue("C");
	sel.selectByVisibleText("Mysore");
	Thread.sleep(1000);
	sel.deselectByVisibleText("Mysore");
	Thread.sleep(1000);
	sel.deselectAll();
	Thread.sleep(1000);
	driver.quit();
	}
}

	
	
	

