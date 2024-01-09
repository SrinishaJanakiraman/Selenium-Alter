package Locatorsprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Cityalloptiontext {

	public Cityalloptiontext() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
			driver.get("file:///C:/Users/comp/Desktop/Selenium%20html%20store/city_dropdown.html");
			Thread.sleep(1000);
			WebElement drop_down=driver.findElement(By.xpath("//select[@id='city-dropdown']"));
			Select sel=new Select(drop_down);
			List<WebElement> options = sel.getOptions();
			int count=options.size();
			System.out.println(count);
			for(WebElement option:options)
			{
				String text=option.getText();
		c		System.out.println(text);
			}
			driver.quit();

	}

}
