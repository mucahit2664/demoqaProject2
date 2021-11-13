Feature: US10_Forms.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Forms  accordionunu tiklar
    And Kullanici acilan sekmede Practice Forms butonu tiklar



    Scenario: TC_01_Sayfada Forms tiklananbilir olmali

    Then Kullanici acilan sayfada Student Registration Form oldugunu dogrular.

  Scenario: TC02_Valid degerlerle dogrulama yapin


    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2
    And Resim seciniz

    And Current Adres giriniz
    And State seciniz
    And City seciniz
    Then Submiti Tiklayin
    Then Onaylandigini dogrulayin
