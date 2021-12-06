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


  Scenario:TC_17_Sayfada small ve Large  modal butonlari tiklanabilir olmalı

    And Kulanici acilan sekmede Modal Dialogs basligini tiklar
    Then Kullanici small butonunun tiklanabilir oldugunu dogrular
    Then Kullanici Large modal butonunun tiklanabilir oldugunu dogrular


  Scenario:TC_18_Small modal Butonu ile Small modal Diyalog penceresi acilmali
    And Kulanici acilan sekmede Modal Dialogs basligini tiklar
    And kullanici Small modal butonunu tiklar
    Then Kullanici yeni bir small modal acildigini dogrular
    Then kullanici small close butonunun enable oldugunu dogrular


  Scenario:TC_19
    And Kulanici acilan sekmede Modal Dialogs basligini tiklar
    And kullanici Large modal butonunu tiklar
    Then kullanici Yeni Bir Genis Model Diyalog Acildigini Dogrular
    Then kullanici large close butonunun enable oldugunu dogrular

  Scenario: TC_20
    And Kulanici acilan sekmede Modal Dialogs basligini tiklar
    And kullanici Large modal butonunu tiklar
    And kullanici "message" ı goruntuler:
      """
    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
      """


  Scenario: TC_21
    And Kulanici acilan sekmede Modal Dialogs basligini tiklar
    And kullanici Large modal butonunu tiklar
    And kullanici goruntuler
    """
    Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.
      """

