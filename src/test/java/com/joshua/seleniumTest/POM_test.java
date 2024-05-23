package com.joshua.seleniumTest;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;

public class POM_test {
    WebDriver driver;

    @Test
    public void test_login() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);

        loginPage.goToSauceDemo();
        loginPage.inputUsername("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();

        homePage.checkFirstBackpackisDisplayed();

        // negative test
        driver.navigate().to("https://saucedemo.com");
        loginPage.inputUsername("asd");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
        loginPage.seeErrorMessage("Epic sadface: Username and password do not match any user in this service");

        Thread.sleep(2000);
        driver.quit();
    }
}
