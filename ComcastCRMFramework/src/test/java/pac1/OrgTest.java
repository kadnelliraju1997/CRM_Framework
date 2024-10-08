package pac1;

import org.testng.annotations.Test;

import genericutility.FileUtility;

public class OrgTest {

	FileUtility Flib=new FileUtility();
	@Test(groups = "smoke")
	public void createOrgTest() throws Throwable
	{
		String url = Flib.readDataFromPropertyFile("url");
		String browser = Flib.readDataFromPropertyFile("browser");
		String username = Flib.readDataFromPropertyFile("username");
		String password = Flib.readDataFromPropertyFile("password");
		System.out.println(url);
		System.out.println(browser);
		System.out.println(username);
		System.out.println(password);
		System.out.println("execute createOrgTest");
		
	}
	@Test(groups = "regression")
	public void modifyOrgTest() throws Throwable
	{
		
		System.out.println("execute modifyOrgTest");
		
	}
	@Test(groups = "smoke")
	public void createContactTest()
	{
		
		System.out.println("execute createContactTest");
		
	}
	@Test(groups = "smoke")
	public void createOrgwithContactTest()
	{
		System.out.println("execute createOrgTest");
		
	}
}
