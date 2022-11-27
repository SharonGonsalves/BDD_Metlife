@regression
Feature: Auto Data Validation

  Scenario: login account with invalid credentails
    Given user nevigate to homepage
    When user click on login button
    And user select business account
    And user select metlink option
    And user click on the login1 button
    And user enters username
    Then user enter password
    And user click on login2 button
    Then displays invalid credentials

  @auto
  Scenario: login account with invalid credentails 2
    Given user nevigate to homepage
    When user click on login button
    And user select business account
    And user select metlink option
    And user click on the login1 button
    And ontinue overlay handled
    Then speed up page handled
    And user click on login2 button
    Then displays invalid credentials
 
 @steps
   Scenario: Auto steps 
    When homepage steps done
    And selectAccount steps done with <"metlink">
    And HomePage
    And Input logIN
    Then AutoSteps page done
    
   @data-driven 
   
   Scenario:Data Driven approach for BDD
   When homepage steps done <accountOption>
   Then AutoSteps page is done 
   
   
   
   
   
   
   
   