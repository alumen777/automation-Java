package pages;

import org.openqa.selenium.support.PageFactory;
import static support.TestContext.getDriver;

public class Page {
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Page() {
        PageFactory.initElements(getDriver(), this);
    }

    public void open() {
        getDriver().get(getUrl());
    }
}
