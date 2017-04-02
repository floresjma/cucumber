Feature: Clean data for processing metric

  Scenario: Receive an email when input doesn’t exists
    Given I do not have a file as an input to process the job
    When I run the Cleansing Job
    Then I receive an email with an error message

  Scenario: Receive an email when input is empty
    Given I have an empty file as an input to process the job
    When I run the Cleansing Job
    Then I receive an email with an error message
