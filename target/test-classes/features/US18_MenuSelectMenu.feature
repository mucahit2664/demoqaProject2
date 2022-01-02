Feature: US17_Tabs


  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar
    Given Kullanici Menu sekmesini tiklar

Scenario: TC_01 Menu


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
   Then Kullanici uc tane main-item oldugunu dogrular
   And Kullanici mouse Mainıtem2 uzerine getirir
   Then Kullanici iki tane sub-item ve birtane sub-sub list oldugunu dogrular


   Scenario: TC_03
     And Kullanici mouse Mainıtem2 uzerine getirir
     And Kullanici mouse subublist uzerine getirir
    Then Kullanici sekiz tane linkin oldugunu ve isimlerini dogrular
      | arg0           |
      | Main Item   1  |
      | Main Item  3   |
      | Main Item   2  |
      | Sub Item       |
      | Sub Item       |
      | SUB SUB LIST   |
      | Sub Sub Item 1 |
      | Sub Sub Item 2 |

