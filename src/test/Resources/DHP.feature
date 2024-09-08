
  Feature:
    Scenario: User checks values for particular DHP
      Given user opens a particular DHP Dashboard
      And  time is selected for last 24hours
      Then Thread count should be less than 100
      Then Memory should be less than 6000MB
      And  Handle count should be less than 100



