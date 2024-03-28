@UserLogin
Feature: LMS API UserLogin

  @User_Login
  Scenario: User login with valid credentials
    Given Admin creates POST Request  with valid credentials. 
    	|email                 |  password           |
    	|numpyninja@gmail.com  | lmsHackathon@2024   |
    When Admin creates Post Https method  with valid endpoint.
    Then Admin User receives the bearer token.

   
   