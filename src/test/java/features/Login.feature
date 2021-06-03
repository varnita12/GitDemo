 Feature: Application Login
 
 
@Regtest
Scenario: Home page default login
Given User is on Netbanking landing Page
When User login into application  with "xyz" and password "1234"
Then Home page is populated
And Cards displayed are "true"

@Smoketest
Scenario: Home page default login
Given User is on Netbanking landing Page
When User login into application  with "abc" and password "1234"
Then Home page is populated
And Cards displayed are "false"

@Regtest
Scenario: Home page default login
Given User is on Netbanking landing Page
When User Sign up with following details
| FirstName | LastName | Address1 | Email@test.com | 34456564343|
Then Home page is populated
And Cards displayed are "false"

@Sanity
Scenario Outline: Home page default login
Given User is on Netbanking landing Page
When User logs in Netbanking using <username> and <password>
Then Home page is populated
And Cards is displayed are <cards>
Examples: 
|username|password|cards|
|User1 |Pass1 |true |
|User2 |Pass2 |false |
|User3 |Pass3 |true |
|User4 |Pass4 |false |
|User5 |Pass5 |true |
