Feature: US1002 Kullanici ortak baslangi adimlarini Background olarak yazilabilir

  Background:
    Given kullanici toUrl adresine gider

    Scenario: TC04 Kullanici testotomasyon.com phone aratip urun bulabilmeli
      Then arama kutusuna phone yazip aratir
      And arama sonucunda urun bulunabildigini test eder
      And sayfayi kapatir

      Scenario: TC05 Kullanici Testotomasyonu.com'da dress aratip urun bulabilmeli
        Then  arama kutusuna dress yazip aratir
        And arama sonucunda urun bulunabildigini test eder
        And sayfayi kapatir