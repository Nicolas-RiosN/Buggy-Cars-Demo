package com.demo.pe.definitions;

import com.demo.pe.pages.login.LoginPage;
import com.demo.pe.steps.login.LoginStep;
import com.demo.pe.steps.registro.RegistroStep;
import com.demo.pe.steps.validations.ValidationStep;
import com.demo.pe.utilities.website.WebSite;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps(shared = true)
    ValidationStep validate;

    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @When("ingresa credenciales validas para el login")
    public void LoginWithValidCredentials(){
        login.typeLogin("Nicolas");
        login.typePassword("SecurePass1%");
        login.clickLogin();
    }

    @Then("la aplicion deberia darme acceso a sus funciones")
    public void systemShowButtons(){
        Assert.assertTrue(validate.UserConnect());
    }

    @When("ingresa credenciales no validas para el login")
    public void LoginWithInvalidCredentials(){
        login.typeLogin("a");
        login.typePassword("a");
        login.clickLogin();
    }

    @Then("la aplicacion muestra un mensaje de usuario imvalido")
    public void systemErrorLogin(){
        Assert.assertTrue(validate.ErrorMessageLogin());
    }
}
