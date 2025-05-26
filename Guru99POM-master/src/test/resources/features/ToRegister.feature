@Smoke
Feature: New Customer

  Background: login page Guru Bank
    Given that I am on the page GuruBank
    And entered your user and password

  Scenario: Register of New Customer
    When entered the form data
    Then Validate the message from Customer Registered Successfully !!!

