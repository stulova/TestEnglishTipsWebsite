package org.example.pages;

import org.example.utils.Waiters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoginFormPage extends BasePage {

    protected WebDriver driver;

    @FindBy(xpath = "//div[@id='navpanel-btn']")
    private WebElement navigationButton;

    @FindBy(xpath = "//a[@href='/?do=register'][1]")
    private WebElement registerButton;

    @FindBy(xpath = "//input[@name='login_name']")
    private WebElement loginField;

    @FindBy(xpath = "//input[@name='login_password']")
    private WebElement passwordField;

    @FindBy(xpath = "//input[@title='Login']")
    private WebElement loginButton;

    public LoginFormPage(WebDriver driver) {
        super(driver);
    }

    public void clickNavigationButton() {
        navigationButton.click();
    }

    public void clickRegisterButton() {
        registerButton.click();
    }

    public void enterLogin(String login) {
        Waiters.waitForVisibility(loginField);
        loginField.sendKeys(login);
    }

    public void enterPassword(String password) {
        Waiters.waitForVisibility(passwordField);
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}