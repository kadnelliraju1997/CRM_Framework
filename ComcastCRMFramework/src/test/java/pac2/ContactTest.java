package pac2;

import org.testng.annotations.Test;

import genericutility.FileUtility;

public class ContactTest {

	FileUtility Flib=new FileUtility();
	
	@Test(groups = "smoke")
	public void createContactTest() throws Throwable
	{
		String url = Flib.readDataFromPropertyFile("url");
		String browser = Flib.readDataFromPropertyFile("browser");
		String username = Flib.readDataFromPropertyFile("username");
		String password = Flib.readDataFromPropertyFile("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute createContactTest");
		
	}
	@Test(groups = "regression")
	public void modifyContactTest()
	{
		System.out.println("execute modifyContactTest");
		
	}
	@Test(groups = "smoke")
	public void createOrgwithContactTest()
	{
		System.out.println("execute createOrgTest");
		
	}
	@Test(groups = "regression")
	public void modifyOrgWithContactTest()
	{
		System.out.println("execute modifyOrgWithContactTest");
		
	}
}
