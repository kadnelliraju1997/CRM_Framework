package pac1;

import org.testng.annotations.Test;

public class ProductTest {
	@Test(groups = "smoke")
	public void createProductTest()
	{
		System.out.println("execute createProductTest");
		
	}
	@Test(groups = "regression")
	public void modifyProductTest()
	{
		System.out.println("execute modifyProductTest");
		
	}
}
