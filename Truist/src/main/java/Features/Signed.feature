Feature: Sign-in function
  I want to automate sign-in functionality
  
  @Adhoc
  Scenario Outline: verify if user is logged in after entering valid credentials
    Given I am on Facebook sign-in page
    When I entered username "<name>" into the field
    And I entered password "<psword>" into the field
    And I clicked on Sign-in button
    Then User logged in successfully
    Examples: 
    
    
    |name|psword|
    |kate|12345|
    |Ali|Abbey|
    |ghazanfar|gheysar|
  @Regression  
Scenario Outline: verify if user is logged in after entering valid credentials
    Given I am on Facebook sign-in page
    When I entered username "<name>" into the field
    And I entered password "<psword>" into the field
    And I clicked on Sign-in button
    Then User logged in successfully
    Examples: 
    
    
    |name|psword|
    |kate|12345|
    |Ali|Abbey|
    |ghazanfar|gheysar|
    