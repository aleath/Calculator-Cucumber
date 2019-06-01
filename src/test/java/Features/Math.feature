Feature: Give program calculator functionality

Scenario: Get total of two integers 
Given I have a calculator 
When User adds two integers and selects equal
Then Total displays


Scenario: Get total of two integers subtracting
Given user has a calculator 
When User subtracts two integers and selects Enter
Then Sum displays


Scenario: Get total of two integers multiplying
Given user is using a calculator 
When User multiplies two integers and selects Enter
Then Total displays for user


Scenario: Get total of two integers dividing 
Given user is operating calculator 
When User adds two integers and selects Enter
Then Sum displays for user