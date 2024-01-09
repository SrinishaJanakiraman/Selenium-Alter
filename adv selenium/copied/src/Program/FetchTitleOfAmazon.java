package Program;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchTitleOfAmazon {

	
	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in");
Thread.sleep(2000);
String title=driver.getTitle();
System.out.println(title);
driver.quit();

	}

}
