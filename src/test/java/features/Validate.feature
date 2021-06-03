 Feature: Application Login

@Regtest
Scenario: Home page default login
Given User is on Netbanking landing Page
When User login into application  with "xyz" and password "1234"
Then Home page is populated
And Cards displayed are "true"
