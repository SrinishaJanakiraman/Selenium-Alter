package Testing_scrpits;

import org.testng.annotations.Test;

public class Runner1 {
	
	@Test
	public void compose()
	{
		System.out.println("mail is composed");
	}
	@Test(dependsOnMethods = "compose")
	public void send()
	{
		System.out.println("mail is sent");
	
	}
	@Test(dependsOnMethods = "send")
	public void sentitems()
	{
		System.out.println("mail is displayed in sentitems");
	
	}
	@Test(dependsOnMethods = "sentitems")
	public void trash()
	{
		System.out.println("mail is present in trash");
	
	}

@
}
