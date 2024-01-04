package com.demo.pe.steps.registro;

import com.demo.pe.pages.registro.RegistroPage;
import net.thucydides.core.annotations.Step;

public class RegistroStep extends RegistroPage {

    @Step("Click en el boton de registro")
    public void clickRegister(){
        btn_register.click();
    }

    @Step("Ingresar login")
    public void typeUser(String username){
        inp_login.sendKeys(username);
    }

    @Step("Ingresar nombre")
    public void typeName(String name){
        inp_name.sendKeys(name);
    }

    @Step("Ingresar apellido")
    public void typeLastName(String lastname){
        inp_lastname.sendKeys(lastname);
    }

    @Step("Ingresar contraseña")
    public void typePassword(String pass){
        inp_password.sendKeys(pass);
    }

    @Step("Confirmar contraseña")
    public void typeConfirmPass(String confirmPass){
        inp_confirmpass.sendKeys(confirmPass);
    }

    @Step("Dar click a confirmar")
    public void clickConfirm(){
        btn_confirm.click();
    }
}
