Feature: US_15_Widgets_DataPicker

  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar
    And kullanici dataPicker sekmesini acar

    Scenario: TC_01_
      And Kullanici takvimi tiklar
      And rastgele ogum tarihi giriniz "valid"
          Then tarih gunumuzden ileride secilemedigini dogrulayin

  Scenario: TC_02
    And Kullanici takvimi tiklar
    And Kullanici Yil girer "2011"
    And Kullanici Ayi girer 10
    And Kullanici Gunu secer 25
    Then dogru tarih oldugunu test ediniz


  Scenario: TC_03 ileri tarih girme
    And Kullanici zamanbox i tiklar tiklar
    And Kullanicizaman bolumune Ayi girer 10
    And Kullanici zaman bolumune Yil girer "2011"
    And Kullanici zaman bolumune Gunu secer 25

