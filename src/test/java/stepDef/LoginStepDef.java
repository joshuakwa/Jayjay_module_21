package stepDef;

import Base.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginStepDef extends BaseTest {

//    WebDriver driver;
//
//    @Before
//    public void beforeTest(){
//        ChromeOptions options = new ChromeOptions();
//        driver = new ChromeDriver(options);
//    }

//    @After
//    public void afterTest() throws InterruptedException {
//        Thread.sleep(2000);
//        driver.quit();
//    }

    LoginPage loginPage;
    HomePage homePage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.goToSauceDemo();
    }


    @Then("user will redirect to homepage")
    public void userWillRedirectToHomepage() {
//        By firstBackpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
//        assertTrue(driver.findElement(firstBackpack).isDisplayed());
        homePage = new HomePage(driver);
        homePage.checkFirstBackpackisDisplayed();
    }

    @When("user click login button")
    public void userClickLoginButton() {
//        By LoginButton = By.id("login-button");
//        driver.findElement(LoginButton).click();
        loginPage.clickLoginButton();
    }

    @When("user input email text box with {string}")
    public void userInputEmailTextBoxWith(String username) {
//        By usernameInputText = By.cssSelector("input#user-name");
//        driver.findElement(usernameInputText).sendKeys(username);
        loginPage.inputUsername(username);
    }

    @Then("user will see error message {string}")
    public void userWillSeeErrorMessage(String errorMsg) {
//        assertTrue(driver.getPageSource().contains(errorMsg));
        loginPage.seeErrorMessage(errorMsg);
    }

    @And("user input password text box with {string}")
    public void userInputPasswordTextBoxWith(String password) {
//        By passwordInputText = By.xpath("//*[@id=\"password\"]");
//        driver.findElement(passwordInputText).sendKeys(password);
        loginPage.inputPassword(password);
    }
}
