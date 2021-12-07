Feature: Demo QA Application Test Cases
  
  @tag1 
  @Order(1)
  Scenario Outline: Test case1: Add book to the profile
  	Given Opening the browser
    And Enter username
    And Enter password
    When Click login
    When Click bookstore
    And Enter search text as "<SearchText>"
    And Click search result as "<SearchText>"
    Then Get title of the book
    Then Get publisher of the book
    When Scroll to add to your collection
    Then Click to add to your collection
    Then Handle alart
    And Click logout

Examples:
  | SearchText | SearchText      |
  | Git        | Git Pocket Guide|
  
  
  @tag2
  @Order(2)
  Scenario Outline: Test case2: Add book to the profile
  	Given Opening the browser
    And Enter username
    And Enter password
    When Click login
    When Click bookstore
    And Enter search text as "<SearchText>"
    And Click search result as "<SearchText>"
    Then Get title of the book
    Then Get publisher of the book
    When Scroll to add to your collection
    Then Click to add to your collection
    Then Handle alart
    And Click logout

Examples:
  | SearchText | SearchText                               |
  | Designing  | Designing Evolvable Web APIs with ASP.NET| 


  @tag3
  @Order(3)
  Scenario Outline: Test case3: Add book to the profile
  	Given Opening the browser
    And Enter username
    And Enter password
    When Click login
    When Click bookstore
    And Enter search text as "<SearchText>"
    And Click search result as "<SearchText>"
    Then Get title of the book
    Then Get publisher of the book
    When Scroll to add to your collection
    Then Click to add to your collection
    Then Handle alart
    And Click logout

Examples:
  | SearchText | SearchText                         |
  | Learning   | Learning JavaScript Design Patterns| 
  
  