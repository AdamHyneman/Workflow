Feature: Main Page

  Background: Open DemoQa main page
    Given Open DemoQa main page
    Then Verify that DemoQa page is opened

    Scenario: 1.001 Open Elements page
      Given Click on the "Elements" tab
      And Verify that "Elements" page is opened


    Scenario: 1.002 Open Forms page
      Given Click on the "Forms" tab
      And Verify that "Forms" page is opened


  Scenario: 1.003 Open Alerts, Frame & Windows page
      Given Click on the "Alerts, Frame & Windows" tab
    And Verify that "Alerts, Frame & Windows" page is opened

  Scenario: 1.004 Open Widgets page
    Given Click on the "Widgets" tab
    And Verify that "Widgets" page is opened


  Scenario: 1.005 Open Interactions page
    Given Click on the "Interactions" tab
    And Verify that "Interactions" page is opened



  Scenario: 1.006 Open Book Store Application page
    Given Click on the "Book Store Application" tab
    And Verify that "Book Store" page is opened
