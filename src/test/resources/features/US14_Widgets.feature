Feature:Widgets

  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar


  Scenario: TC_01_Accordion
    And Kullanici Accordian sekmesini tiklar
    And Kullanici ilk acordian tiklar
    Then Kullanici digerlerinin kapalı oldugunu dogrular
    And Kullanici ikinci acordian tiklar
    Then Kullanici digerlerinin kapalı oldugunu dogrular
    And Kullanici ucuncu acordian tiklar
    Then Kullanici digerlerinin kapalı oldugunu dogrular


  Scenario: TC_02_AutoComplete multiple area  dropdownu calisyor mu
    And Kullanici AutoComplete sekmesini tiklar
    And Kullanici Multiple text alaninna tiklar
    And Kullanici bir veri secer "a"
    And Kullanici bir veri secer "a"
    And Kullanici bir veri secer "a"
    Then Kullanici Multiple text alaninna girdigi verilerin "a" icerdigini oldugunu dogrular

  Scenario: TC_03_AutoComplete  multiple area  dropdownu birden fazla veri kabul etmesi
    And Kullanici AutoComplete sekmesini tiklar
    And Kullanici Multiple text alaninna tiklar
    And Kullanici bir veri secer "a"
    And Kullanici bir veri secer "a"
    And Kullanici bir veri secer "a"
    Then Kullanici ayni text alaninda uc veri oldugunu dogrular


  Scenario: TC_04_AutoComplete single area dalanini calistirma
    And Kullanici AutoComplete sekmesini tiklar
    And  Kullanici single text alanina tiklar
    And Kullanici bir veri secer "a"
    And Kullanici bir veri secer "e"
    Then Kullanici birinci verinin olmadigini dogrular
    Then Kullanici ikinci verinin oldugunu dogrular

  Scenario: TC_05_Date_Picker
    And Kullanici date pickers sekmesini tiklar
    And Kullanici date girilecek selectboxa tiklar
    And Kullanici yil secer "2100"
    And Kullanici ay secer "April"
    And Kullanici gun secer 12
    Then Kullanici date and time secilebildigini dogrular

  Scenario: TC_06_dateAndTime
    And Kullanici date pickers sekmesini tiklar
    And Kullanici date and time girilecek selectboxa tiklar
    And Kullanici tablodan yil secer "2018"
    And Kullanici tablodan ay secer "May"
    And Kullanici gun secer 16
    And Kullanici tablodan time secer "20:45"
    Then Kullanici date and time secildigini dogrular





