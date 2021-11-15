Feature: US10_Forms.feature

  Background:
    Given   demoqa anasayfaya gidin
    And Kulanici Forms  accordionunu tiklar
    And Kullanici acilan sekmede Practice Forms butonu tiklar



    Scenario: TC_01_Sayfada Forms tiklananbilir olmali

    Then Kullanici acilan sayfada Student Registration Form oldugunu dogrular.

  Scenario: TC02_Valid degerlerle dogrulama yapin


    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2
    And Resim seciniz

    And Current Adres giriniz
    And State seciniz
    And City seciniz
    Then Submiti Tiklayin
    Then Onaylandigini dogrulayin

  Scenario: TC03_ First Name bos Birakilamayacagini dogrulayin

    And FirstName yaziniz  ""
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2
    And Current Adres giriniz
    And State seciniz
    And City seciniz

    Then Submiti Tiklayin

    Then First Name bos Birakilamayacagini dogrulayin

  Scenario: TC04_ LastName bos Birakilamayacagini dogrulayin
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  ""
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2

    And Current Adres giriniz
    And State seciniz
    And City seciniz
    And Submiti Tiklayin
    Then LastName bos Birakilamayacagini dogrulayin

  Scenario: TC05_cinsiyet secimlerinin birden fazla yapilamamasi
    And cinsiyet seciniz "male"
    Then cinsiyette birden fazla secim yapilamadigini dogrulayin
    And cinsiyet seciniz "female"
    Then cinsiyette birden fazla secim yapilamadigini dogrulayin
    And cinsiyet seciniz "other"
    Then cinsiyette birden fazla secim yapilamadigini dogrulayin

  Scenario: TC06_mail at ve nokta  icermelidir

    And Kullanici email bilgisini at olmadan girer

    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahitgmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2

    And Current Adres giriniz
    And State seciniz
    And City seciniz
    And Submiti Tiklayin
    Then email at olmadan kabul edilmedigini dogrulayin
    And emaili temizleyin
    And Kullanici email bilgisini nokta olmadan girer
    And Submiti Tiklayin
    Then email nokta olmadan kabul edilmedigini dogrulayin
