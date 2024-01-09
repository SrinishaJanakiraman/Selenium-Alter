package Basicframework;


import org.testng.Assert;
import org.testng.annotations.Test;

import POM.pomclass;


public class Runnerclass extends Baseclass{


@Test
	public void run() throws InterruptedException
	{
		
			pomclass p=new pomclass(driver);
			p.enter_un().sendKeys("hello");
			Thread.sleep(1000);
			p.enter_pass().sendKeys("bye");
			Thread.sleep(1000);
	p.login_click().click();
	Thread.sleep(5000);
	Assert.fail();
	}
	}



