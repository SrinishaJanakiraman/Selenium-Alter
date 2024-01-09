package Program;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchUrlOfPage {

	

	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.Instagram.com");
	Thread.sleep(2000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	driver.quit();
	

	}

}
