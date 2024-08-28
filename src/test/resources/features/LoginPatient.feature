Feature: Automated login related test cases

  @Regression @SmokeTest
  Scenario: Verify login with valid credentials works as expected
    Given Verify the URL "appURL" is loaded properly with proper title "mypatientspace- Login"
    And User enter the valid username "userName"
    And user enter the valid password "Password"
    And User click on Login button
    Then Verify login to application is successful


Feature: Automated login and logout related test cases

  @Regression @SmokeTest
  Scenario: Verify login with valid credentials works as expected
    Given Verify the URL is loaded properly with proper title
      | appURL | appPageTitle          |
      | https://test.mypatientspace.com/login       | mypatientspace- Login |
    And User enter the valid username
      | userName      |
      | navfacpatient |
    And user enter the valid password
      | password  |
      | Password1 |
    And User clicks on Login button
    Then Verify login to actiTime application is successful
      | HomePageTitle |
      | NP            |