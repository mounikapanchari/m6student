package sample_Repo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class program4 {
	@Test
public void StrictLevelComparision() {
	
String expectedValue="raja";
String ActualValue="raja";
Assert.assertEquals(ActualValue,expectedValue );
System.out.println("passed");
}
	@Test
public void ContainsLvel() {
	
	String expectedValue="raja";
	String ActualValue="mahaRaja";
	Assert.assertTrue(ActualValue.contains(expectedValue));
	System.out.println("pseeed");
}
}
