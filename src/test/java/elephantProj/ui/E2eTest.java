package elephantProj.ui;

import elephantProj.pages.HomePage;
import elephantProj.pages.LoginPage;
import elephantProj.pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class E2eTest extends BaseTest {
   private WebDriver webDriver;

    public void signUp(){
        webDriver = WebDriverManager.chromedriver().create();
        webDriver.get("http://localhost:7000/login");

        LoginPage loginPage = new LoginPage(webDriver);

        SignUpPage signUpPage = loginPage.clickSignUp();
        signUpPage.typeEmail("admin@mail.com");
        signUpPage.typePassword("Pass.me.14");
        signUpPage.typeRePassword("Pass.me.14");
        signUpPage.clickSignUp();

        loginPage = signUpPage.clickLogin();
        loginPage.typeEmail("admin@mail.com");
        loginPage.typePassword("Pass.me.14");

        HomePage homePage = loginPage.clickLogin();
    }
}
