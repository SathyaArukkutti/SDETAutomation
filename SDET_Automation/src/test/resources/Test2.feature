#Sample Feature Definition Template
@ValidateSelectableoption
Feature: Title of your feature
  
  @SelectableValidation
  Scenario Outline: To check if able to select items from selectable
    Given I am on the URL "https://jqueryui.com/"
    When I click Selectable option 
    Then I need to be able to select "<item>"

    Examples: 
      | item  | 
      | item 4 |    
      | item 7 |
      | item 1 |   
