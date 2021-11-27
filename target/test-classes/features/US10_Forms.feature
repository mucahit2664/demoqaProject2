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
    Then email at olmadan kabul edilmedigini dogrulayin
    And emaili temizleyin
    And Kullanici email bilgisini nokta olmadan girer
    And Submiti Tiklayin
    Then email nokta olmadan kabul edilmedigini dogrulayin

  Scenario: TC07_Telefon on haneli olmali
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "123456789"
    And valid dogum tarihi giriniz "06 Apr 2000"
    And subject Giriniz
    And Hobby seciniz 2
    And Resim seciniz
    And Current Adres giriniz
    And State seciniz
    And City seciniz
    And Submiti Tiklayin
    Then Tel on hane  olmadan kabul edilmedigini dogrulayin
    And tel bolumunu temizleyin
    And valid telefon giriniz "12345678a0"
    And Submiti Tiklayin
    Then Tel on hane  olmadan kabul edilmedigini dogrulayin

  Scenario: TC08_tarih gunumuzden ileride secilememelidir

    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And Email giriniz "mucahit@gmail.com"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And valid dogum tarihi giriniz "06 Apr 2025"
    And subject Giriniz
    And Hobby seciniz 2
   # And Resim seciniz
    And Current Adres giriniz
    And State seciniz
    And City seciniz
    And Submiti Tiklayin

    Then tarih gunumuzden ileride secilemedigini dogrulayin


  Scenario: TC_09_Ayni anda birden fazla subject girilebilmeli
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And subject Giriniz
    And Submiti Tiklayin
    And birden fazla giris yapilabildigini dogrulayin


  Scenario: TC_10_Hobbies bolumunde secme serbestiyeti

    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And tum hobbyleri secin
    And Submiti Tiklayin
    Then Hobbies bolumunde secme serbestiyeti

  Scenario: TC_11_resme_upload

    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And Resim seciniz
    And Submiti Tiklayin
    Then resmin secildigini dogrulayiniz

  Scenario:TC_12_Current Adresin sadece rakam kabul ettigini dogrulayin
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And Current Adres sadece rakam giriniz
    And Submiti Tiklayin
    Then Onaylandigini dogrulayin

  Scenario:TC_13_Current Adresin sadece harf kabul ettigini dogrulayin
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And Current Adres sadece harf giriniz
    And Submiti Tiklayin
    Then Onaylandigini dogrulayin


  Scenario:TC_14_Current Adresin ozel karakter kabul ettigini dogrulayin
    And FirstName yaziniz  "abdullah"
    And LastName yaziniz  "yalcin"
    And cinsiyet seciniz "rastgele"
    And valid telefon giriniz "1234567890"
    And Current Adrese ozel karakterler giriniz
    And Submiti Tiklayin
    Then Onaylandigini dogrulayin


  Scenario:TC_15_state isimleri tiklama ile gorulmeli
    And state Tiklayiniz
    Then state isimlerinin gorundugunu dogrulayiniz

  Scenario:TC_16_City isimleri tiklma ile gorulmeli

    And city Tiklayiniz
    Then city isimlerinin gorundugunu dogrulayiniz
