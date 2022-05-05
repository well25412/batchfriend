package scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.AddtowishlistPage;
import pomPages.CorejavaPage;
import pomPages.SkillaryLoginPage;

public class Testcase3 extends BaseClass{

	@Test
	public void tc3() throws IOException, InterruptedException {
	SkillaryLoginPage s=new SkillaryLoginPage(driver);
	s.serachtextboxs(pdata.getPropertyfiledata("course"));
	s.serachbtn();
	
	CorejavaPage c=new CorejavaPage(driver);
	c.corejavacourse();
	
	AddtowishlistPage a=new AddtowishlistPage(driver);
	driverUtilies.switchFrames(driver);
	a.playButton();

	a.pausebutton();
	driverUtilies.switchBackFrame(driver);
	a.addtowishlistbtn();
	
	//Assert.assertEquals(driver.getTitle(),"36drr5tytyr6");
	}
}
