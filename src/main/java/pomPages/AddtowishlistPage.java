package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtowishlistPage {
@FindBy(xpath="//div[@class='play-icon']")
private WebElement playbtn;

@FindBy(xpath="//div[@class='pause-icon']")
private WebElement pausebtn;

@FindBy(xpath="//span[text()='Add To Wishlist']")
private WebElement addtowishlist;

public AddtowishlistPage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}

public void playButton() {
	playbtn.click();
}

public void pausebutton() {
	pausebtn.click();
}

public void addtowishlistbtn() {
	addtowishlist.click();
}






}
