package com.demo.pe.steps.validations;

import com.demo.pe.pages.validations.ValidationPage;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

    @Step("Validar visualizacion de exito")
    public Boolean succesMessageIsVisible(){
        return lbl_succes.isDisplayed();
    }

    @Step("Validar que el usuario ya existe")
    public boolean copyMessageIsVisible(){
        return lbl_copy.isDisplayed();
    }

    @Step("Validar que el usuario no es valido")
    public boolean errorMessageIsVisible(){
        return lbl_error.isDisplayed();
    }


    @Step("Validar usuario ingreso")
    public Boolean UserConnect(){
        return span_user.isDisplayed();
    }

    @Step("Validar de ingreso con credenciales invalidas")
    public Boolean ErrorMessageLogin(){
        return lbl_loginerror.isDisplayed();
    }

}
