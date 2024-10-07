package pac2;

import org.testng.annotations.Test;

public class ContactTest {

	@Test(groups = "smoke")
	public void createContactTest()
	{
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
