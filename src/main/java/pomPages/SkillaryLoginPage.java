package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillaryLoginPage {

	@FindBy(xpath="//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	
	@FindBy(name="q")
	private WebElement serachtextbox;
	
	@FindBy(xpath="//input[@value='go']")
	private WebElement gobtn;
	
	
	
	public SkillaryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void serachtextboxs(String courseName) {
		serachtextbox.sendKeys(courseName);
	}
	
	public void serachbtn() {
		gobtn.click();
	}
	
	public void gerasButton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}
	
	
	
	
	
}
