#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Shopping cart functionality
  

  @tag1
  Scenario: Product should be added to shopping cart after clicking the Add to cart button
    Given The user must be on homepage url "https://www.demoblaze.com/"
    And User is logged in into the account 
    When User clicks on the Laptops option
    And User selects Macbook air product by clicking on the item
   Then New page should open with image of the Laptop and ADD to CART button
   And User clciks on the Add to cart button
   And A pop up should generate
   Then Navigate to the cart page and verify the Macbook air is added to the cart

  