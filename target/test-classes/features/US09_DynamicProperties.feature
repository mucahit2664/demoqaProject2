Feature: US09_DynamicProperties

  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And DynamicProperties butonuna tiklayiniz

    Scenario: TC_01
   Then Wil enable 5 seconds isimli buton sayfa acildiginda Disabled oldugunu  dogrulayin
   Then ve 5 sn sonra Enabled oldugunu dogrulayin
Then This text has random Id isimli Text Box sayfa her yenilendiginde farkli bir ID value'sune sahip oldugunu dogrulayin

      Scenario: TC_02
      Then Color Change isimli butonun yazi renginin sayfa yuklendiginde "#fff" ve 5 sn sonra "#dc3545" oldugunu dogrulayin

      Scenario: TC_03
      Then Visible After 5 Seconds isimli butonun sayfa yuklendiginde goruntulenemez oldugunu ve 5 sn sonra goruntulenebilir oldugunu dogrulayin
