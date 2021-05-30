#Sample Feature Definition Template
@Logintoapplication
Feature: Validate Login functionality of the application

  @Login
  Scenario Outline: Login validation
    Given I am in the login page of  URL https://opensource-demo.orangehrmlive.com/
    When I enter all combinations of user ids as "<user_id>" and passwords as "<password>"
    Then I need to validate the "<expected_output>" and report "<status>"
    And user login in to application

    Examples: 
      | user_id | password | expected_output          | status  |
      | admin   |          | Password cannot be empty | Success |
      |         |          | Username cannot be empty | Success |
      |         | admin123 | Username cannot be empty | Success |
      | abc     | admin123 | Invalid credentials      | Success |
      | Admin   | admin123 | Invalid credentials      | Success |
