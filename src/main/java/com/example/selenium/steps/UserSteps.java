package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;
    MainPage equalsT;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public com.example.selenium.steps.UserSteps login(String username, String password) {
        loginPage = new LoginPage(driver);
        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();
        equalsT = new MainPage(driver);
        assertEquals(equalsT.getTitle(), "Secure Area", "Login failed");
        return this;
    }

    public UserSteps logout() {
        mainPage = new MainPage(driver);
        mainPage.clickLogout();
        return this;
    }
}
