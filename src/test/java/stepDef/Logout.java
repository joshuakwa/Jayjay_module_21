package stepDef;

import Base.BaseTest;
import groovy.util.logging.Log;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class Logout extends BaseTest {

    HomePage homePage;
    LoginPage loginPage;
    @When("user click hamburger")
    public void userClickHamburger() {
        homePage = new HomePage(driver);
        homePage.clickHamburgerHomePage();
    }

    @And("user click logout button")
    public void userClickLogoutButton() {
        homePage.clickLogoutButon();
    }

    @Then("user will redirect to login page")
    public void userWillRedirectToLoginPage() {
        loginPage = new LoginPage(driver);
        loginPage.checkLoginFieldIsDisplayed();
    }
}
