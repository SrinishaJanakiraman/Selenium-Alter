package Testng;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

public class Runner {
	@Test(priority = 0)
	public void search() {
		System.out.println("search for a product");
	}
@Test(priority = 1 )
public void cart()
{
System.out.println("add the product into cart");
}
	@Test(priority = 2)
   public void checkout() {
		System.out.println("product added");
	}
}

