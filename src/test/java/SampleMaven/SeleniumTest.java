package SampleMaven;

import org.testng.annotations.Test;

public class SeleniumTest {
	
	//testng xml file from Maven
	@Test
	public void BrowserAutomation() {
		System.out.println("BrowserAutomation");
}
	
	@Test
	public void elementsUi() {
		System.out.println("elementsUi");
	}
}