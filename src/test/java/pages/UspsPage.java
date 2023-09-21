package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UspsPage extends Page {

    public UspsPage() {
        setUrl("https://www.usps.com/");
    }

    @FindBy(xpath = "//a[contains(text(), 'Calculate a Price')]")
    private WebElement calculatePriceButton;

    @FindBy(xpath = "//a[@id='mail-ship-width']")
    private WebElement send;

    public void ClickOnCalculatePrice() {
        calculatePriceButton.click();
    }

    public WebElement getSend() {
        return send;
    }

    public WebElement getCalculatePriceButton() {
        return calculatePriceButton;
    }
}
