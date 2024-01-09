package Hybrid_framework;

import org.testng.annotations.Test;

public class pom_fb_runner extends base_class{
	@Test
	public void run() throws InterruptedException
	{
		pom_fb_class p=new pom_fb_class(driver);
		p.enter_un().sendKeys("heyyyyyy");
		p.enter_pass().sendKeys("hiiiiiii");
		p.login_clk().click();
		Thread.sleep(1000);
	}
}
