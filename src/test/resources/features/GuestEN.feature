@guestEn
Feature: Guest tests
  As a guest User add items to wishlist

  Background:
    Given user should continue as a guest
    Then user click on skip for discover la3eb
    And click on screen


  Scenario: guest user add items to wishlist from cart
    Then user navigates PDP
    And user add product to cart
    Then user adds item to wishlist
    Then user navigates back to wishlist from cart
    And verify product added to wishlist


  Scenario: guest user add items to wishlist from PDP
    Then user navigates PDP
    And user click on add to wishlist button
    Then user navigates back to wishlist
    And verify product added to wishlist


  Scenario: guest user should access game channels
    Then user navigates back to Connect
    And verify the user should see the channels


#  Scenario: guest user can enter billing address to purchase product
#    Then user navigates PDP
#    And user add product to cart
#    Then user navigates to cart and clicks checkout
#    And user should fill address details and clicks continue
#    Then user choose payment method and clicks continue
#    And user fill card details and clicks confirm order


#  Scenario: guest user can filter Games
#    Then user should navigate to shop
#    Then user click on filter, choose games and apply filter
#    And verify the user filtered games



  Scenario: guest user can filter a Game
    Then user should navigate to shop
    And user searches game
    Then user click on view all button
    And verify the user should see the game

#  @wip
#  Scenario: guest user can see shipping fee and COD fee
#    Then user should navigate to shop
#    Then user navigates PDP
#    And user add product to cart
#    Then user navigates to cart and clicks checkout
#    And user should fill address details and clicks continue
#    Then user choose "COD" payment method and clicks continue
