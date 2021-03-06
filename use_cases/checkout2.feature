Feature: Admin login
Scenario Outline: Administrator has the wrong password

Given The Admin  <username> and  <password>

When The Admin enters Username as <username> and Password as <wrongpassword>


Then The Admin  is not able to successfully login because password wrong

Examples: 

|username|password||wrongpassword|
|"farah"||129||897|
|"masa"||457||654|