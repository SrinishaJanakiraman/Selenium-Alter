package Program;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Crossbrowser {

public static WebDriver driver;
public static void Chrome()
{
	System.setProperty("webdriver.chrome.driver", "./softwares/Chromedriver.exe");
	driver=new ChromeDriver();
	driver.close();
}
public static void Firefox()
{
	System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
driver=new EdgeDriver();
driver.close();


}
public static void main(String[] args)
{
	Chrome();
	Firefox();
}
}
