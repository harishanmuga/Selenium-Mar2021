Feature: Login functionality for the Leaf Taps

#Background:
#Given Open the chrome browser
#And Launch the Leaf taps application

@regression
Scenario Outline: TC01_Login-Successful

Given Enter the username as <username>
And Enter the password as <password>
When click on login button
Then Homepage should be launched successfully
#And close the browser

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

@smoke
Scenario: TC02_Login-Failed

Given Enter the username as 'DemoSalesManager'
And Enter the password as 'crmsfa123'
When click on login button
But Homepage should not be launched successfully
#And close the browser