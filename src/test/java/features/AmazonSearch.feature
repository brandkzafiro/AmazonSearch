Feature: Test amazon search functionality

  Scenario Outline: As a Customer when I search for <Product>, I want to see if the third option on the second page is available for purchase and can be added to the cart.
    Given the user navigate to www.amazon.com
    And searches for <Product>
    And navigate to the second page
    And selects the third item
    Then the user is able to add it to the cart

    Examples:
      |Product|
      |Alexa  |
      |Playstation|