Feature: Registration declaration

  Scenario: login and register declaration
    Given create scenario
    And go to website
    And enter mobile number
    And enter ID
    And click login
    And click cancel
    And click register
    And click declaration
    And enter tin
#    And select taxcode
#    And select period code
    And select declaration type
    And select delivery type
    And click registration
    And take registration number
#    And logout system
#     And login chief account
    And go to filter
    And enter document number
    And apply filter
    And choose declaration task
   # And go to pending approval
   # And confirm declaration task
   # And go to unfinished tasks
    #And choose declaratio task
    Then check decl


  Scenario: filter
    Given go to website
    And enter mobile number
    And enter ID
    And click login
    And click cancel
    And go to filter
    And enter document number
    And apply filter
    And choose declaration task
    Then check decl