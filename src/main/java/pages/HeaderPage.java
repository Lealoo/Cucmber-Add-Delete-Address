package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HeaderPage extends BasePage {

    //hidden-sm-down
    @FindBy(className = "user-info")
    private WebElement userSignInButton;

    public HeaderPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getUserSignInButton(){
        return getVisibleElement(userSignInButton);
    }
    public void clickUserSignInButton(){
        getUserSignInButton().click();
    }


}
