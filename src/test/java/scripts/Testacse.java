package scripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtoCart;
import pomPages.SkillarrayDemoApp;
import pomPages.SkillaryLoginPage;

public class Testacse extends BaseClass {
	@Test
	public void tc1() {
	SkillaryLoginPage s=new SkillaryLoginPage(driver);
	s.gerasButton();
	s.skillrarydemoapplication();
	
	SkillarrayDemoApp sd=new SkillarrayDemoApp(driver);
	driverUtilies.switchingTabs(driver);
	driverUtilies.mouseHove(driver,sd.getCousetab());
	sd.seleniumtariningbtn();
	
	AddtoCart a=new AddtoCart(driver);
	driverUtilies.doubleClick(driver,a.getAdd());
	a.addtocart();
	
	}

}
