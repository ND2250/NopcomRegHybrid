package webElements;

import commanPages.LoadProperty;
import commanPages.Utils;
import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProperty loadProperty = new LoadProperty();

   private By _clickonregistrationLink = By.className("ico-register");
   private By _gender = By.className("male");
   private By _firstname = By.id("FirstName");
   private By _lastname = By.id("LastName");
   private By _dayOfBirth = By.name("DateOfBirthDay");
   private By _monthOfBirth = By.name("DateOfBirthMonth");
   private By _yearOfBirth = By.name("DateOfBirthYear");
   private By _email = By.id("Email");
   private By _company = By.id("Company");
   private By _password = By.id("Password");
   private By _confirmPassword = By.id("ConfirmPassword");
   private By _registerButton = By.id("register-button");


   public void clickonregistrationlink(){

       doClick(_clickonregistrationLink);
   }

   public void doRegistration(){
    doClick(_gender);
    doSendKey(_firstname, loadProperty.getProperty("firstname"));
    doSendKey(_lastname, loadProperty.getProperty("lastname"));
    doSendKey(_dayOfBirth, loadProperty.getProperty("dateOfBirth"));
    doSendKey(_monthOfBirth, loadProperty.getProperty("monthOfBirth"));
    doSendKey(_yearOfBirth, loadProperty.getProperty("yearOfBirth"));
    doSendKey(_email, loadProperty.getProperty("email"));
    doSendKey(_company, loadProperty.getProperty("companyName"));
    doSendKey(_password, loadProperty.getProperty("password"));
    doSendKey(_confirmPassword, loadProperty.getProperty("confirmPassword"));
    doClick(_registerButton);
   }

}
