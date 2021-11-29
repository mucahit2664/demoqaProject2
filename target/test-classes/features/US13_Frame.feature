Feature:US13_Alerts.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Alerts, Frame & Windows accordionunu tiklar



    Scenario: TC_01_Frameler_arasinda gecisler yapilabilir olmalidir
      And Kulanici acilan sekmede Frames basligini tiklar.
      Then frameler arasinda gecis oldugu dogrulanabilir

      Scenario: TC_02_NestedFrames_arasinda gecisler yapilabilir olmalidir
        And Kulanici acilan sekmede NestedFrames basligini tiklar.
        Then nestedFrame arasinda gecis oldugu dogrulanabiir


        Scenario: TC_03_smallModal_Dialogs
          And Kulanici acilan sekmede modalDialogs basligini tiklar.
          And Kullanici acilan sayfada smallModal buonuna tiklar
          Then Kullanici "This is a small modal. It has very less content"mesaji gorur
          Then Kullanici close butonuna basildiginda smallModalin kapandigini dogrular

          Scenario: TC_04_large_Modals
            And Kulanici acilan sekmede modalDialogs basligini tiklar.
          And Kullanici acilan sayfada largeModal buonuna tiklar
          Then Kullanici mesaji gorur
          Then Kullanici close butonuna basildiginda largeModalin kapandigini dogrular
