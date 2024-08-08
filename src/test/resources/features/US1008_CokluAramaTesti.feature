
Feature: US1008 Kullanici coklu eleman aratir

  Scenario Outline: : TC16 kullanici coklu arama yapabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelilemler>" yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    Then 1 saniye bekler
    And sayfayi kapatir
    Examples:
      | aranacakKelilemler |
      | phone |
      | java |
      | Samsung |
      | apple |
      | nutella |


