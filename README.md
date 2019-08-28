# SDET-Assignments

Added two projects DummyAutomation(Web Automation - quickfuseapps.com) & API Automation (Slack API) in the repository

WEB Automation:

1. Dummy Automation -> src -> Main -> java -> com -> base -> this folder contains all types of utilities files 
2. Dummy Automation -> src -> Main -> java -> com -> page -> contains locators for Home end Edit APP page
3. Dummy Automation -> src -> Main -> java -> com -> demo ->testS -> Demo Test -> contains @Test, @BeforeMethod & @AfterMethod 
3. Run -> ./testng.xml from terminal or run DemoTest file from tool
Note: Used Intellij tool to create and run the project

API Automation:
1. SlackAPI -> src -> main-> java-> commonUtils -> contains utility file which has common methods to be used
2. SlackAPI -> src -> main-> java-> DataManipulator -> contains file to read data from configurator.properties file
3. SlackAPI -> src -> main-> java -> BaseSetup -> contains method which has method to return value of key from properties file
4. SlackAPI -> src -> main-> java -> SlackEndpoints -> contains endpoints of API and path to locate json resquest body
5. SlackAPI -> src -> main-> java -> Slackservices -> contains reusable methods to test APIs
6. SlackAPI -> src -> test-> java -> SlackSpecs -> contains @Test menthods based on the scenarios to be tested
7. SlackAPI -> src -> test ->resources -> TestData -> contains API request json body files
8. Run by ./tst.xml

