@Logout
Feature:  Admin LoginTo HRM home page
In Order To Login to Orange HRM
As a Admin with valid username and password 
I want to Enter Username, Password, click on Login Button to Access to the Application.

Scenario Outline: Positive-AdminLogin successfully

Given Admin Navigate to HRM Loginpage
When Admin Entervalid "<userName>" and "<password>"
And click on LOGINButton
And  Admin will Land in AdminHomePage
And click on WelcomeAdmin andclick on Logout

Then Close TheBrowser

Examples:
|userName|password|
|Admin   |admin|



