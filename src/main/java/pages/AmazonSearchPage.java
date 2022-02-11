package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonSearchPage {
    private String searchBox = "//input[@id='twotabsearchtextbox']";
    private String searchButton = "//input[@id='nav-search-submit-button']";
    private String thirdResult = "//*[@id='search']/div[1]/div[1]/div/span[3]/div[2]/div[5]/div/div/div/div/div/div[1]/div/div[2]";
    private String addToCartButton = "//input[@id='add-to-cart-button']";
    private String addedMessageText = "//*[contains(text(), 'Agregado al carrito')]";
    WebDriver driver;

    public AmazonSearchPage(WebDriver driver) {
        this.driver=driver;
    }

    public void navigateToAmazon(){
        driver.navigate().to("www.amazon.com");
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
