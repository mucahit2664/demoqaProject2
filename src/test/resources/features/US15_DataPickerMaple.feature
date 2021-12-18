Feature: US_16_

  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar




Scenario: TC_05_Date_Picker
  And kullanici dataPicker sekmesini acar
 And Kullanici takvimi tiklar
And Kullanici YIL,AY,GUN secer
| Year | Month | Day |
| 2024 | May     | 12  |
  Then Kullanici date and time secilebildigini dogrular