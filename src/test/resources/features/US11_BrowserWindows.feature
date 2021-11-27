Feature:US11_BrowserWindows.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Alerts, Frame & Windows accordionunu tiklar
    And Kullanici acilan sekmede BrowserWindows  butonu tiklar

Scenario: TC_01
  Then "Browser Windows" yazisinin gorunurlugunu  Dogrulayiniz
Scenario: TC_02_NEW BUTTONU TIKLANABILIR VE YENI BIR SAYFA ACMALI
  Then Kullanici new Tab butonunun tiklanabilir oldugunu dogrular
  Then Kullanici new Window Message butonunun tiklanabilir oldugunu dogrular
  Then Kullanici new Window butonunun tiklanabilir oldugunu dogrular

  Then new tab butonuna tiklayin
  Then new tab butonunu tiklayinca yeni bir sayfa acilinca "This is a sample page" yazisinin oldugunu dogrulayin

  Scenario: TC_02_new WINDOW butonu tiklanabilir ve yeni bir pencere acmali
    Then new window butonu tiklayin
    Then new window butonu tilayinca yeni bir pencere actigini dogrulayin

  Scenario: TC_03_new WINDOW_Message butonu tiklanabilir ve yeni bir pencere acmali
     Then new window message butonu tiklayin
     Then new window message butonu tiklayinca yeni bir pencere acildigini dogrulayin

