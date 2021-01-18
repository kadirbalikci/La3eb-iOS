@guestEn
Feature: Registered user tests
  As a Registered User


#  Background:
#    Given user should logged in
#    Then user click on skip for discover la3eb
#    And click on screen


  Scenario: survey can be filled by the newly registered user
    Then user clicks on Sign up button
    And user fill credentials and select T&C
    Then user clicks on done button
    Then user should add photo
    And click on screen
    Then verify new account created successfully


  Scenario: user add multiple products to cart and apply promo code
    Given user should logged in
    Then user click on skip for discover la3eb
    And click on screen
    Then user should add multiple product to cart
    And user should add promo code

    Then user should navigate to shop
    And user searches game
    Then user add product to cart
