package elephantProj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage {

    private By email = By.xpath("//input[@name='email']");
    private By password = By.xpath("//input[@name='password']");
    private By repassword = By.xpath("//input[@name='confirmation']");
    private By button = By.xpath("//input[@type='submit']");
    private By signIn = By.xpath("//a[contains(text(),'Sign In')]");
    private WebDriver webDriver;

    public SignUpPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public SignUpPage typeEmail(String text){
        webDriver.findElement(email).sendKeys(text);
        return this;
    }

    public SignUpPage typePassword(String text){
        webDriver.findElement(password).sendKeys(text);
        return this;
    }

    public SignUpPage typeRePassword(String text){
        webDriver.findElement(repassword).sendKeys(text);
        return this;
    }

    public SignUpPage clickSignUp(){
        webDriver.findElement(button).click();
        return this;
    }

    public LoginPage clickLogin(){
        webDriver.findElement(signIn).click();
        return new LoginPage(webDriver);
    }
}
