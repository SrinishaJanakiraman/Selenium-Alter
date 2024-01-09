package Testing_scrpits;

import org.testng.annotations.Test;

public class Runner {

	@Test(invocationCount = 5)
	public void sample()
	{
		System.out.println("Hii");
		
	}
	@Test
	public void sample1()
	{
		System.out.println("Hello");
		
	}
	
}
