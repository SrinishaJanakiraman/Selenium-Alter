package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CitySingleselector {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/comp/Desktop/Selenium%20html%20store/city_dropdown.html");
		WebElement drop_down=driver.findElement(By.xpath("//select[@id='city-dropdown']"));
		Thread.sleep(1000);
		Select sel=new Select(drop_down);
		if(sel.isMultiple())
			{
			System.out.println("Multi select");
			}
	}
	else
	{
		System.out.println("Single select");
		
	}


}
}




