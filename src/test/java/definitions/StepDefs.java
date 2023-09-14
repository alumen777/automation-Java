package definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefs {

    String path = System.getProperty("user.dir") + "/src/test/resources/downloads/chromedriver.exe";
    WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
    }

    @Given("I open {string}")
    public void i_open(String website) {
        driver.get(website);
        String title = driver.getTitle();
        System.out.println("Page title: " + title);
    }
}

