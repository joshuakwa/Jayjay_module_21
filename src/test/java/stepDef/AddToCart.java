package stepDef;

import Base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class AddToCart extends BaseTest {

    LoginPage loginPage;
    HomePage homePage;

    @And("user is on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.checkFirstBackpackisDisplayed();
    }

    @When("user click button add to cart")
    public void userClickButtonAddToCart() {
        homePage.setAddToCartFirstBackpack();
    }

    @Then("user will see icon cart count is {string}")
    public void userWillSeeIconCartCountIs(String count) {
        homePage.checkCartCount(count);
    }


    @Given("user login with valid email {string} and password {string}")
    public void userLoginWithValidEmailAndPassword(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.goToSauceDemo();
        loginPage.inputUsername(username);
        loginPage.inputPassword(password);
        loginPage.clickLoginButton();
    }
}
