package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class AutomationExcerciseStepdefinations {
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AutomationExcercise automationExcercise = new AutomationExcercise();
    Faker faker = new Faker();

    @Given("Navigate to url {string}")
    public void navigate_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));
    }

    @Then("Verify that home page is visible successfully")
    public void verify_that_home_page_is_visible_successfully() {
        Assertions.assertTrue(automationExcercise.logoElementi.isDisplayed());
    }

    @Then("Click on {string} button")
    public void click_on_button(String SignUpButton) {
        automationExcercise.signupLoginButtonElementi.click();
    }

    @Then("Verify {string} is visible")
    public void verify_is_visible(String string) {
        Assertions.assertTrue(automationExcercise.newUserSignupTextElementi.isDisplayed());
    }

    @Then("Enter name and email")
    public void enter_name_and_email() {
        automationExcercise.signupNameBoxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.signupEmailboxElementi.sendKeys(faker.internet().emailAddress());
    }

    @Then("Click {string} button")
    public void click_button(String string) {
        automationExcercise.signupButtonElementi.click();
    }

    @Then("Verify that {string} is visible")
    public void verify_that_is_visible(String string) {
        Assertions.assertTrue(automationExcercise.EnterAccountInfoElementi.isDisplayed());
    }

    @Then("Fill details: Title, Name, Email, Password, Date of birth")
    public void fill_details_title_name_email_password_date_of_birth() {
        automationExcercise.mrBoxbuttonElementi.click();
        automationExcercise.nameBoxWebelementi.sendKeys(faker.funnyName().name());
        automationExcercise.passwordBoxElementi.sendKeys(faker.internet().password());
        Select selectday = new Select(automationExcercise.dayDDMElementi);
        selectday.selectByValue("20");
        Select selectay = new Select(automationExcercise.monthDDMElementi);
        selectay.selectByValue("8");
        Select selectYil = new Select(automationExcercise.yearsDDMElementi);
        selectYil.selectByValue("1985");
        ReusableMethods.bekle(2);

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adressfirstnameBoxinElementi);
        ReusableMethods.bekle(10);

    }

    @Then("Select checkbox {string}")
    public void select_checkbox(String string) {
        ReusableMethods.bekle(2);
        automationExcercise.signupCheckBoxElementi.click();
        automationExcercise.receiveSpecialButtonElementi.click();
    }

    @Then("Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
    public void fill_details_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() {
        automationExcercise.adressfirstnameBoxinElementi.sendKeys(faker.backToTheFuture().character());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adresslastnameBoxinElementi);
        ReusableMethods.bekle(4);
        automationExcercise.adresslastnameBoxinElementi.sendKeys(faker.funnyName().name());
        automationExcercise.adresscompanyBoxinElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().character());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adressAdressElementi);
        ReusableMethods.bekle(2);
        automationExcercise.adressAdressElementi.sendKeys("112 Marsica Ln");
        automationExcercise.addresstateAdressBoxElementi.sendKeys(faker.address().state());
        Select countryDDM = new Select(automationExcercise.adresscontryDDMElementi);
        countryDDM.selectByValue("Canada");
        automationExcercise.adresscityBoxElementi.sendKeys(faker.address().cityName());
        automationExcercise.addressZipboxElementi.sendKeys(faker.address().zipCode());
        automationExcercise.adressMobileElementi2.sendKeys(faker.phoneNumber().phoneNumber());

    }

    @Then("Click {string}")
    public void click(String string) {
        automationExcercise.createbuttonElementi.click();
        Assertions.assertTrue(automationExcercise.accountCreatedTextWebElementi.isDisplayed());
        ReusableMethods.bekle(1);

    }

    @Then("Click  Continue button")
    public void click_continue_button() {
        automationExcercise.createbuttonElementi.click();

    }
    @Then("Verify that L0ogged in as username is visible")
    public void verify_that_l0ogged_in_as_username_is_visible() {
        Assertions.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());

    }
    @Then("Click Delete Account button")
    public void click_delete_account_button() {
        automationExcercise.deleteAccountElementi.click();     }
    @Then("Verify that CCOUNT DELETED! is visible and click Continue button")
    public void verify_that_ccount_deleted_is_visible_and_click_continue_button() {
        Assertions.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();

    }
    @Then("Click  Continue button2")
    public void click_continue_button2() {
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();
    }

    @Given("Navigate to url autoUrl")
    public void navigate_to_url_auto_url() {
        Driver.getDriver().get(ConfigReader.getProperty("autoUrl"));

    }
    @Then("Click on Signup\\/Login button")
    public void click_on_signup_login_button() {
        automationExcercise.signupLoginButtonElementi.click();

    }
    @Then("Verify New User Signup! is visible")
    public void verify_new_user_signup_is_visible() {
        Assertions.assertTrue(automationExcercise.newUserSignupTextElementi.isDisplayed());

    }
    @Then("Enter name and already registered email address")
    public void enter_name_and_already_registered_email_address() {
        automationExcercise.signupNameBoxElementi.sendKeys("niko");
        automationExcercise.signupEmailboxElementi.sendKeys("niko@niko.com");
    }
    @Then("Click Signup button")
    public void click_signup_button() {
        automationExcercise.signupButtonElementi.click();

    }
    @Then("Verify error {string} is visible")
    public void verify_error_is_visible(String string) {
        Assertions.assertTrue(automationExcercise.emailAdressAlreadyExistElemneti.isDisplayed());

    }


    @And("Click on SignupLogin button")
    public void clickOnSignupLoginButton() {
        automationExcercise.signupLoginButtonElementi.click();

            }
    @Then("Click on Contact Us button")
    public void click_on_contact_us_button() {
        automationExcercise.contactUsElementi.click();

    }
    @Then("Verify GET IN TOUCH is visible")
    public void verify_get_in_touch_is_visible() {

        Assertions.assertTrue(automationExcercise.contactUSgetintouchTextElmenti.isDisplayed());
    }
    @Then("Enter name, email, subject and message")
    public void enter_name_email_subject_and_message() {
        automationExcercise.contactUsNameboxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.contactUsEmailBoxElementi.sendKeys(faker.internet().emailAddress());
        automationExcercise.contactUSsubjectBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().character());
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});",automationExcercise.contactUsBodyBoxElementi);
        ReusableMethods.bekle(1);
        automationExcercise.contactUsBodyBoxElementi.sendKeys(faker.backToTheFuture().quote());
    }
    @Then("Upload file")
    public void upload_file() {

        Driver.getDriver().findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("C:\\Users\\levoo\\Desktop\\WiseQuarter\\1699.png");

    }
    @Then("Click Submit  button")
    public void click_submit_button() {
        ReusableMethods.bekle(5);

    }
    @Then("Click OK button")
    public void click_ok_button() {
        automationExcercise.contactUsSubmitButtonElementi.click();
        Driver.getDriver().switchTo().alert().accept();
        ReusableMethods.bekle(2);
    }
    @Then("Verify success message {string} is visible")
    public void verify_success_message_is_visible(String string) {
        Assertions.assertTrue(automationExcercise.contactUsSuccesTextElementi.isDisplayed());

    }
    @Then("Click {string} button and verify that landed to home page successfully")
    public void click_button_and_verify_that_landed_to_home_page_successfully(String string) {
        automationExcercise.contactUSHomeButton.click();
        ReusableMethods.bekle(2);
        Driver.quitDriver();
    }

}
