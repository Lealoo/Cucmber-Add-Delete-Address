import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HeaderPage;
import pages.LogInPage;
import pages.NewAddressPage;
import pages.YourAccountPage;

public class AddDeleteAddress {

    private WebDriver driver;

    @Before
    public void before(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mystore-testlab.coderslab.pl/");

    }


    @Given("User is on the mystore-testlab.coderslab.pl page, logged in")
    public void userIsOnTheMystoreTestlabCoderslabPlPageLoggedIn() {
        HeaderPage headerPage = new HeaderPage(driver);
        LogInPage logInPage = new LogInPage(driver);

        headerPage.clickUserSignInButton();
        logInPage.fillEmailInputField("luckykate@mail.com");
        logInPage.fillPasswordInputField("luckyme1234");
        logInPage.clickSignInButton();
    }

    @And("Addresses button is clicked")
    public void addressesButtonIsClicked() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickAddressesButton();
    }

    @When("Create new address is clicked")
    public void createNewAddressIsClicked() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickCreateNewAddressButton();
    }

    @And("Address form is filled with data: {} {} {} {} {}")
    public void addressFormIsFilledWithData(String alias, String address, String city, String postalCode, String phoneNumber) {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.fillAliasInputField(alias);
        newAddressPage.fillAddressInputField(address);
        newAddressPage.fillCityInputField(city);
        newAddressPage.fillPostalCodeInputField(postalCode);
        newAddressPage.fillPhoneInputField(phoneNumber);
    }

    @And("Save button is clicked")
    public void saveButtonIsClicked() {
        NewAddressPage newAddressPage = new NewAddressPage(driver);
        newAddressPage.clickSaveNewAddressButton();
    }

    @Then("success adding address message is present")
    public void successAddingAddressMessageIsPresent() {
        NewAddressPage newAddressPage = new NewAddressPage(driver);

        String successMessage = newAddressPage.receiveSuccessMessage();
        Assert.assertEquals("Address successfully added!", successMessage);
    }

    @When("Delete button in clicked on the second address on the page")
    public void deleteButtonInClickedOnTheSecondAddressOnThePage() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);
        yourAccountPage.clickDeleteAddressButton();
    }

    @Then("success deleting address message is present")
    public void successDeletingAddressMessageIsPresent() {
        YourAccountPage yourAccountPage = new YourAccountPage(driver);

        String successMessage = yourAccountPage.receiveDeleteSuccessMessage();
        Assert.assertEquals("Address successfully deleted!", successMessage);
    }

    @After
    public void after(){
        driver.quit();
    }
}
