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