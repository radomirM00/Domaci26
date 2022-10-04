package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver, WebDriverWait driverWait){
        super(driver,driverWait);
    }
    private By username = By.id("user-name");
    private By password = By.id("password");

    private By logInBtn = By.id("login-button");

    public WebElement getUsernameInput() {
        return getDriver().findElement(username);
    }
    public WebElement getPasswordInput(){
        return getDriver().findElement(password);
    }
    public WebElement getLoginBtn(){
        return getDriver().findElement(logInBtn);
    }

    public void logIn(){
        getUsernameInput().sendKeys("standard_user");
        getPasswordInput().sendKeys("secret_sauce");
        getLoginBtn().click();
    }
}