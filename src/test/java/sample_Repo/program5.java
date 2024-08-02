package sample_Repo;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class program5 {
@Test
public void StrictLevelComparision() {
	String expectedValue="raja";
	String actualValue="raja";
	SoftAssert sf=new SoftAssert();
	sf.assertEquals(actualValue, expectedValue);
	System.out.println("assertion passed");
	sf.assertAll();
}
@Test
public void ContainsLevel() {
	String expectedValue="raja";
	String actualValue="mahaRaja";
	SoftAssert sf=new SoftAssert();
	sf.assertTrue(actualValue.contains(expectedValue));
	System.out.println("contains pased");
	sf.assertAll();
}
}
