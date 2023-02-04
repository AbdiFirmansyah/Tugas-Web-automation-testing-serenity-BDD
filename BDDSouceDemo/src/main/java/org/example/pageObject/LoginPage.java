package org.example.pageObject;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver driver;
    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@id='user-name']")
    private WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    private WebElement password;

    @FindBy(xpath = "//input[@id='login-button']")
    private WebElement buttonLogin;

    @FindBy(xpath = "//h3")
    private WebElement errorText;

    public void setUserName(String user){
        userName.sendKeys(user);
    }

    public void setPassword(String pass){
        password.sendKeys(pass);
    }

    public void clickLogin(){
        buttonLogin.click();
    }


    public boolean verifyloginPage(){
         userName.isDisplayed();
         return true;

    }

    public String verifyErrorText(){
        return errorText.getText();
    }


}