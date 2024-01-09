package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Threebrowser {

	public static WebDriver driver;
	public static void Chrome()
	{
		System.setProperty("webdriver.chrome.driver","./softwares/ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.close();
	}
	public static void MsEdge()
	{
		
	System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
	driver=new EdgeDriver();
	driver.get("https://www.youtube.com");
	driver.close();
	}
	public static void main(String[] args)
	{
		Chrome();
		MsEdge();
		
	
	}

}
