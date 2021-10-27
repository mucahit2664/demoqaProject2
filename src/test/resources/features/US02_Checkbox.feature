@ft2

Feature:US02_CheckBox

  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And checkbox butonuna tiklayiniz


  Scenario:TC01_ARTIBUTONU
    And sum butona basiniz
    And excel file seciniz
    Then Excelin secili oldugunu dogrulayiniz
    Then menunun acik oldugunu dogrulayiniz


  Scenario:TC02_EKSIBUTONU
    And eksi butonunu tiklayiniz
    Then menunun kapali oldugunu dogrulayiniz

