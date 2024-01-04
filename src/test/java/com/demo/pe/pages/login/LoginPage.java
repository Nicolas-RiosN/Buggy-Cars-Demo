package com.demo.pe.pages.login;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(xpath = "//input[@class=\"form-control form-control-sm input-sm ng-untouched ng-pristine ng-invalid\"]")
    protected WebElementFacade inp_login;

    @FindBy(xpath = "//input[@class=\"form-control form-control-sm ng-untouched ng-pristine ng-invalid\"]")
    protected WebElementFacade inp_password;

    @FindBy(xpath = "//button[@class=\"btn btn-success\"]")
    protected WebElementFacade btn_login;

    @FindBy(xpath = "//span[@class=\"nav-link disabled\"]")
    protected WebElementFacade span_user;

}
