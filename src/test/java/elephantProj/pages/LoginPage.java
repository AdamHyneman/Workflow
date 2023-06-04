package elephantProj.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage{

    private WebDriver webDriver;

    private By email = By.xpath("//input[@type='email']");
    private By password = By.xpath("//input[@type='password']");
    private By button = By.xpath("//input[@type='submit']");
    private By signUp = By.xpath("//a[contains(text(),'Sign Up')]");

    public LoginPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public LoginPage typeEmail(String text){
        webDriver.findElement(email).sendKeys(text);
        return this;
    }

    public LoginPage typePassword(String text){
        webDriver.findElement(password).sendKeys(text);
        return this;
    }

    public HomePage clickLogin(){
        webDriver.findElement(button).click();
        return new HomePage(webDriver);
    }

    public SignUpPage clickSignUp(){
        webDriver.findElement(signUp).click();
        return new SignUpPage(webDriver);
    }
}
