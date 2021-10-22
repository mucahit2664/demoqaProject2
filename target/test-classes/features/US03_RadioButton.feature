@us3
Feature: US03_RadioButton
  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And radioButton butonuna basiniz
  Scenario: TC01

    And yes buttonunu  tiklayiniz
    Then yes butonuna basinca cikan yaziyi dogrulayin



  Scenario: TC02
    And Impresive butonuna tiklayiniz
    Then İmpersive yazisini dogrulayiniz
    Then Yes butonunun secili olmadigini dogrulayin


  Scenario: TC03
Then No butonunu seciniz
    Then No butonunun secildigini  dogrulayiniz