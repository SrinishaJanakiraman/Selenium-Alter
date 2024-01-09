package Locatorsprograms;


import org.openqa.selenium.firefox.FirefoxDriver;

public class Homepage2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
	    driver.get("https://www.facebook.com/");
	    Thread.sleep(1000);
	}

}
