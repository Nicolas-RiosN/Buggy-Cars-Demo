package com.demo.pe.definitions;

import com.demo.pe.steps.registro.RegistroStep;
import com.demo.pe.steps.validations.ValidationStep;
import com.demo.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class RegistroDef {

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    RegistroStep registro;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo(){
        url.navigateTo("https://buggy.justtestit.org");
        registro.clickRegister();
    }

    @When("ingresa credenciales validas")
    public void userRegisterWithValidCredentials(){
        registro.typeUser("Nicolas");
        registro.typeName("Nicolas");
        registro.typeLastName("Rios");
        registro.typePassword("SecurePass1%");
        registro.typeConfirmPass("SecurePass1%");
        registro.clickConfirm();
    }

    @Then("la aplicacion deberia dar un mensaje de registro exitoso")
    public void systemShowSuccesMessage(){
        Assert.assertTrue(validate.succesMessageIsVisible());
    }

    @When("ingresa credenciales ya existentes")
    public void userRegisterWithInUseCredentials(){
        registro.typeUser("Nicolas");
        registro.typeName("Nicolas");
        registro.typeLastName("Rios");
        registro.typePassword("SecurePass1%");
        registro.typeConfirmPass("SecurePass1%");
        registro.clickConfirm();
    }

    @Then("la aplicacion muestra un mensaje de usuario existente")
    public void systemShowMessage(){
        Assert.assertTrue(validate.copyMessageIsVisible());
    }

    @When("ingresa credenciales no validas")
    public void userRegisterWithInvalidCredentials(){
        registro.typeUser("a");
        registro.typeName("a");
        registro.typeLastName("a");
        registro.typePassword("a");
        registro.typeConfirmPass("a");
        registro.clickConfirm();
    }

    @Then("la aplicacion muestra un mensaje de error")
    public void systemShowErrorMessage(){
        Assert.assertTrue(validate.errorMessageIsVisible());
    }

}
