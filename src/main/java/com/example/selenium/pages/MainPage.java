package com.example.selenium.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage extends com.example.selenium.pages.BasePage {
    @FindBy(how = How.CSS, using = "h2")
    private WebElement title;
    @FindBy(how = How.LINK_TEXT, using = "Logout")
    private WebElement exit;

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public String getTitle() {
        return title.getText();
    }

    public MainPage clickLogout() {
        exit.click();
        return this;
    }
}
