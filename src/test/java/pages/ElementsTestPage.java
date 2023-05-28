package pages;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WindowType;
import settings.BaseTest;
import org.openqa.selenium.WebDriver;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static settings.Locators.*;
public class ElementsTestPage extends BaseTest {
    public ElementsTestPage(WebDriver driver) {
        super(driver);
    }


    public boolean verifyThatTextBoxPageIsDisplayed() {
        return Selenide.$x("//div[text()='Text Box']").isDisplayed();
    }

    public void typeInTheField(String text, String text1) {
        Selenide.$x(UNIVERSAL_TEXT_BOX_XPATH.replace("$1", text1)).sendKeys(text);
    }

    public void clickOnTheButton(String text) {
        Selenide.$x(UNIVERSAL_ELEMENTS_TAB_XPATH.replace("$1", text)).scrollTo().click();
    }

    public boolean verifyThatPageIsDisplayed(String text) {
        return Selenide.$x(UNIVERSAL_ELEMENTS_PAGE_XPATH.replace("$1", text)).isDisplayed();
    }

    public void typeInTheTextArea(String text) {
        Selenide.$x("//textarea[@id='currentAddress']").sendKeys(text);
    }

    public void clickOnButton() throws InterruptedException {
        Selenide.$x("//a[.='Download']").scrollTo().click();
    Thread.sleep(3000);
    }

    public boolean verifyThatResultsIsDisplayed() {
        return Selenide.$x("//div[@id='output']").isDisplayed();
    }

    public void clickOnTheRadioButton(String text) {
        Selenide.$x(UNIVERSAL_RADIO_BUTTONS_XPATH.replace("$1", text)).click();
    }

    public boolean verifyThatRadioButtonIsChosen(String text) {
        return Selenide.$x(TEXT_SUCCESS_RADIO_BUTTON_XPATH.replace("$1", text)).isDisplayed();
    }

    public void verifyThatNoRadioButtonIsnTClickable() {
        SelenideElement el =Selenide.$x ("//label[normalize-space()='No']");
        el.shouldBe(interactable);
    }

    public void clickOnTheDoubleClickButton() throws InterruptedException {

        Selenide.$x("//button[.='Double Click Me']").doubleClick();
    Thread.sleep(2000);
    }
    public void verifyThatDoubleClickIsDone() {
        Selenide.$x("//p[.='You have done a double click']").isDisplayed();
    }

    public void clickOnTheRightClickButton() throws InterruptedException {
    Selenide.$x("//button[@id='rightClickBtn']").contextClick();
    Thread.sleep(2000);
    }

    public boolean verifyThatRightClickIsDone() {
return Selenide.$x("//p[@id='rightClickMessage']").isDisplayed();

    }

    public void clickOnTheBrokenLinkButton() {
    Selenide.$x("//a[normalize-space()='Click Here for Broken Link']").click();

    }

    public boolean verifyThatBrokenLinksPageIsOpened() {
         switchTo().window("The Internet");
     return true;

    }

    public boolean verifyThatFileIsDownloaded() {
     File f = new File("C:\\Users\\sasha\\Downloads");
    return f.exists();
    }

    public void clickOnUploadFile() throws InterruptedException {
   File picture = new File("C:\\Users\\sasha\\Desktop\\0_7c779_5df17311_orig.jpg");
    Selenide.$x("//input[@class='form-control-file']").uploadFile(picture);

    }

    public void chooseFileForUploading() throws InterruptedException {

    $("#uploadFile").uploadFromClasspath("src/test/java/TestFiles/TestPicture.jpg");
    }

    public void clickOnSubmitButton() {
    Selenide.$x("//button[@id='submit']").scrollTo().click();
    }
}