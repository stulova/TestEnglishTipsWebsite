package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class NavigationPage extends BasePage {

    protected WebDriver driver;

    @FindBy(xpath = "//div[@id='navpanel-btn']")
    private WebElement navigationButton;

    @FindBy(xpath = "//a[@href='/?do=search']")
    private WebElement searchButton;

    @FindBy(xpath = "//a[@href='/rules_for_publishing.html']")
    private WebElement rulesButton;

    @FindBy(xpath = "//a[@href='/addnews.html']")
    private WebElement addArticleButton;

    public NavigationPage(WebDriver driver) {
        super(driver);
    }

    public void clickNavigationButton() {
         navigationButton.click();
    }

    public void clickSearchButton() {
        searchButton.click();
    }

    public void clickRulesButton() {
        rulesButton.click();
    }

    public void clickAddArticleButton() {
        addArticleButton.click();
    }
}
