
@radioButton
Feature: US03 RadioButton
  Scenario: TC01 radio buton gorunmesi
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    Then radioButton butonuna basiniz
    Then yes butonuna basiniz
    Then yes butonuna basinca cikan yaziyi dogrulayin
    Then Impressive butonuna basiniz
    Then Impressive basinca cikan yaziyi dogrulayin
    Then Impressive basinca yes butonundan secili olmadigini dogrulayin
    And no butonuna basiniz
    And no butonun seciligini dogrulayin