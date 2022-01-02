Feature: US17_Tabs


  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar


Scenario: TC_01 Menu
  Given Kullanici Menu sekmesini tiklar

Then Kullanici SubItemlerin gorunmedigini dogrular
And Kullanici mouse Mainıtem1 uzerine getirir
Then Kullanici SubItemlerin gorunmedigini dogrular
Then Kullanici SubSubItemlerin gorunmedigini dogrular
And Kullanici mouse Mainıtem3 uzerine getirir
Then Kullanici SubItemlerin gorunmedigini dogrular
Then Kullanici SubSubItemlerin gorunmedigini dogrular
And Kullanici mouse Mainıtem2 uzerine getirir
Then Kullanici SubItemlerin gorundugunu dogrular
And Kullanici mouse subItem1 uzerine getirir
Then Kullanici SubSubItemlerin gorunmedigini dogrular
And Kullanici mouse subItem2 uzerine getirir
Then Kullanici SubSubItemlerin gorunmedigini dogrular
And Kullanici mouse subublist uzerine getirir
Then Kullanici SubSubItemlerin gorundugunu dogrular


 Scenario: TC_02_Menu
   Given Kullanici Menu sekmesini tiklar
   Then Kullanici uc tane main-item oldugunu dogrular
   And Kullanici mouse Mainıtem2 uzerine getirir
   Then Kullanici iki tane sub-item ve birtane sub-sub list oldugunu dogrular


   Scenario: TC_03
     Given Kullanici Menu sekmesini tiklar
     And Kullanici mouse Mainıtem2 uzerine getirir
     And Kullanici mouse subublist uzerine getirir
    Then Kullanici sekiz tane linkin oldugunu ve isimlerini dogrular

     | Main Item 1      |
     | Main Item 3      |
     | Main Item 2      |
     | Sub Item         |
     | Sub Item         |
     |  SUB SUB LIST »   |
     | Sub Sub Item 1   |
     | Sub Sub Item 2   |


  Scenario: TC_04

    And Kullanici Select Menu sekmesini tiklar
    And Kullanici select Option dropdownunu tiklar ve toplam kac tane secenek oldugunu dogrular

      |Group 1, option 1|
  |Group 1, option 2|
  |Group 2, option 1|
  |Group 2, option 2|
  |A root option|
  |Another root option |


  Scenario: TC_05

    And Kullanici Select Menu sekmesini tiklar
    And Kullanici select Title dropdownunu tiklar ve toplam kac tane secenek oldugunu dogrular

      |Dr.|
      |Mr.|
      |Mrs.|
      |Ms.|
      |Prof.|
      |Other |
Scenario: TC_06

    And Kullanici Select Menu sekmesini tiklar
    Then Kullanici select Old dropdownunu tiklar ve renklerin degerlerini dogrular

  |Red|
  |Blue|
  |Green|
  |Yellow|
  |Purple|
  |Black |
  |White|
  |Voilet|
  |Indigo|
  |Magenta|
  |Aqua|




