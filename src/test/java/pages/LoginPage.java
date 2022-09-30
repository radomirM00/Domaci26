package pages;
//Login na stranicu (username: standard_user, password: secret_sauce)

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage{
    public LoginPage() {
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private WebElement usernameInput = getDriver().findElement(By.id("user-name"));
    private WebElement passwordInput = getDriver().findElement(By.id("password"));
    private  WebElement loginBtn = getDriver().findElement(By.id("login-button"));

    public void logIn(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();
    }




}
