
Feature: US08_UploadandDownland

  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And UploandandDownland butonuna tiklayiniz

    Scenario: TC_01_Upload
      Given bir dosya indiriniz
      Given sectigimiz dosyanin gorunurlugunu dogrulayiniz
      Given Dowland butonuna tiklayiniz
      Given dosyaninin indriildigini dogrulayiniz

     #Scenario: TC_10_TITLE

    Then "Upload and Download" yazisinin gorunurlugunu  Dogrulayiniz

