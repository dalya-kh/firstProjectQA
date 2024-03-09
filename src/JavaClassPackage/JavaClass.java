package JavaClassPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaClass {

	@BeforeTest
	public void MyBeforeTest() {

	}
//////////////////////////////////////////////
	String myName ="dadoooo";
	@Test

	public void MyTest() {
		String MyName = "dalya";
		System.out.println(MyName.contains("d"));

	}

}
