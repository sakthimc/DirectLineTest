$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/InsuranceCoverChecker.feature");
formatter.feature({
  "name": "As an insurance portal company,",
  "description": "  I would like to check whether a vehicle exists\n  so that I can check its insurance validity",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "check whether vehicle exists in portal using REGNO",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vehicleExistsTest"
    }
  ]
});
formatter.step({
  "name": "I launch the insurance portal",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter the vehicle \"\u003cREGNO\u003e\" and click submit",
  "keyword": "When "
});
formatter.step({
  "name": "I should see the \"\u003cREGNO\u003e\" insurance details",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "REGNO"
      ]
    },
    {
      "cells": [
        "OV12UYY"
      ]
    },
    {
      "cells": [
        "YU13ERS"
      ]
    }
  ]
});
formatter.scenario({
  "name": "check whether vehicle exists in portal using REGNO",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vehicleExistsTest"
    }
  ]
});
formatter.step({
  "name": "I launch the insurance portal",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iLaunchTheInsurancePortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the vehicle \"OV12UYY\" and click submit",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iEnterTheVehicleAndClickSubmit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the \"OV12UYY\" insurance details",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeTheInsuranceDetails(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "check whether vehicle exists in portal using REGNO",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@vehicleExistsTest"
    }
  ]
});
formatter.step({
  "name": "I launch the insurance portal",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.iLaunchTheInsurancePortal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter the vehicle \"YU13ERS\" and click submit",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.iEnterTheVehicleAndClickSubmit(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see the \"YU13ERS\" insurance details",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepdefs.iShouldSeeTheInsuranceDetails(String)"
});
formatter.result({
  "status": "passed"
});
});