@us3
Feature: US03_RadioButton
  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And radiobox butonuna tiklayiniz
  Scenario: TC01


    And yes Buttonunu tiklayiniz
    Then Yes secildigini dogrulayiniz




  Scenario: TC02
    And impresive butonuna tiklayiniz
    Then impresive yazisini dogrulayiniz
    Then yes buton tikli olmadigini dogrulayin



  Scenario: TC03
    And no butonunu seciniz
    Then no butonunun secildigini  dogrulayiniz



