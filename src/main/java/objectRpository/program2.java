package objectRpository;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class program2 {
@Ignore
	@Test(priority=1)
	public void createuser() {
	System.out.println("cu");	
	}
	@Test(priority=2,invocationCount=0)
	public void modifyuser() {
		System.out.println("mu");
	}
	@Test(priority=3)
	public void deleteuser() {
		System.out.println("du");
	}
}
