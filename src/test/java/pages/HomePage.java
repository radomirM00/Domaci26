package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    public HomePage() {
    }

    public HomePage(WebDriver driver) {
        super(driver);
    }

    private WebElement addToCartBtn = getDriver().findElement(By.xpath("//*[@id=\"inventory_container\"]/div/div[1]")).findElement(By.id("add-to-cart-sauce-labs-backpack"));
    public void addToCart(){
        addToCartBtn.click();
    }


}
