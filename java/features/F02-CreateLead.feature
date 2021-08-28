Feature: Create Lead Functionality

@functional
Scenario Outline: TC01_Login-Successful

Given Enter the username as <username>
And Enter the password as <password>
When click on login button
Then Homepage should be launched successfully
When click on CRM/SFA
Then MyHome page launched
#And close the browser

Examples:
|username|password|
|'DemoSalesManager'|'crmsfa'|