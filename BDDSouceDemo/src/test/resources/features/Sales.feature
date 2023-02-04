@Sales
  Feature: Sales flow
    description Class

  Scenario: User make a purchase with 2 item
    Given User open the website sauce demo
    When User input "standard_user" as userName and input "secret_sauce" as pass
    Then User already on landing page
    Then User Product list by "Name (Z to A)"
    And User choice 2 product from the list
    And User click Cart
    And User remove T-Shirt Red
# Check Out
    And User Click Check Out
    And User input First Name "Abdi" and LastName "Firman" and postal code "1234"
    And User click Continue
    Then Total must be match between expect and actual
    Then User click Finish and landing to page THANK YOU FOR YOUR ORDER