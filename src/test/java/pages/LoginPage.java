package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage {
    WebDriver driver;

    By usernameInputText = By.cssSelector("input#user-name");
    By passwordInputText = By.xpath("//*[@id=\"password\"]");
    By LoginButton = By.id("login-button");
    By errorMsg = By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]");

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void goToSauceDemo(){
        driver.get("https://saucedemo.com");
    }

    public void checkLoginFieldIsDisplayed(){
        assertTrue(driver.findElement(usernameInputText).isDisplayed());
        assertTrue(driver.findElement(passwordInputText).isDisplayed());
        assertTrue(driver.findElement(LoginButton).isDisplayed());
    }
    public void inputUsername(String username){
        driver.findElement(usernameInputText).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordInputText).sendKeys(password);
    }

    public void clickLoginButton(){
        driver.findElement(LoginButton).click();
    }

    public void seeErrorMessage(String errorMsg){
        assertTrue(driver.getPageSource().contains(errorMsg));
    }
}
