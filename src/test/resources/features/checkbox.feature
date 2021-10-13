@check
Feature:Checkbox

  Scenario: CHECKBOX DOGRULAMA
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And checktbox butonuna tiklayiniz
    And + butonuna basınız
    And butun mnenunun acildigini dogrulayin
    And eksibutonuna basiniz
    Then menunun kapalı oldugunu dogrulayiniz
    And + butonuna basınız
    Then excelfile butonu basin
    Then excelfile butonu secili oldugunu dogrulayin
