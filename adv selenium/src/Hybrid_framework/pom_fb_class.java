package Hybrid_framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_fb_class extends base_class {
	@FindBy(id="email")
	private WebElement un_txt;
	@FindBy(id="pass")
	private WebElement pass_txt;
	@FindBy(name="login")
	private WebElement lgn_btn;
	
	public pom_fb_class(WebDriver driver)
	{
	PageFactory.initElements(driver, this);	
	}

	public WebElement enter_un()
	{
		return un_txt;
	}
	public WebElement enter_pass()
	{
		return pass_txt;
	}
	public WebElement login_clk()
	{
		return lgn_btn;
	}

}
