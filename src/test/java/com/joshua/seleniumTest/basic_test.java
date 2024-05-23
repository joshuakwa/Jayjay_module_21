package com.joshua.seleniumTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class basic_test {

    public static WebDriver driver;
    @Test
    public void sauceDemo() throws InterruptedException {
        // Inisialisasi sriver
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        driver.get("https://saucedemo.com");

        String login_logo = driver.findElement(By.className("login_logo")).getText();
        assertEquals("Swag Labs", login_logo);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();


        Thread.sleep(2000);
        driver.quit();

    }
}
