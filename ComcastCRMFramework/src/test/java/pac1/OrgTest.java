package pac1;

import org.testng.annotations.Test;

import genericutility.FileUtility;

public class OrgTest {

	FileUtility Flib=new FileUtility();
	@Test(groups = "smoke")
	public void createOrgTest() throws Throwable
	{
		
		
		String URL = System.getProperty("url");
		String USERNAME = System.getProperty("username");
		String PASSWORD = System.getProperty("password");
		String BROWSER = System.getProperty("browser");

		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(BROWSER);
		
		
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
