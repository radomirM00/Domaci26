package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import pages.LoginPage;

public class Test{
    private LoginPage loginPage;
    private WebDriver driver;
    private WebDriverWait driverWait;
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver,driverWait);
    }

    @org.testng.annotations.Test
    public void logIn(){
        loginPage.logIn();
        String actualUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals(actualUrl,expectedUrl);
    }
}