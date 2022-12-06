package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage extends Utility {
    By userNameField = By.id ("user-name");
    By passwordFiled = By.id ("password");
    By loginButton = By.xpath("//*[@id='login-button']");

    By verifyProductText = By.xpath("//span[text()='Products']");

    By noOfProduct = By.xpath("//div[@class='inventory_item_name']");

    public void enterUserName (String userNameText){
        sendTextToElement(userNameField, userNameText);
    }

    public void enterPassword(String passwordText){
        sendTextToElement(passwordFiled, passwordText);
    }
    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public String getSecureAreaText(){
        return getTextFromElement(verifyProductText);
    }
    public void getNumberOfProductsDisplayedList(){
        List<WebElement> list = driver.findElements(noOfProduct);


    }

}
