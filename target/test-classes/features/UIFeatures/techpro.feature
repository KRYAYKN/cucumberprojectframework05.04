@Techprotest
Feature: Techproeducation Title Testi
  Scenario: TC01_sayfanin_baslik_testi
    Given "techprourl" sayfasina gidilir
    When sayfa basligi yazdirilir
    Then sayfa basliginda "Bootcamps" oldugu dogrulanir
    And sayfa kapatilir
