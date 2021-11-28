Feature:US13_Alerts.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Alerts, Frame & Windows accordionunu tiklar
    And Kulanici acilan sekmede Frames basligini tiklar.

    Scenario: TC_01_Frameler_arasinda gecisler yapilabilir olmalidir
      Then frameler arasinda gecis oldugu dogrulanabilir