package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillarrayDemoApp {
	
	@FindBy(id="course")
	private WebElement cousetab;
	
	@FindBy(xpath="//a[text()='Selenium Training']")
	private WebElement seleniumtraining;
	
	@FindBy(name="addresstype")
	private WebElement addressdd;
	
	
	
	public WebElement getAddressdd() {
		return addressdd;
	}

	public SkillarrayDemoApp(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	public WebElement getCousetab() {
		return cousetab;
	}
	
	public void seleniumtariningbtn() {
		seleniumtraining.click();
	}
	
	

}
