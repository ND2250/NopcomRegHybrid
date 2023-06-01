package stepDefinitions;

import commanPages.Utils;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resultVerification.ResultVerificationforRegisterPage;
import webElements.RegisterPage;

public class Register extends Utils {

    RegisterPage registerPage = new RegisterPage();

    ResultVerificationforRegisterPage resultVerificationforRegisterPage = new ResultVerificationforRegisterPage();



    @When("^user click on register link$")
    public void user_click_on_register_link(){
        registerPage.clickonregistrationlink();
    }

    @When("^user is on registration page and verify registartion page$")
    public void user_is_on_registration_page_and_verify_registartion_page() {
        resultVerificationforRegisterPage.registerPageTitle();
    }

    @When("^user enter registration details and click on register button$")
    public void select_a_gender_enter_a_valid_firstname_and_lastname() {
        registerPage.doRegistration();
    }






}
