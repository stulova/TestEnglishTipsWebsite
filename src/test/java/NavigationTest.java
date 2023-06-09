import org.example.driver.DriverManager;
import org.example.pages.NavigationPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    protected WebDriver driver;
    private NavigationPage navigationPage;

    @BeforeClass
    public void preparationForTest() {
        driver = DriverManager.getDriver();
        navigationPage = new NavigationPage(driver);
    }


    @Test
    public void testSearchNavigation() {
        navigationPage.clickNavigationButton();
        navigationPage.clickSearchButton();
        WebElement userDataText = driver.findElement(By.xpath("//td[@class='otitle']"));
        Assert.assertTrue(userDataText.getText().contains("Search Englishtips.org:"));
    }

    @Test
    public void testRulesNavigation() {
        navigationPage.clickNavigationButton();
        navigationPage.clickRulesButton();
        WebElement userDataText = driver.findElement(By.xpath("//td[@class='otitle']"));
        Assert.assertTrue(userDataText.getText().contains("Rules For Publishing Your Materials at Englishtips.org"));
    }

    @Test
    public void testAddArticleNavigation() {
        navigationPage.clickNavigationButton();
        navigationPage.clickAddArticleButton();
        WebElement userDataText = driver.findElement(By.xpath("//td[@class='newshead']"));
        Assert.assertTrue(userDataText.getText().contains("RULES FOR ADDING/PUBLISHING NEW MATERIALS"));
    }

}