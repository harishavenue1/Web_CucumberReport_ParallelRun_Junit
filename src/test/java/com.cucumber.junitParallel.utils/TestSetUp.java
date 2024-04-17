package com.cucumber.junitParallel.utils;

import org.openqa.selenium.WebElement;
import com.cucumber.junitParallel.pages.PageObjectManager;
  
public class TestSetUp {
  
    public WebElement errorMessage;
    public WebElement homePageUserName;
    public PageObjectManager pageObjectManager;
    public BaseTest baseTest;
  
    public TestSetUp()  {
  
        baseTest = new BaseTest();
        pageObjectManager = new PageObjectManager(baseTest.WebDriverManager());
  
    }
}
