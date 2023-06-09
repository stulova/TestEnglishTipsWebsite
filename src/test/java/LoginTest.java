import org.example.driver.DriverManager;
import org.example.pages.LoginFormPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    protected WebDriver driver;
    private LoginFormPage loginFormPage;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        loginFormPage = new LoginFormPage(driver);
    }

    @Test
    public void testLogin() {
        loginFormPage.clickNavigationButton();
        loginFormPage.clickRegisterButton();
        loginFormPage.enterLogin("johnsons");
        loginFormPage.enterPassword("111222");
        loginFormPage.clickLoginButton();

        WebElement userDataText = driver.findElement(By.xpath("//td[@id='hsbc_auth']"));

        Assert.assertTrue(userDataText.getText().contains("johnsons"));
    }
}