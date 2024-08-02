package sample_Repo;

import org.testng.annotations.Test;

public class Program1 {
	@Test(priority=1)
	public void createuser()
	{
		System.out.println("cu");
	}
	@Test(priority=2)
	public void modifyuser()
	{
		System.out.println("mu");
	}
	@Test(priority=3)
	public void deleteuser()
	{
		System.out.println("du");
	}

}
