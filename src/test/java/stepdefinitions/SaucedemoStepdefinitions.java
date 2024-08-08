package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import pages.SaucedemoPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class SaucedemoStepdefinitions {
    String secilenUrunIsmi="";
     SaucedemoPage saucedemoPage=new SaucedemoPage();

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configReader) {
         Driver.getDriver().get(ConfigReader.getProperty(configReader));
    }
    @Given("{int}  saniye bekler")
    public void saniye_bekler(Integer saniye) {
        ReusableMethods.bekle(saniye);
    }
    @Then("saucedemo username kutusuna {string} yazar")
    public void saucedemo_username_kutusuna_yazar(String username) {
        saucedemoPage.usernameKutusu.sendKeys(username);

    }
    @Then("saucedemo password kutusuna {string} yazar")
    public void saucedemo_password_kutusuna_yazar(String passwrod) {
        saucedemoPage.passwordKutusu.sendKeys(passwrod);
            }
    @Then("saucedemo login tusuna basar")
    public void saucedemo_login_tusuna_basar() {
         saucedemoPage.loginButonu.click();
    }
    @Then("ilk urunun ismini kaydeder ve bu urunun sayfasina gider")
    public void ilk_urunun_ismini_kaydeder_ve_bu_urunun_sayfasina_gider() {
       secilenUrunIsmi=saucedemoPage.tumUrunElementleriList.get(0).getText();
        saucedemoPage.tumUrunElementleriList.get(0).click();
    }
    @When("saucedemo add to Cart butonuna basar")
    public void saucedemo_add_to_cart_butonuna_basar() {
        saucedemoPage.addToCartButonu.click();
    }
    @Then("saucedemo alisveris sepetine tiklar")
    public void saucedemo_alisveris_sepetine_tiklar() {
        saucedemoPage.alisverisSepetiLinki.click();
    }
    @Then("sectigi urunun basarili olarak sepete eklendigini test eder")
    public void sectigi_urunun_basarili_olarak_sepete_eklendigini_test_eder() {
    String sepettekiurun=saucedemoPage.sepettekiUrunIsimElementi.getText();
    Assertions.assertEquals(sepettekiurun,secilenUrunIsmi);
    }


}