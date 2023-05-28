package settings;

import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;

    public BaseTest(WebDriver driver) {
        this.driver = driver;
    }

}
