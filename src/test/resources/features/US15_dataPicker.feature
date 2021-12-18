Feature: US_14_dataPicker_maple

  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar
    And kullanici dataPicker sekmesini acar



  Scenario Outline: TC_01
    And Kullanici takvimi tiklar
    And Kullanici "<yil>","<ay>","<gun>" girer
    And Kullanici "<yil>","<ay>","<gun>" girdiginin sonucunu dogrular

    Examples:
      | yil  | ay | gun |
      | 1971 | 03 | 12  |
      | 2000 | 12 | 31  |
      | 1999 | 01 | 01  |
      | 2100 | 12 | 12  |
      | 1999 | 02 | 28   |

  Scenario: TC_03_dateAndTime

    And Kullanici date and time girilecek selectboxa tiklar
    And Kullanici tablodan time secer "20:45"
   # Then Kullanici date and time secildigini dogrular