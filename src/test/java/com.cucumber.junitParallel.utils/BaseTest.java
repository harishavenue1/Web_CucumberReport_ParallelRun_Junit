package com.cucumber.junitParallel.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
  
public class BaseTest {
  
    public WebDriver driver;
    public final static int TIMEOUT = 10;
  
    public WebDriver WebDriverManager ()  {
        if (driver == null) {
        	//WebDriverManager.chromedriver().proxy("10.239.9.190:443").setup();
        	WebDriverManager.chromedriver().clearDriverCache().proxyUser("1570130").proxyPass("PositionSize@9").proxy("127.0.0.1:9000").setup();
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMEOUT));
            driver.manage().window().maximize();
            driver.get("https://opensource-demo.orangehrmlive.com/");
        }
        return driver;
    }
}
