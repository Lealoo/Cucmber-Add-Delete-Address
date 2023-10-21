Feature:
  Background:
    Given User is on the mystore-testlab.coderslab.pl page, logged in
    And Addresses button is clicked
  @addAddress
  Scenario Outline:
    When Create new address is clicked
    And Address form is filled with data: <alias> <address> <city> <postalCode> <phone>
    And Save button is clicked
    Then success adding address message is present
    Examples:
      | alias | address      | city       | postalCode | phone       |
      | Kathy | SuperStreet  | SmallCity  | 00000      | 000111222   |
      | KD    | NormalStreet | NormalCity | 99-111     | 000-111-333 |


  @deleteAddress
  Scenario:
    When Delete button in clicked on the second address on the page
    Then success deleting address message is present


