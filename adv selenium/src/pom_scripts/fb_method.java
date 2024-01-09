package pom_scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fb_method {
	//stage1
			@FindBy(id="email")
			private WebElement un_txt;
			
			
		//stage2
			public fb_method(WebDriver driver)
			{
			PageFactory.initElements(driver, this);	
			}
		//stage3
			public WebElement enter_un()
			{
				return un_txt;
}
