# AUTOR: Juan Felipe Garcia Duque

@stories
Feature: Choucair Challenge
  As a user, I want to learn how to automate scripts.
  @scenario1
  Scenario: Registration on the Utest website
    Given than Felipe wants to register on the Utest website

    When he finds the website registration form

    Then he registers on the UTest website
      | strName    | strLastName  |   strEmail         | strMonth | strDay    | strYear     | strLanguages | strCity  | strZipCode | strCountry  | strCreatePassword | strConfirmPassword |
      |Juan Felipe | Garcia Duque | jgarciadd@gmail.com | number:2 | number:14 | number:1980 | Spanish	   | Sabaneta | 0510054    | Colombia    | JuanGarcia1980    | JuanGarcia1980     |