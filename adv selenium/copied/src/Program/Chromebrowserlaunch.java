package Program;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Chromebrowserlaunch {



	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
		driver.close();
	}

	}


                    