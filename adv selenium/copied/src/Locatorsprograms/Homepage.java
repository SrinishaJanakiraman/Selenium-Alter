package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;

public class Homepage {
	public static void main(String[] args) throws InterruptedException
	{

		
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
	EdgeDriver driver=new EdgeDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(1000);
	    WebElement help_link=driver.findElement(By.linkText("Help"));
	    Point location=help_link.getLocation();
	    System.out.println(location);
	    int x=location.getX();
	    int y=location.getY();
	    System.out.println(x+" "+y);
	    Thread.sleep(1000);
	    driver.quit();
	    
	    
	}

}
