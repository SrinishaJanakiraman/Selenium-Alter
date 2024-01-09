package Basicframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMclass {


@FindBy(id="email")
private WebElement un_txt;

@FindBy(id="pass")
private WebElement pass_txt;

@FindBy(name="login")
private WebElement lgn_btn;



public POMclass(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement enter_un()
{
	return un_txt;
	
}
public WebElement enter_pass()
{
	return pass_txt;
	
}
public WebElement login_click()
{
	return lgn_btn;
}
}

