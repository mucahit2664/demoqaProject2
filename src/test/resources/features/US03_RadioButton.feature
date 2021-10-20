@us3
Feature: US03_RadioButton
  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And radioButton butonuna basiniz
  Scenario: TC01

    And yes butonuna basiniz
    Then yes butonuna basinca cikan yaziyi dogrulayin



  Scenario: TC02
    And Impresive butonuna tiklayiniz
    Then İmpersive yazisini dogrulayiniz
    Then Yes butonunun secili olmadigini dogrulayin


  Scenario: TC03
    Then No butonunun secildigini  dogrulayiniz