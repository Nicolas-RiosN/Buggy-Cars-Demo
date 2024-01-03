package com.demo.pe.pages.registro;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class RegistroPage extends PageObject {

    @FindBy(xpath = "//a[@class=\"btn btn-success-outline\"]")
    protected WebElementFacade btn_register;

    @FindBy(id = "username")
    protected WebElementFacade inp_login;

    @FindBy(id = "firstName")
    protected WebElementFacade inp_name;

    @FindBy(id = "lastName")
    protected WebElementFacade inp_lastname;

    @FindBy(id = "password")
    protected WebElementFacade inp_password;

    @FindBy(id = "confirmPassword")
    protected WebElementFacade inp_confirmpass;

}
