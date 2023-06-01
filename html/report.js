$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Nopcommerce Registration",
  "description": "",
  "id": "nopcommerce-registration",
  "keyword": "Feature"
});
formatter.before({
  "duration": 18021795300,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Nopcommerce Registration",
  "description": "",
  "id": "nopcommerce-registration;nopcommerce-registration",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Register"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "user click on register link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user is on registration page and verify registartion page",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter registration details and click on register button",
  "keyword": "And "
});
formatter.match({
  "location": "Register.user_click_on_register_link()"
});
formatter.result({
  "duration": 2857189400,
  "status": "passed"
});
formatter.match({
  "location": "Register.user_is_on_registration_page_and_verify_registartion_page()"
});
formatter.result({
  "duration": 60078000,
  "status": "passed"
});
formatter.match({
  "location": "Register.select_a_gender_enter_a_valid_firstname_and_lastname()"
});
formatter.result({
  "duration": 6651023600,
  "status": "passed"
});
formatter.after({
  "duration": 3023348600,
  "status": "passed"
});
});