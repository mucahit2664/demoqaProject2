Feature: US10_Forms.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Forms  accordionunu tiklar
    And Kullanici acilan sekmede Practice Forms butonu tiklar



    Scenario: TC_01_Sayfada Forms tiklananbilir olmali

    Then Kullanici acilan sayfada Student Registration Form oldugunu dogrular.

      Scenario: TC_02_firstname_bilgisii girilmeli
        And Kullanici acilan sayfada firstname bilgisini girer.
        And submid butonuna tiklayiniz
        And firstname kabul edildigini dogrulayiniz
    Scenario: TC_03_invalidfirstname
      And firstname bos birakilmamalidir
      And submit butonuna tiklayiniz
      Then firsatname bos birakilamadigini dogrulayin
  Scenario: TC_04_lastname_bilgisini_girmeli
    Then Kullanici acilan sayfada lastname bilgisini girer.
    And submit butonuna tiklayiniz
    And lastname kabul edildigini dogrulayiniz
    Scenario: TC_05_invalidLastname
      Then lastname bos birakilmamalidir
      And submit butonuna tiklayiniz
      Then lastname bos birakilamadigini dogrulayin
  Scenario: TC_06_Ogrenci_email_bilgisini_verilen_sartlara_uygun_girmelidir.
     Given Kullanici email bilgisini .'@, seklinde girmek zorundadir.
    And submit butonuna tiklayiniz
  Then  email dogru girldigini dogrulayin

    Scenario: TC_07_email bilgiisi"@" icermelidir
      Then Kullanici email bilgisini at olmadan girer
      And submit butonuna tiklayiniz
      Then kabul edilmedigini dogrular
  Scenario: TC_08_email bilgiisi"." icermelidir
    Then Kullanici email bilgisini nokta olmadan girer
    And submit butonuna tiklayiniz
    Then kabul edilmedigini dogrular