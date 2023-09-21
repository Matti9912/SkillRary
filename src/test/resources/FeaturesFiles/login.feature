
Feature: Admin Module
  Background: 
    Given User navigates to skillrary
    When User enters admin credentials
    Then User enters admin home page

  Scenario: Add Course
    Given User clicks on Course list under courses
    When User clicks on New and enters course details
      | Automation Anywhere                                                                  |
      | Development                                                                          |
      | 1500                                                                                 |
      | C:\Users\bhara\OneDrive\Desktop\skillrary.jpeg  																		 |
    And saves it
    Then Course should be added to course list
    When User deletes the new course
    Then Delete success message is displayed and user logs out

  Scenario: Add Category
    Given User clicks on Category list under courses
    When User clicks on New and enters category details
      | RPA |
    And saves it
    Then Category should be added to category list
    When User deletes the new category
    Then Delete success message is displayed and user logs out

  Scenario: Add User
    Given User clicks on Users
    When User clicks on New and enters new user details
      | sncsrivalli123@gmail.com                                                             |
      | snc@srivalli123                                                                      |
      | Srivalli                                                                             |
      | SNC                                                                                  |
      | Hyderabad                                                                            |
      | 9876543210                                                                           |
      | C:\Users\bhara\OneDrive\Desktop\skillrary.jpeg |
    And saves it
    Then New User should be added to Users list
    
 
 
 