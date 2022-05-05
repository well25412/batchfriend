package scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillarrayDemoApp;
import pomPages.SkillaryLoginPage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2() throws IOException {
	SkillaryLoginPage s=new SkillaryLoginPage(driver);
	s.gerasButton();
	s.skillrarydemoapplication();
	
	SkillarrayDemoApp sd=new SkillarrayDemoApp(driver);
	driverUtilies.switchingTabs(driver);
	driverUtilies.dropDown(sd.getAddressdd(),pdata.getPropertyfiledata("dropdowndata"));
	
	TestingPage t=new TestingPage(driver);
	driverUtilies.draganddrop(driver,t.getSeleniumtaring(),t.getCart());
	Point loc = t.getCart().getLocation();
	int x=loc.getX();
	int y=loc.getY();
	driverUtilies.scrollBar(driver, x, y);
	}
	

}
