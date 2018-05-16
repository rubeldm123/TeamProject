@Login
Feature:  Admin Login to HRM home page
In Order To Login to Orange HRM
As a Admin with valid username and password 
I want to Enter Username, Password, click on Login Button to Access to the Application.

Scenario Outline: Positive-Admin Login successfully

Given Admin Navigate to HRM Login page
When Admin Enter valid "<userName>" and "<password>"
And click on LOGIN Button
Then Admin will Land in Admin HomePage
Then Close The Browser

Examples:
|userName|password|
|Admin   |admin|



