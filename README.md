### Cucumber - Adding & Deleting Addresses on logged in account
#### Feature file:
- Feature
- Background
- Scenario
- Scenario Outline
- Examples
- tags `@addAddress`, `@deleteAddress`


Background was used to cover the repetitive steps of loggin into user account.
By default, test are performed in order:
1. Scenario: adding an address (number of tests depends on number of given examples)
2. Scenario: deleting an address

Both of the Scenarios can be run separately by using `@tags` in `AddDeleteAddressTest.java` file. <br><br>

#### Tech stack:
- Java
- JUnit4
- Selenium
- Cucumber
- Maven



