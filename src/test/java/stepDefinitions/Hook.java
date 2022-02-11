package stepDefinitions;

import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Hook {

    static public ChromeDriver driver;

    @Before
    static public void setup() throws IOException {
        System.setProperty("webdriver.chrome.driver","src/test/resources/chromedriver/chromedriver.exe");
        driver = new ChromeDriver();
    }
}
