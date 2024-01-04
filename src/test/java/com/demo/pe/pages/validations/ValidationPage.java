package com.demo.pe.pages.validations;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class ValidationPage extends PageObject {

    @FindBy(xpath = "//div[@class=\"result alert alert-success\"]")
    protected WebElementFacade lbl_succes;

    @FindBy(xpath = "//div[@class=\"result alert alert-danger\"]")
    protected WebElementFacade lbl_copy;

    @FindBy(xpath = "//div[@class=\"result alert alert-danger\"]")
    protected WebElementFacade lbl_error;

    @FindBy(xpath = "//span[@class='nav-link disabled'][contains(.,'Hi, Nicolas')]")
    protected WebElementFacade span_user;

    @FindBy(xpath = "//a[@class=\"nav-link\" and text()='Logout']")
    protected WebElementFacade btn_logout;

    @FindBy(xpath = "/html/body/my-app/header/nav/div/my-login/div/ul/li[2]/a")
    protected WebElementFacade btn_profile;

    @FindBy(xpath = "//span[@class=\"label label-warning\"]")
    protected WebElementFacade lbl_loginerror;

}
