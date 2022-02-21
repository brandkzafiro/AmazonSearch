package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class AmazonSearchPage {
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "(//div[@data-index='3' or @data-index='8']//a)[2]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//*[contains(text(), 'Agregado al carrito')]";
    WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver=driver;
    }

    public void navigateToAmazon(){
        driver.navigate().to("https://www.amazon.com/");
    }

    public void goToPage(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }

    public void enterSearchText(String text){
        driver.findElement(By.xpath(searchBox)).sendKeys(text);
    }

    public void clickSearch(){
        driver.findElement(By.xpath(searchButton)).click();
    }

    public void pickThirdItem(){
        WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(15))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(thirdResult)));

       driver.findElement(By.xpath(thirdResult)).click();
    }

    public void addtoCart(){
        driver.findElement(By.xpath(addToCartButton)).click();
    }

    public String addedToCartMessage(){
        return driver.findElement(By.xpath(addedMessageText)).getText();
    }

    public void closeBrowser() {
        driver.quit();
    }
}
