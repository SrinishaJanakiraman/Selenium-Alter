package Runner;

import org.testng.Assert;
import org.testng.annotations.Test;

import Basicframework.POMclass;
import Generic.Baseclass;

public class testcase1 extends Baseclass{

	@Test
	public void run() throws InterruptedException
	{
		
			POMclass p=new POMclass(driver);
			p.enter_un().sendKeys("hello");
			Thread.sleep(1000);
			p.enter_pass().sendKeys("bye");
			Thread.sleep(1000);
	p.login_click().click();
	Assert.fail();
	Thread.sleep(5000);
	}
	}

