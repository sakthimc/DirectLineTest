Feature: As an insurance portal company,
  I would like to check whether a vehicle exists
  so that I can check its insurance validity

  @vehicleExistsTest
  Scenario Outline: check whether vehicle exists in portal using REGNO
    Given I launch the insurance portal
    When I enter the vehicle "<REGNO>" and click submit
    Then I should see the "<REGNO>" insurance details

    Examples:
      | REGNO   |
      | OV12UYY |
      | YU13ERS |
