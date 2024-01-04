package com.demo.pe.steps.login;

import com.demo.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step("Ingresar login de usuario")
    public void typeLogin(String login){
        inp_login.sendKeys(login);
    }

    @Step("Ingresar contraseña de usuario")
    public void typePassword(String password){
        inp_password.sendKeys(password);
    }

    @Step("Dar click en login")
    public void clickLogin(){
        btn_login.click();
    }
}
