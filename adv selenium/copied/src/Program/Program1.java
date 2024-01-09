package Program;

import org.openqa.selenium.edge.EdgeDriver;

public class Program1 {

	public Program1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "./softwares/msedgedriver.exe");
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.instagram.com/");

		

	}

}
