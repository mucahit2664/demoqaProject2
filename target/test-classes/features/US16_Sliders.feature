Feature: US_16_sliders

  Background:
    Given demoqa anasayfaya gidin
    And kullanici widgets sekmesini acar


  Scenario: TC_01
    And Kullanici silders butonunu tiklar
    Then Kulanici sliderin saga kaydirabilecegini dogrular
    Then Kulanici sliderin sola kaydirabilecegini dogrular
    Then Kulanici sliderin en saga kaydirabilecegini dogrular
    Then Kulanici sliderin  en sola kaydirabilecegini dogrular
    Then Kulanici sliderin once sola sonra saga kaydirabilecegini dogrular

  Scenario: TC_02_Scenario_Outline


  Scenario: TC_03_Progress_Bar
    And Kullanici progressbar butonunu tiklar
    Then Kullanici start ikonuna basildiginda veri islendigini dogrular
    Then Kullanici veri islemeye basladiginda stop dugmesi ciktigini dogrular
    Then Kullanici veri islemi bittiginde cizginin yesile donmesi ve %100 yazisi reset yazisinin oldugunu dogrular

    Then Kullanici reset butonuna bastiginda tekrar basladigini dogrular

Scenario: TC_05_ToolTips
  And Kullanici tooltips butonunu tiklar
  And Kullanici mouse buttonun ustune getirir butonun uzerinde geldiginde renginin degistigini ve yazinin ciktigini dogrular
  And Kullanici hover me too see uzerine tiklar butona tikladiginda border-color renginin degistigini dogrular
  Then  Kullanici hover me too see uzerine geldiginde cikan texti dogrular





