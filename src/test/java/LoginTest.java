import org.example.driver.DriverManager;
import org.example.models.UserData;
import org.example.pages.LoginFormPage;
import org.example.steps.LoginFormSteps;
import org.example.utils.JsonReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    protected WebDriver driver;
    private LoginFormSteps loginFormSteps;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        loginFormSteps = new LoginFormSteps(driver);
    }

    @Test(dataProvider = "userData", dataProviderClass = JsonReader.class)
    public void testLogin(UserData userData) {
        loginFormSteps.openAndFillLoginForm(userData);

        WebElement userDataText = driver.findElement(By.xpath("//td[@id='hsbc_auth']"));
        Assert.assertTrue(userDataText.getText().contains("johnsons"));
    }
}

