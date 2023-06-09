package org.example.steps;

import lombok.extern.log4j.Log4j2;
import org.example.models.UserData;
import org.example.pages.LoginFormPage;
import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginFormSteps {

    private LoginFormPage loginFormPage;

    public LoginFormSteps(WebDriver driver) {
        loginFormPage = new LoginFormPage(driver);
    }

    public void clickNavigationButton() {
        log.info("Click navigation button");
        loginFormPage.getNavigationButton().click();
    }

    public void clickRegisterButton() {
        log.info("Click register button");
        loginFormPage.getRegisterButton().click();
    }

    public void enterLogin(String login) {
        log.info("Enter login");
        loginFormPage.getLoginField().sendKeys(login);
    }

    public void enterPassword(String password) {
        log.info("Enter password");
        loginFormPage.getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() {
        log.info("Click login button");
        loginFormPage.getLoginButton().click();
    }

    public void openAndFillLoginForm(UserData userData) {
        loginFormPage.getNavigationButton().click();
        log.info("Click navigation button");
        Waiters.waitForVisibility(loginFormPage.getRegisterButton());
        loginFormPage.getRegisterButton().click();
        log.info("Click register button");
        Waiters.waitForVisibility(loginFormPage.getLoginField());
        log.info("Enter login");
        loginFormPage.getLoginField().sendKeys(userData.getLogin());
        log.info("Enter password");
        loginFormPage.getPasswordField().sendKeys(userData.getPassword());
        log.info("Click login button");
        loginFormPage.getLoginButton().click();


    }

}
