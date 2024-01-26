@LoginPage

Feature: Login Page Feature
  @CheckComponents
  Scenario: Check Components
    Given user is on the Login Page
    Then should see Icon on
    Then should see Logo on
    Then should see UsernameBox: "Username"
    Then should see PasswordBox: "Password"
    Then should see LoginButton: "LOGIN"

  @LoginHappyPath

  Scenario: Happy Path
    Given user is on the Login Page
    When sendkeys Username: "standard_user"
    When sendkeys Password: "secret_sauce"
    When click Login Button
    Then should see Home Page


  @LoginNegative
  Scenario: Empty UsernameBox
    Given user is on the Login Page
    When sendkeys Password: "secret_sauce"
    When click Login Button
    Then should see Username Error Message: "Username is required"

  @LoginNegative
  Scenario: Empty PasswordBox
    Given user is on the Login Page
    When sendkeys Username: "standard_user"
    When click Login Button
    Then should see Password Error Message: "Password is required"

  @LoginNegative
  Scenario: Invalid Username
    Given user is on the Login Page
    When sendkeys Username: "standarduser"
    When sendkeys Password: "secret_sauce"
    When click Login Button
    Then should see Error Message Genel: "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Invalid Password
    Given user is on the Login Page
    When sendkeys Username: "standard_user"
    When sendkeys Password: "secretsauce"
    When click Login Button
    Then should see Error Message Genel: "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Invalid Credentials
    Given user is on the Login Page
    When sendkeys Username: "standarduser"
    When sendkeys Password: "secretsauce"
    When click Login Button
    Then should see Error Message Genel: "Username and password do not match any user in this service."

  @LoginNegative
  Scenario: Empty Credentials
    Given user is on the Login Page
    When click Login Button
    Then should see Username Error Message: "Username is required"