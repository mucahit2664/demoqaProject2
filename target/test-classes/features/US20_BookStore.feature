Feature: Book Store Application Sign-in Feature

  Background:
    Given demoqa anasayfaya gidin
    And kullanici Book Store Application' a tiklar
    And kullanici login butonuna tiklar
  Scenario:
    When kullanici New User butonuna tiklar
    And kullanici "firstName" "lastName" "userName" "password" alanlarini doldurur
    And kullanici ben bir robot degilim checkBox'ini tiklar
    Then kullanici register butonuna tiklar
    Then kullanici back to login butonuna tiklar
    When kullanici valid UserName ve Password bilgilerini girer
    When Kullanici login butonuna tiklar