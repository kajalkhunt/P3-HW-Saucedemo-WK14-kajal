package com.saucedemo.testsuite;


import com.saucedemo.pages.LoginPage;
import com.saucedemo.testbase.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginPageTest extends BaseTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();

        String expectedMessage = "PRODUCTS";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "User Not Logging In");
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        loginPage.enterUserName("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickOnLoginButton();
       int expected = 6;
        int actual  = driver.findElements(By.xpath("//div[@class='inventory_item']")).size();
        Assert.assertEquals(expected, actual);
        System.out.println("Total number of Products displayed on page  :  " + actual);

    }

}
