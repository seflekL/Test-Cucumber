package runners;

import io.cucumber.junit.platform.engine.Constants;
import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("src/test/java")
@ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features/wip")
@ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions")
//@ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
@ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, json:target/json-reports/cucumberRapor.json")
//@ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, junit:target/xml-report/cucumber.xml")


public class Runner_WipKlasoru {

}
/*
    Runner class'i bos bir class'dir, yani body'sinde kod yoktur.
    Runner class'inda isleri kullandigimiz notasyonlar yapar

    @IncludeEngines("cucumber") : bu class'in cucumber ile calisacagini belirtir
    @SelectClasspathResource("src/test/java") : Java kodlarini bulacagimiz dosya yolu
    @ConfigurationParameter(key = Constants.FEATURES_PROPERTY_NAME,value = "src/test/resources/features/wip"):
                            feature dosyalarini nerede bulacagini gosteren dosya yolu
    @ConfigurationParameter(key = Constants.GLUE_PROPERTY_NAME,value = "stepdefinitions") :
                            feature dosyalarini java ile birlestirecek kodlarin oldugu dosya yolu
    @ConfigurationParameter(key = Constants.FILTER_TAGS_PROPERTY_NAME,value = "@wip")
                            features klasoru altinda calismasini istedigimiz feature dosyalarini
                            secebilecegimiz TAG
                            Runner class'i calistirildiginda features klasoru altindaki
                            tum scnerio ve feature'lari gozden gecirip,
                            yazdigimiz TAG'a sahip olan scenario/feature'lari calistirir

                            Bu sekilde TAG ile calistirdigimizda
                            calismasini istedigimiz feature/scenario'lari calistirmanin yaninda
                            calistirilmayacak feature/scenario'lari da yazip onlari skipped olarak isaretler

                            EGER sadece istedigimiz Feature calissin isterseniz
                            features klasoru altinda yeni bir alt klasor olusturabiliriz
                            belirlenmis bir feature uzerinde calisirken, feature'i wip klasorune tasiyip calistirabiliriz
                            ONEMLI NOT : eger tum feature'lar ile ilgili bir calistirma yapacaksak
                                         feature dosya yolunu duzeltmeliyiz

   @ConfigurationParameter(key = Constants.EXECUTION_DRY_RUN_PROPERTY_NAME,value = "false")
                            calistirmak istediginiz butun scenario/feature'lari gozden gecirip
                            scenario/feature'lari calistirmadan eksik stepdefinition varsa
                            bize raporlamasi ve eksik adimlari olusturmasi icin value="true"

                            value="true" olarak yazildiginda, Runner calistirilirsa
                            testleri calistirmadan kontrol ettigi icin
                            eksik adim yoksa test passed olarak raporlar

                            hata yapmamak icin eksik adimlari belirlemek adina value true yapilip
                            eksik adimlar belirlendikten sonra hemen value false'a dondurulmelidir

 @ConfigurationParameter(key = Constants.PLUGIN_PROPERTY_NAME,value = "pretty, html:target/cucumber-report/HtmlReport.html")
                            otomatik olarak HTML rapor olusturulmasini saglar
                            dosya yolu html:target/cucumber-report/HtmlReport.html
                            secildigi icin Runner her calistiginda HtmlReport isminde dosya olusturup
                            onceki raporun uzerine kaydeder
                            eger raporun kaybolmasi ve uzerine kayit yapilmasini istemezseniz
                            yukardaki paraetrede dosya yolunu degistirebilirsiniz

 */