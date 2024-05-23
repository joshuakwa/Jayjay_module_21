package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class HomePage {
    WebDriver driver;

    By firstBackpack = By.xpath("//*[@id=\"item_4_title_link\"]/div");
    By addToCartFirstBackpack = By.id("add-to-cart-sauce-labs-backpack");
    By cartCount = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");
    By hamburgerHomePage = By.id("react-burger-menu-btn");
    By logoutButton = By.id("logout_sidebar_link");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void checkFirstBackpackisDisplayed(){
        assertTrue(driver.findElement(firstBackpack).isDisplayed());
    }

    public void setAddToCartFirstBackpack(){
        driver.findElement(addToCartFirstBackpack).click();
    }

    public void checkCartCount(String counter){
        String countItem = driver.findElement(cartCount).getText();
        assertEquals(counter, countItem);
    }

    public void clickHamburgerHomePage(){
        driver.findElement(hamburgerHomePage).click();
    }

    public void clickLogoutButon(){
        driver.findElement(logoutButton).click();
    }
}
