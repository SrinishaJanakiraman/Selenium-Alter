package Testng;

import org.testng.Assert;
import org.testng.annotations.Test;



		public class program1
		{
			@Test
			public void compose()
			{
				System.out.println("Mail is composed");
				}

@Test (dependsOnMethods="compose")
 
	public void send()
	{
	System.out.println("the mail is sent");

	
}
@Test(dependsOnMethods="send")
public void sentItem()
{
	System.out.println("the mail is displayed in sentitem");
}
@Test(dependsOnMethods="sentItem")
public void trash()
{
	System.out.println("the mail is present in trash");
}
	}


