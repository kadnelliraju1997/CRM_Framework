package pac1;

import org.testng.annotations.Test;

import genericutility.FileUtility;

public class ProductTest {
	FileUtility Flib=new FileUtility();
	@Test(groups = "smoke")
	public void createProductTest() throws Throwable
	{
		String url = Flib.readDataFromPropertyFile("url");
		String browser = Flib.readDataFromPropertyFile("browser");
		String username = Flib.readDataFromPropertyFile("username");
		String password = Flib.readDataFromPropertyFile("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute createProductTest");
		
	}
	@Test(groups = "regression")
	public void modifyProductTest()
	{
		System.out.println("execute modifyProductTest");
		
	}
}
