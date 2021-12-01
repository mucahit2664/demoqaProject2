Feature:US14_Accordian.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Widgets accordionunu tiklar
    And Kulanici acilan sekmede Accordian basligini tiklar.

    Scenario: TC_01_Accordian
      And What is Lorem Ipsum butonuna tiklar
      Then  What is Lorem Ipsum yazisini dogrular
