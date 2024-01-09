package Locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Moneycontrol
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.moneycontrol.com/");
		Thread.sleep(1000);
driver.findElement(By.xpath("(//input[@id='search_str'])[1]")).sendKeys("infy",Keys.ENTER);

Thread.sleep(1000);
WebElement value=driver.findElement(By.xpath("//div[@class='inprice1 nsecp']"));
String Stock_price=value.getAttribute("data_number");
double d=Double.parseDouble(Stock_price);
System.out.println(d);
Thread.sleep(1000);
driver.quit();



		

	}

}
