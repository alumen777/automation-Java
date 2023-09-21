package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import pages.UspsPage;

public class UspsStepDefs {

    String path = System.getProperty("user.dir") + "/src/test/resources/downloads/chromedriver.exe";
    WebDriver driver;
    Actions actions;
    UspsPage uspsPage = new UspsPage();


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", path);
        driver = new ChromeDriver();
        actions = new Actions(driver);
        driver.manage().window().maximize();
    }
    @Given("I open {string} page")
    public void iOpenPage(String url) {
        driver.get(url);
    }

    @When("I click on WebElement")
    public void iClickOnWebElement() throws InterruptedException {

        WebElement sendButton = driver.findElement(By.xpath("//*[@id='mail-ship-width']/.."));
        WebElement calculatePriceButton = driver.findElement(By.xpath("//a[contains(text(), 'Calculate a Price')]"));

        actions.moveToElement(sendButton).build().perform();
        Thread.sleep(5000);

        //getExecuter().executeScript("arguments[0].click();", calculatePriceButton);
        //actions.click().moveToElement(calculatePriceButton).build().perform();

        calculatePriceButton.click();
        Thread.sleep(10000);
    }

    @After(order = 0)
    public void scenarioEnd(Scenario scenario) {

        driver.quit();
    }
}
