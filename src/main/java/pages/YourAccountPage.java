package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourAccountPage extends BasePage{
    @FindBy(id = "addresses-link")
    private WebElement addressesButton;
    @FindBy(xpath = "//*[contains(text(),'Create new address')]")
    private WebElement createNewAddressButton;
    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[2]/article/div[2]/a[2]/span")
    private WebElement deleteAddressButton;
    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article")
    private WebElement successAddressDeletionMessage;

    public YourAccountPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAddressesButton() {
        return getVisibleElement(addressesButton);
    }
    public WebElement getCreateNewAddressButton() {
        return getVisibleElement(createNewAddressButton);
    }
    public void clickAddressesButton(){
        getAddressesButton().click();
    }
    public void clickCreateNewAddressButton(){
        getCreateNewAddressButton().click();
    }
    public WebElement getDeleteAddressButton() {
        return getVisibleElement(deleteAddressButton);
    }
    public WebElement getSuccessAddressDeletionMessage() {
        return getVisibleElement(successAddressDeletionMessage);
    }
    public void clickDeleteAddressButton(){
        getDeleteAddressButton().click();
    }
    public String receiveDeleteSuccessMessage(){
        return getSuccessAddressDeletionMessage().getText();
    }

}
