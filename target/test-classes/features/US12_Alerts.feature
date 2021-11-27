Feature:US12_Alerts.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Alerts, Frame & Windows accordionunu tiklar
    And Kulanici acilan sekmede Alerts basligini tiklar.


  Scenario: TC_01_ilk "click me" butonuna tiklandiginda alert hemen açilmali

    And Kullanici ilk alertme butonuna tiklar.
    Then Kullanici alert uzerinde mesaji dogrular.
    Then Kullanici alert uzerinde tamam butonunun tiklanabilir oldugunu dogrular.

  Scenario: TC_02_ikinci "click me" butonuna tiklandiginda alert 5sn sonra acilmali
    And Kulanici acilan sekmede Alerts basligini tiklar.
    And Kullanici ikinci alertme butonuna tiklar.
   # Then Kullanici alertin 5sn gorunmedigini dogrular.
    Then Kullanici alertte 5sn sonra mesajin gorundugunu dogrular.

  Scenario: TC_03_ucuncu click me butonunda tamam islemi

    And Kulanici acilan sekmede Alerts basligini tiklar.
    And Kullanici ucuncu alertme butonuna tiklar.
    Then tamam butonunu tiklar
    Then tamam secildiginde selected ok yazisini dogrular


  Scenario: TC_04_ucuncu click me butonunda iptal islemi
    And Kulanici acilan sekmede Alerts basligini tiklar.
    And Kullanici ucuncu alertme butonuna tiklar.
    Then iptal butonunu tiklar
    Then iptal secildiginde selected cancelyazisini dogrular

  Scenario: TC_05_dorduncu click me

    And Kulanici acilan sekmede Alerts basligini tiklar.
    And Kullanici dorduncu alertme butonuna tiklar.
    When Kullanici textboxa mesaj yazar.
    And Kullanici alertte tamam butonunu tiklar.
    Then Kullanici mesajin goruntulendigini dogrular.