package Program;


import org.openqa.selenium.chrome.ChromeDriver;


public class Supreetha {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./softwares/Chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");

		

	}

}
	
