package Program;

import org.openqa.selenium.chrome.ChromeDriver;

public class FetchsrcCode {



	public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");
Thread.sleep(2000);
String src = driver.getPageSource();
System.out.println(src);
if(src.contains("Forgotten"))
{
	System.out.println("TC Pass");
	
}
else
{
	System.out.println("TC Fail");
	
}
driver.quit();
	}}





	


