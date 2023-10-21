package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewAddressPage extends BasePage{
    @FindBy(id ="field-alias")
    private WebElement aliasInputField;
    @FindBy(id = "field-address1")
    private WebElement addressInputField;
    @FindBy(id = "field-city")
    private WebElement cityInputField;
    @FindBy(id = "field-postcode")
    private WebElement postalCodeInputField;
    @FindBy (id = "field-phone")
    private WebElement phoneInputField;
    @FindBy(xpath = "//*[@id=\"content\"]/div/div/form/footer/button")
    private WebElement saveNewAddressButton;
    @FindBy(xpath = "//*[@id=\"notifications\"]/div/article")
    private WebElement successAddressCreationMessage;

    public NewAddressPage(WebDriver driver) {
        super(driver);
    }
    public WebElement getAliasField() {
        return getVisibleElement(aliasInputField);
    }
    public WebElement getAddressInputField() {
        return getVisibleElement(addressInputField);
    }
    public WebElement getCityInputField() {
        return getVisibleElement(cityInputField);
    }
    public WebElement getPostalCodeInputField() {
        return getVisibleElement(postalCodeInputField);
    }
    public WebElement getPhoneInputField() {
        return getVisibleElement(phoneInputField);
    }
    public WebElement getSaveNewAddressButton() {
        return getVisibleElement(saveNewAddressButton);
    }
    public WebElement getSuccessAddressCreationMessage() {
        return getVisibleElement(successAddressCreationMessage);
    }
    public void fillAliasInputField(String firstName){
        getAliasField().clear();
        getAliasField().sendKeys(firstName);
    }
    public void fillAddressInputField(String address){
        getAddressInputField().clear();
        getAddressInputField().sendKeys(address);
    }
    public void fillCityInputField(String cityName){
        getCityInputField().clear();
        getCityInputField().sendKeys(cityName);
    }
    public void fillPostalCodeInputField(String postalCode){
        getPostalCodeInputField().clear();
        getPostalCodeInputField().sendKeys(postalCode);
    }
    public void fillPhoneInputField(String phoneNumber){
        getPhoneInputField().clear();
        getPhoneInputField().sendKeys(phoneNumber);
    }
    public void clickSaveNewAddressButton(){
        getSaveNewAddressButton().click();
    }
    public String receiveSuccessMessage(){
        return getSuccessAddressCreationMessage().getText();
    }

}
