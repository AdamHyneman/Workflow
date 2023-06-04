package elephantProj.ui;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.util.Optional;

public class BaseTest implements TestWatcher {

    @BeforeAll
    public static void setup(){
        WebDriverManager.chromedriver().setup();
    }

    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        try {
            takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        try {
            takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        try {
            takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        try {
            takeScreenshot();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void takeScreenshot() throws IOException {
        File file = ((TakesScreenshot) WebDriverManager.chromedriver().getWebDriver()).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("screenshot"));
    }
}
