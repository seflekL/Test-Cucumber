package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.AutomationExcercise;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.List;

public class AutomationExcerciseStepdefinations {
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AutomationExcercise automationExcercise = new AutomationExcercise();
    Faker faker = new Faker();
    WebDriver driver;
    WebDriverWait wait;

    @Given("navigate to url {string}")
    public void navigate_to_url(String verilenDeger) {
        Driver.getDriver().get(ConfigReader.getProperty(verilenDeger));
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
        automationExcercise.deleteAccountElementi.click();
    }

    @Then("Verify that CCOUNT DELETED! is visible and click Continue button")
    public void verify_that_ccount_deleted_is_visible_and_click_continue_button() {
        Assertions.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();

    }

    @Then("Click  Continue button2")
    public void click_continue_button2() {
        Driver.getDriver().findElement(By.xpath("//*[text()='Continue']")).click();
    }

    @Given("navigate to url autoUrl")
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
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.contactUsBodyBoxElementi);
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


    @Then("Verify automationExercise's home page is visible successfully")
    public void verifyAutomationExerciseSHomePageIsVisibleSuccessfully() {
        Assertions.assertTrue(automationExcercise.logoElementi.isDisplayed());
    }

    @And("click on Test Cases button")
    public void clickOnTestCasesButton() {
        automationExcercise.testcaseLoginButton.click();
    }

    @And("Verify user is navigated to test cases page successfully")
    public void verifyUserIsNavigatedToTestCasesPageSuccessfully() {
        Assertions.assertTrue(automationExcercise.testCaseTitle.isDisplayed());
    }

    @And("close the page")
    public void closeThePage() {
        Driver.quitDriver();
    }

    @And("Click on Products button")
    public void clickOnProductsButton() {
        automationExcercise.productLinkElementi.click();

    }

    @And("user is navigated to ALL PRODUCTS page successfully")
    public void userIsNavigatedToALLPRODUCTSPageSuccessfully() {
        Assertions.assertTrue(automationExcercise.categoryMainLogo.isDisplayed());

    }

    @And("products list is visible")
    public void productsListIsVisible() {
        Assertions.assertTrue(automationExcercise.categoryproductList.size() > 0);

    }

    @And("on View Product of first product")
    public void onViewProductOfFirstProduct() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(3);
        automationExcercise.categoryFirstProductLink.click();
    }

    @And("is landed to product detail page")
    public void isLandedToProductDetailPage() {
        String expectedUrl = "https://automationexercise.com/product_details/1";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assertions.assertEquals(actualUrl, expectedUrl);

    }

    @And("Verify that detail detail is visible: product name, category, price, availability, condition, brand")
    public void verifyThatDetailDetailIsVisibleProductNameCategoryPriceAvailabilityConditionBrand() {
        String expectedBrandWord = "Brand: Polo";
        String actualBrandWord = automationExcercise.categoryFirstProductBrandElementi.getText();
        Assertions.assertTrue(actualBrandWord.contains(expectedBrandWord));
        System.out.println(actualBrandWord);
        String expectedCondtion = "Condition: New";
        String actualProductConditionElementi = automationExcercise.categoryFristProductCondtionElementi.getText();
        System.out.println(actualProductConditionElementi);
        Assertions.assertTrue(actualProductConditionElementi.contains(expectedCondtion));
        String expectedproductAvialiability = "Availability: In Stock";
        String actualProductvialiability = automationExcercise.categoryFirstProductavaibilityStock.getText();
        System.out.println(actualProductvialiability);
        Assertions.assertTrue(actualProductvialiability.contains(expectedproductAvialiability));
        String expectedPrice = "Rs. 500";
        String actualProductPriceElementi = automationExcercise.categoryFirstProductPriceElementi.getText();
        System.out.println(actualProductPriceElementi);
        Assertions.assertTrue(actualProductPriceElementi.contains(expectedPrice));
        Driver.getDriver().close();

    }

    @Then("that home page is visible successfully")
    public void thatHomePageIsVisibleSuccessfully() {
        Assertions.assertTrue(automationExcercise.logoElementi.isDisplayed());
    }

    @And("Verify user is navigated to ALL PRODUCTS page successfully")
    public void verifyUserIsNavigatedToALLPRODUCTSPageSuccessfully() {
        String expectedUrl = "https://automationexercise.com/products";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(actualUrl, expectedUrl);
    }

    @And("Enter product name in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton() {
        automationExcercise.categorysearchProductBoxElementi.sendKeys("blue top");
        automationExcercise.getCategorysearchProductBoxButtonElementi.click();
    }

    @And("Verify SEARCHED PRODUCTS is visible")
    public void verifySEARCHEDPRODUCTSIsVisible() {
        List<WebElement> productElementlist = automationExcercise.categoryproductList;
        for (WebElement prudoctElmenteach : productElementlist) {
            System.out.println(prudoctElmenteach.getText());
            Assertions.assertTrue(prudoctElmenteach.isDisplayed());
        }


    }

    @And("Verify all the products related to search are visible")
    public void verifyAllTheProductsRelatedToSearchAreVisible() {
        Assertions.assertTrue(automationExcercise.categoryproductList.size() >= 1);
        System.out.println(automationExcercise.categoryproductList.size());
    }

    @And("Enter product name {string} in search input and click search button")
    public void enterProductNameInSearchInputAndClickSearchButton(String searchItem) {
        automationExcercise.categorysearchProductBoxElementi.sendKeys(searchItem);
        automationExcercise.getCategorysearchProductBoxButtonElementi.click();
    }

    @And("Scroll down to footer")
    public void scrollDownToFooter() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.footersubscribeEmailBox);
        ReusableMethods.bekle(3);
    }


    @And("Enter email address in input and click arrow button")
    public void enterEmailAddressInInputAndClickArrowButton() {
        automationExcercise.footersubscribeEmailBox.sendKeys(faker.internet().emailAddress());
        automationExcercise.footersubscribeButton.click();
    }

    @And("Verify success message You have been successfully subscribed! is visible")
    public void verifySuccessMessageYouHaveBeenSuccessfullySubscribedIsVisible() {
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

        WebElement visibileElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='alert-success alert']")));
        System.out.println(visibileElement.getText());
        Assertions.assertTrue(automationExcercise.footerSubscriptionTextElementi.isDisplayed());
    }


    @And("Verify text SUBSCRIPTION")
    public void verifyTextSUBSCRIPTION() {
        Assertions.assertTrue(automationExcercise.footerSubscriptionTextElementi.isDisplayed());

    }

    @And("Click Products button")
    public void clickProductsButton() {
        automationExcercise.productLinkElementi.click();

    }


    @And("Click Continue Shopping button")
    public void clickContinueShoppingButton() {
        automationExcercise.categoryContinueShoppingButtonElementi.click();

    }

    @And("Verify both products are added to Cart")
    public void verifyBothProductsAreAddedToCart() {
        System.out.println(automationExcercise.categoryproductListcartList.size());
        Assertions.assertTrue(automationExcercise.categoryproductListcartList.size() == 2);
    }

    @And("Verify their prices, quantity and total price")
    public void verifyTheirPricesQuantityAndTotalPrice() {

        String expectedfirstProductPrice = "Rs. 500";
        String expectedSeccondProductPrice = "Rs. 400";
        String expectedfirstProductQuantity = "1";
        String expectedSeccondProductQuantity = "1";
        String expectedfirstProductTotatlprice = "Rs. 500";
        String expectedSeccondProductTotalPRice = "Rs. 400";

        Assertions.assertEquals(expectedfirstProductPrice, automationExcercise.cartProduct1PriceElementi.getText());
        Assertions.assertEquals(expectedSeccondProductPrice, automationExcercise.cartProduct2PriceElementi.getText());
        Assertions.assertEquals(automationExcercise.cartProduct1QuantityElementi.getText(), expectedfirstProductQuantity);
        Assertions.assertEquals(automationExcercise.cartProduct2QuantityElementi.getText(), expectedSeccondProductQuantity);
        Assertions.assertEquals(automationExcercise.getCartProduct1TotalPriceElementi.getText(), expectedfirstProductTotatlprice);
        Assertions.assertEquals(automationExcercise.getCartProduct2TotalPriceElementi.getText(), expectedSeccondProductTotalPRice);
    }

    @And("Hover over first product and click Add to cart")
    public void hoverOverFirstProductAndClickAddToCart() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        Driver.getDriver().findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]")).click();

    }

    @And("Hover over second product and click Add to cart")
    public void hoverOverSecondProductAndClickAddToCart() {
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categorySeccondProductLinkWebElementi);
        automationExcercise.categorySeccondProductAddCartButtonElementi.click();
    }


    @And("Click View Product for any product on home page")
    public void clickViewProductForAnyProductOnHomePage() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        Driver.getDriver().findElement(By.xpath("(//*[@class='btn btn-default add-to-cart'])[1]"));
        automationExcercise.categoryFirstProductLink.click();

    }

    @And("Verify product detail is opened")
    public void verifyProductDetailIsOpened() {
        Assertions.assertTrue(automationExcercise.categoryFirstProductBrandElementi.isDisplayed());
        Assertions.assertTrue(automationExcercise.categoryFirstProductPriceElementi.isDisplayed());
        Assertions.assertTrue(automationExcercise.categoryFirstProductavaibilityStock.isDisplayed());
    }


    @And("Click Add to cart button")
    public void clickAddToCartButton() {
        automationExcercise.addtocartButton.click();

    }

    @And("Click View Cart button")
    public void clickViewCartButton() {
        automationExcercise.viewcartButtonElementi.click();

    }

    @And("Verify that product is displayed in cart page with exact quantity")
    public void verifyThatProductIsDisplayedInCartPageWithExactQuantity() {
        Assertions.assertEquals(automationExcercise.cartQuantityBoxElementi.getText(), "4");

    }

    @And("Increase quantity to {string}")
    public void increaseQuantityTo(String sayi) {
        automationExcercise.cartProductQuatityBoxElementi.sendKeys(Keys.DELETE);
        ReusableMethods.bekle(5);
        automationExcercise.cartProductQuatityBoxElementi.sendKeys(sayi);
    }


    @And("Add products to cart")
    public void addProductsToCart() {

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.categoryFirstProductLink);
        ReusableMethods.bekle(1);
        automationExcercise.categoryFirstProductLink.click();

    }

    @And("Click Cart button")
    public void clickCartButton() {
        automationExcercise.addtocartButton.click();
        automationExcercise.viewcartButtonElementi.click();
    }

    @And("Verify that cart page is displayed")
    public void verifyThatCartPageIsDisplayed() {
        String expectedUrl = "https://automationexercise.com/view_cart";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assertions.assertEquals(expectedUrl, actualUrl);

    }

    @And("Click Proceed To Checkout")
    public void clickProceedToCheckout() {
        automationExcercise.proceedcheckoutButtonElementi.click();

    }

    @And("Click RegisterLogin button")
    public void clickRegisterLoginButton() {
        automationExcercise.registerLoginButtonElementi.click();

    }

    @And("Fill all details in Signup and create account")
    public void fillAllDetailsInSignupAndCreateAccount() {
        automationExcercise.signupNameBoxElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.signupEmailboxElementi.sendKeys(faker.internet().emailAddress());
        automationExcercise.signupButtonElementi.click();
        automationExcercise.mrBoxbuttonElementi.click();
        automationExcercise.passwordBoxElementi.sendKeys("1234");
        Select selectDay = new Select(automationExcercise.dayDDMElementi);
        selectDay.selectByValue("1");
        Select selectMonth = new Select(automationExcercise.monthDDMElementi);
        selectMonth.selectByValue("8");
        Select selectYear = new Select(automationExcercise.yearsDDMElementi);
        selectYear.selectByValue("1900");
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.receiveSpecialButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.receiveSpecialButtonElementi.click();
        automationExcercise.adressfirstnameBoxinElementi.sendKeys(faker.funnyName().name());
        automationExcercise.adresslastnameBoxinElementi.sendKeys(faker.funnyName().name());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.adresscompanyBoxinElementi);
        ReusableMethods.bekle(1);
        automationExcercise.adresscompanyBoxinElementi.sendKeys(faker.backToTheFuture().character());
        automationExcercise.adressAdressElementi.sendKeys("hugogogo oleye oley");
        Select countryboxelementi = new Select(automationExcercise.adresscontryDDMElementi);
        countryboxelementi.selectByValue("Canada");
        automationExcercise.addresstateAdressBoxElementi.sendKeys("OT");
        automationExcercise.adresscityBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().quote());
        automationExcercise.addressZipboxElementi.sendKeys("1234");
        automationExcercise.adressMobileElementi2.sendKeys("1234567885");
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.createbuttonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.createbuttonElementi.click();

    }

    @And("Verify ACCOUNT CREATED! and click Continue button")
    public void verifyACCOUNTCREATEDAndClickContinueButton() {
        Assertions.assertTrue(automationExcercise.accountCreatedTextWebElementi.isDisplayed());
        automationExcercise.accountcreatedContinueButtonElementi.click();
        ReusableMethods.bekle(5);

    }

    @And("Verify  Logged in as username at top")
    public void verifyLoggedInAsUsernameAtTop() {
        Assertions.assertTrue(automationExcercise.loggedinASElementi.isDisplayed());

    }

    @And("Click Proceed To Checkout button")
    public void clickProceedToCheckoutButton() {
        automationExcercise.proceedcheckoutButtonElementi.click();

    }

    @And("Verify Address Details and Review Your Order")
    public void verifyAddressDetailsAndReviewYourOrder() {
        Assertions.assertTrue(automationExcercise.yourdeliveryaddressTExtElementi.isDisplayed());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutItemDescriptionBoxElementi);
        ReusableMethods.bekle(1);
        Assertions.assertTrue(automationExcercise.checkoutItemDescriptionBoxElementi.isDisplayed());
    }

    @And("Enter description in comment text area and click Place Order")
    public void enterDescriptionInCommentTextAreaAndClickPlaceOrder() {
        automationExcercise.checkoutpageBodyBoxElementi.sendKeys(faker.hitchhikersGuideToTheGalaxy().marvinQuote());
        jse.executeScript("arguments[0].scrollIntoView({block: 'center'});", automationExcercise.checkoutPlaceOrderButtonElementi);
        ReusableMethods.bekle(1);
        automationExcercise.checkoutPlaceOrderButtonElementi.click();
    }

    @And("Enter payment details: Name on Card, Card Number, CVC, Expiration date")
    public void enterPaymentDetailsNameOnCardCardNumberCVCExpirationDate() {
        automationExcercise.paymentnameOntheCardBox.sendKeys(faker.funnyName().name());
        automationExcercise.paymentCardNumberBoxElementi.sendKeys("1234578984564");
        automationExcercise.paymenCVCboxElementi.sendKeys("123");
        automationExcercise.paymentExpirationBoxElementi.sendKeys("03");
        automationExcercise.paymentYearCardBoxElementi.sendKeys("2090");
    }

    @And("Click Pay and Confirm Order button")
    public void clickPayAndConfirmOrderButton() {
        automationExcercise.paymentPayandConfirmButtonElementi.click();

    }

    @And("Verify success message Your order has been placed successfully!")
    public void verifySuccessMessageYourOrderHasBeenPlacedSuccessfully() {
        Assertions.assertTrue(automationExcercise.paymentdonepageCongratulationsorderconfirmedTextButton.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();
    }

    @And("Verify ACCOUNT DELETED! and click Continue button")
    public void verifyACCOUNTDELETEDAndClickContinueButton() {
        Assertions.assertTrue(automationExcercise.deleteAccountVerificationElementi.isDisplayed());
        automationExcercise.paymentDonneContinueButtonElementi.click();

        Driver.quitDriver();
    }

    @And("Click Cart button in header")
    public void clickCartButtonInHeader() {
        automationExcercise.headerCartButtonElementi.click();

    }

    @And("Click Signup-Login button")
    public void clickSignupLoginButton() {
        automationExcercise.signupLoginButtonElementi.click();

    }


    @And("Fill email, password and click Login button")
    public void fillEmailPasswordAndClickLoginButton() {
        automationExcercise.logintoyouraccountEmailBoxElementi.sendKeys("niko@niko.com");
        automationExcercise.logintoyouraccountPasswordBoxElementi.sendKeys("1234");
        automationExcercise.logintoyouraccountLoginButtonElementi.click();

    }
}


