package Program;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Emptybrowserlaunch {

	
	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
FirefoxDriver driver=new FirefoxDriver();

	}

}
