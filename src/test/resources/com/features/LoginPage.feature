#Author: Gayatri Hosmani
Feature: Login page feature

  @tag1
  Scenario: To verify URL of Demo_Blaze on Google browser
    Given The user is on login page
    When user gets the title of the page
    Then page title should be "STORE"

  @tag2
  Scenario Outline: To verify whether the site displays Greetings to the user
    Given The user is on login page
    When user clicks on Login
    And enters the "<username>" and "<password>"
    And user clicks on Login button
    Then page should display a link with Welcome username

    Examples: 
      | username | password     |
      | gayatrih | @23gayatri05 |
      | chetann  | @23chetan05  |

  @tag3
  Scenario: To verify that user redirects to sign up page
    Given The user is on login page
    When user clicks on sign up link
    Then sign up form should be displayed

  @tag4
  Scenario Outline: To verify that user enters valid username
    Given The user is on sign up page
    And Username field is visible
    When user enters a valid "<susername>" and "<spassword>"
    And user clicks on signup button
    Then an alert with Sign up successful message must be displayed.

    Examples: 
      | susername | spassword     |
      | tanishkaa | @23tanishka05 |
