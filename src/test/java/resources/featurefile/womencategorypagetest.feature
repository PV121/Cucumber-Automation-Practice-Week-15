Feature: Women category page test

  Scenario: Verify user should navigate to women category page successfully
    Given I am on homepage
    When I click on WOMEN tab
    Then I verify Women text

  Scenario Outline: Verify user should add product to the cart successfully
    Given I am on homepage
    When I click on WOMEN tab
    And I click on the product "<product>"
    And I change quantity "<qty>"
    And I select size "<size>"
    And I select colour "<colour>"
    And I click on Add To Cart Button
    And I vetify the message Product successfully added to your shopping cart
    And I click on X button and close the popup

    Examples:
      | product                                | qty | size | colour |
      | Blouse                                 | 2   | M    | White  |
#      | Printed Dress                          | 3   | L    | Orange |
#      | Printed Chiffon Dress                  | 4   | S    | Green  |
#      | Printed Summer Dress with Price $28.98 | 2   | M    | Blue   |


