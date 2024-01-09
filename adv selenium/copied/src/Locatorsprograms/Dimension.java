package Locatorsprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Dimension {

	

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.Amazon.com/");
	    Thread.sleep(1000);
	List<WebElement> links=	driver.findElements(By.xpath("//a"));   
	for(WebElement Link: links)
	{
		String url=Link.getAttribute("href");
		System.out.println(url);
	}
	driver.quit();
	
		
	}

	}


