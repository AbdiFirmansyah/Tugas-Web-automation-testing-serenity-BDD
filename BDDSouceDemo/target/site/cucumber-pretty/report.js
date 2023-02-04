$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Sales.feature");
formatter.feature({
  "line": 2,
  "name": "Sales flow",
  "description": "description Class",
  "id": "sales-flow",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Sales"
    }
  ]
});
formatter.before({
  "duration": 15800798283,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User make a purchase with 2 item",
  "description": "",
  "id": "sales-flow;user-make-a-purchase-with-2-item",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "User open the website sauce demo",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User input \"standard_user\" as userName and input \"secret_sauce\" as pass",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User already on landing page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User Product list by \"Name (Z to A)\"",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User choice 2 product from the list",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User click Cart",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User remove T-Shirt Red",
  "keyword": "And "
});
formatter.step({
  "comments": [
    {
      "line": 13,
      "value": "# Check Out"
    }
  ],
  "line": 14,
  "name": "User Click Check Out",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "User input First Name \"Abdi\" and LastName \"Firman\" and postal code \"1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "User click Continue",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Total must be match between expect and actual",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "User click Finish and landing to page THANK YOU FOR YOUR ORDER",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginSteps.verifyLogin()"
});
formatter.result({
  "duration": 228449358,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "standard_user",
      "offset": 12
    },
    {
      "val": "secret_sauce",
      "offset": 50
    }
  ],
  "location": "LoginSteps.inputCredential(String,String)"
});
formatter.result({
  "duration": 410209921,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLandingPage()"
});
formatter.result({
  "duration": 3067093895,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Name (Z to A)",
      "offset": 22
    }
  ],
  "location": "PurchaseSteps.sortProductValue(String)"
});
formatter.result({
  "duration": 3124322738,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.choiceProduct()"
});
formatter.result({
  "duration": 4176093279,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.iconCart()"
});
formatter.result({
  "duration": 4097713998,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.removeCart()"
});
formatter.result({
  "duration": 4064642309,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.Checkout()"
});
formatter.result({
  "duration": 4071972368,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Abdi",
      "offset": 23
    },
    {
      "val": "Firman",
      "offset": 43
    },
    {
      "val": "1234",
      "offset": 68
    }
  ],
  "location": "PurchaseSteps.checkOutInformation(String,String,String)"
});
formatter.result({
  "duration": 6298966769,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.continueCart()"
});
formatter.result({
  "duration": 4127891147,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.verifyLanding()"
});
formatter.result({
  "duration": 5133887514,
  "status": "passed"
});
formatter.match({
  "location": "PurchaseSteps.finishCart()"
});
formatter.result({
  "duration": 5086812478,
  "status": "passed"
});
formatter.after({
  "duration": 162477325,
  "status": "passed"
});
});