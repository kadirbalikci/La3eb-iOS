@guestEn
Feature: Guest user tests
  As a guest User

  Background:
    Given user should continue as a guest
    Then user click on skip for discover la3eb
    And click on screen


  Scenario: Guest can add items to wishlist from the cart
    Then user navigates PDP
    And user add product to cart
    Then user adds item to wishlist
    Then user navigates back to wishlist from cart
    And verify product added to wishlist


  Scenario: Guest can add items to wishlist from the PDP
    Then user navigates PDP
    And user click on add to wishlist button
    Then user navigates back to wishlist
    And verify product added to wishlist

  @wip
  Scenario: guest can change the language from settings
    Then user will navigates to settings and changes language
    And verify language changed

#  Scenario: guest can sort games
#  Scenario: guest user can visit PDP
#  Scenario: guest user adds multiple products to cart and apply promo code
#  Scenario: Guest user can access Connect
#  Scenario: Guest user can access game channels
#  Scenario: Guest user can enter billing details and purchase the order using COD
#  Scenario: Guest user can purchase a virtual product using "Credit Cart" payment method, and check the payment details on order history


  Scenario: guest user should access game channels
    Then user navigates back to Connect
    And verify the user should see the channels


  Scenario: guest user can enter billing address to purchase product
    Then user navigates PDP
    And user add product to cart
    Then user navigates to cart and clicks checkout
    And user should fill address details and clicks continue
    Then user choose "CC" payment method
    And user clicks continue to next step
    And user fill card details and clicks confirm order


  Scenario: guest user can filter Games
    Then user should navigate to shop
    Then user click on filter, choose games and apply filter
    And verify the user filtered games



  Scenario: guest user can filter a Game
    Then user should navigate to shop
    And user searches game
    Then user click on view all button
    And verify the user should see the game


  Scenario: guest user can see shipping fee and COD fee
    Then user navigates PDP
    And user add product to cart
    Then user navigates to cart and clicks checkout
    And user should fill address details and clicks continue
    Then user choose "COD" payment method
    And verify the user should see shopping fee and COD fee


  Scenario: guest user can visit PLP
    Then user should navigate to shop
    And user should choose category for PLP
    Then verify the user on PLP


  Scenario: guest user can proceed as a Guest User
    Then verify the user proceed as a guest user

#  T60128   Guest can add items to wishlist from the cart	 +
#  T60127	Guest can add items to wishlist from the PDP	 +
#  T60132	Guest can change the language from settings
#  T60123	Guest can filter games
#  T60133	Guest can search for other users and channels
#  T60124	Guest can sort games
#  T60125	Guest can visit PDP
#  T60121	Guest can visit PLP
#  T60126	Guest user adds multiple products to cart and apply promo code
#  T60119	Guest user can access "Game Hub"
#  T60120	Guest user can access game channels
#  T60129	Guest user can enter billing details and purchase the order using COD
#  T60130	Guest user can purchase a virtual product using "Credit Cart" payment method, and check the payment details on order history
#  T60131	Guest user can see shipping fee and cash on delivery fee
#  T60122	Guest user visits shop games category and search for games
#  T60118	Proceed as Guest user
