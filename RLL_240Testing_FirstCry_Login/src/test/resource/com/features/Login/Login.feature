Feature: User Login

  @Login
  Scenario Outline: User login scenario
    Given The user navigates to FirstCry Home Page
    When The user clicks on login
    And The user enters the <EmailID> or mobile no.
    Then The user clicks on Continue
    And The user gets a <Message> message
    #And The user enters the OTP sent to his registered email ID or mobile no.
    And Click on Submit
    Then The user gets some <msg> message

    Examples: 
      | EmailID                          | Message | msg |
      | vaibhavagrahari3101998@gmail.com |         |     |
      | a435@gmail.com                   |         |     |
      |                                  |         |     |
      | vaibhavagrahari3101998@gmail.com |         |     |
  #@InvalidLogin
  #Scenario Outline: Check whether the user cannot login with invalid credentials
    #Given The user opens the FirstCry Home Page
    #When The user clicks on login button
    #And The user enters a wrong <EmailID_1> or mobile number
    #And The user clicks on Continue button
    #Then The user should not be able to login and should be redirected to the registration page
#
    #Examples: 
      #| EmailID_1      |
      #| a435@gmail.com |
#
  #@EmptyLogin
  #Scenario: User cannot login with empty credentials
    #Given The user enters the FirstCry Home Page
    #When The user clicks on the login icon
    #And The user do not enter any credentials
    #And The user clicks on Continue icon
    #Then the user should not be able to login and should see the message Please enter email ID or mobile no.
#
  #@InvalidOTP
  #Scenario Outline: User cannot login with invalid OTP
    #Given The user open the browser and navigates to the FirstCry Home Page
    #When User clicks on login button
    #Then The user enter the <EmailID_2> or mobile number
    #And User clicks on Continue
    #And The user enters the wrong OTP sent on the registered email ID or mobile number
    #And Click on Submit icon
    #Then the user should not be able to login and should see the message Invalid OTP. Please try again.
#
    #Examples: 
      #| EmailID_2                        |
      #| vaibhavagrahari3101998@gmail.com |
