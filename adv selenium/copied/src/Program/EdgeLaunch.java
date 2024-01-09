package Program;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.server.handler.WebDriverHandler;

public class EdgeLaunch
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.edge.driver","./softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.close();
	}

}

