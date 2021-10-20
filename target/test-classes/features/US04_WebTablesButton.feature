@wbtables
Feature:
  Background:
    Given demoqa anasayfaya gidin
    Then elements butonuna basiniz
    And webTables butonuna basiniz

    Scenario Outline: TC_01
      Given Add butonuna basiniz
      And cikan formda firstName yaziniz"<firstname>"
      And cikan formda lastName yaziniz"<lastName>"
      And cikan formda email giriniz"<email>"
      And cikan formda age yaziniz"<age>"
      And cikan formda salary yaziniz"<salary>"
      And cikan formda department yaziniz"<department>"
      And submit butonuna tiklayiniz
      And search butonuna firstName giriniz "<firstname>"
      Then  kaydin ekledigini dogrulayiniz "<firstname>"
      Examples:
        | firstname | lastName | email | age | salary | department |

        | abdullah | mucahit | mucahit@gmail.com | 34 | 30000 | IT |
        | zehra | bektas | zhra@gmail.com | 25 | 50000 | TESTER |
