Feature: Login

  Scenario: go to website and login page with asan imza
    Given go to website
    And enter mobile number
    And enter ID
    And click login
    And click cancel
    Then check login


  Scenario: go to website and login page with Username
    Given go to website
    And click Username
    And enter Username
    And enter password
    And click Login
    Then check login