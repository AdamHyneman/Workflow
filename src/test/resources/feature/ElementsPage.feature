Feature: Elements Page

  Background: Open DemoQa main page
    Given Open DemoQa main page
    Then Verify that DemoQa page is opened
    Given Click on the "Elements" tab
    And Verify that "Elements" page is opened


  Scenario: Open Text box page
    Given Click on the "Text Box" button
    And Verify that "Text Box" page is displayed

  Scenario: Fill the Text box with correct data
      Given Click on the "Text Box" button
      And Type "Vasya" in the "Full Name" field
      And Type "qwerty@gmail.com" in the "name@example.com" field
      Then Type "Kharkov" in the Current Address textArea
      Then Click on Submit button
      And Verify that results is displayed


  Scenario: Open Radio Button page
    Given Click on the "Radio Button" button
    And Verify that "Radio Button" page is displayed


    Scenario: Choose Yes radio-button
      Given Click on the "Radio Button" button
      And Click on the "Yes" radio button
      And Verify that "Yes" radio button is chosen


  Scenario: Choose Impressive radio-button
    Given Click on the "Radio Button" button
    And Click on the "Impressive" radio button
    And Verify that "Impressive" radio button is chosen


    Scenario: Not clickable No radio button
      Given Click on the "Radio Button" button
      And Verify that No radio button isn't clickable


    Scenario: Open the Buttons page
      Given Click on the "Buttons" button
      And Verify that "Buttons" page is displayed


    Scenario: Double click
      Given Click on the "Buttons" button
      And Click on the Double-click button
      And Verify that double-click is done


    Scenario: Right click
      Given Click on the "Buttons" button
     And Click on the Right click button
     And Verify that right click is done


    Scenario: Open Broken link- Images page
      Given Click on the "Broken Links - Images" button
      And Verify that "Broken Links - Images" page is displayed


    Scenario:  Check broken link page is displayed
      Given Click on the "Broken Links - Images" button
      And Click on the broken link button
      And Verify that broken links page is opened



    Scenario: Open download and upload page
      Given Click on the "Upload and Download" button
      And Verify that "Upload and Download" page is displayed


    Scenario: Check downloading file
      Given Click on the "Upload and Download" button
      Then Click on Download button
      And Verify that file is downloaded


    Scenario: Check uploading file
      Given Click on the "Upload and Download" button
     And Click on Upload file
#    And Choose file for uploading
