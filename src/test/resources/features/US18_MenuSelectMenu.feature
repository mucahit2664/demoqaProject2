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


 Scenario Outline: TC_02 Menu
   Then Kullanici uc tane main-item oldugunu dogrular
    Then Kullanici iki tane sub-item ve birtane sub-sub list oldugunu dogrular
    Then Kullanici sekiz tane linkin oldugunu ve "<isimlerini>" dogrular
   Examples:
     | isimlerini |