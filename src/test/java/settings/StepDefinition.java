package settings;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.ElementsTestPage;
import pages.MainTestPage;

public class StepDefinition {

    private final MainTestPage mainPage = new MainTestPage(Hooks.getDriver());
    private final ElementsTestPage elementsTestPage = new ElementsTestPage(Hooks.getDriver());




    @Given("Open DemoQa main page")
    public void openDemoQaMainPage() {
     mainPage.openDemoQaMainPage();
    }

    @Then("Verify that DemoQa page is opened")
    public void verifyThatDemoQaPageIsOpened() {
        Assert.assertTrue(mainPage.verifyThatDemoQaPageIsOpened(),"DemoQa page is opened");
    }

    @Given("Click on the {string} tab")
    public void clickOnTheTab(String text) throws InterruptedException {
    mainPage.clickOnTheTab(text);
    }

    @And("Verify that {string} page is opened")
    public void verifyThatPageIsOpened(String text) throws InterruptedException {
    Assert.assertTrue(mainPage.verifyThatPageIsOpened(text),"Page is opened");
    }





    @And("Verify that Text box page is displayed")
    public void verifyThatTextBoxPageIsDisplayed() {
    Assert.assertTrue(elementsTestPage.verifyThatTextBoxPageIsDisplayed(),"Page is opened");
    }

    @And("Type {string} in the {string} field")
    public void typeInTheField(String text, String text1) {
    elementsTestPage.typeInTheField(text,text1);
    }

    @Given("Click on the {string} button")
    public void clickOnTheButton(String text) {
    elementsTestPage.clickOnTheButton(text);
    }

    @And("Verify that {string} page is displayed")
    public void verifyThatPageIsDisplayed(String text) {
    Assert.assertTrue(elementsTestPage.verifyThatPageIsDisplayed(text),"Page is opened");
    }

    @Then("Type {string} in the Current Address textArea")
    public void typeInTheTextArea(String text) {
    elementsTestPage.typeInTheTextArea(text);
    }

    @Then("Click on Download button")
    public void clickOnButton() throws InterruptedException {
    elementsTestPage.clickOnButton();
    }

    @And("Verify that results is displayed")
    public void verifyThatResultsIsDisplayed() {
    Assert.assertTrue(elementsTestPage.verifyThatResultsIsDisplayed(),"Results are saved");
    }

    @And("Click on the {string} radio button")
    public void clickOnTheRadioButton(String text) {
    elementsTestPage.clickOnTheRadioButton(text);
    }

    @And("Verify that {string} radio button is chosen")
    public void verifyThatRadioButtonIsChosen(String text) {
    Assert.assertTrue(elementsTestPage.verifyThatRadioButtonIsChosen(text),"Radio button is selected");
    }

    @And("Verify that No radio button isn't clickable")
    public void verifyThatNoRadioButtonIsnTClickable() {
    elementsTestPage.verifyThatNoRadioButtonIsnTClickable();
    }

    @And("Click on the Double-click button")
    public void clickOnTheDoubleClickButton() throws InterruptedException {
    elementsTestPage.clickOnTheDoubleClickButton();
    }

    @And("Verify that double-click is done")
    public void verifyThatDoubleClickIsDone() {
    elementsTestPage.verifyThatDoubleClickIsDone();
    }

    @And("Click on the Right click button")
    public void clickOnTheRightClickButton() throws InterruptedException {
    elementsTestPage.clickOnTheRightClickButton();
    }

    @And("Verify that right click is done")
    public void verifyThatRightClickIsDone() {
Assert.assertTrue(elementsTestPage.verifyThatRightClickIsDone(),"Right click is done");
    }

    @And("Click on the broken link button")
    public void clickOnTheBrokenLinkButton() {
    elementsTestPage.clickOnTheBrokenLinkButton();
    }

    @And("Verify that broken links page is opened")
    public void verifyThatBrokenLinksPageIsOpened() {
    Assert.assertTrue(elementsTestPage.verifyThatBrokenLinksPageIsOpened(),"Broken page is opened");
    }

    @And("Verify that file is downloaded")
    public void verifyThatFileIsDownloaded() {
    Assert.assertTrue(elementsTestPage.verifyThatFileIsDownloaded(),"File is downloaded");
    }

    @And("Click on Upload file")
    public void clickOnUploadFile() throws InterruptedException {
    elementsTestPage.clickOnUploadFile();
    }

    @And("Choose file for uploading")
    public void chooseFileForUploading() throws InterruptedException {
    elementsTestPage.chooseFileForUploading();
    }



    @Then("Click on Submit button")
    public void clickOnSubmitButton() {
    elementsTestPage.clickOnSubmitButton();
    }
}
