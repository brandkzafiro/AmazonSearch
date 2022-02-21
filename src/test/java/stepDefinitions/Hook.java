package stepDefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Hook {

    static public WebDriver driver;

    @Before
    static public void setup() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After
    static public void quit() {
        driver.quit();
    }

}
