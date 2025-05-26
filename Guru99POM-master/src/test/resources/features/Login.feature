Feature: Login to guru99 Demo

  @Test
  Scenario: login page guru99 demo
    Given that I am on the page Guru99 Demo
    When entered yuor user and Password
        | txtUser | txtPass         |
        | mngr622585  | AvumYjU    |
    Then view the message
          | txtMessage               |
          | Manger Id : mngr622585   |