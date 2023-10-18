package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Methods {
    public LoginPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    @FindBy(id = "mat-input-0")
    public WebElement userNameInput;
    @FindBy(id = "mat-input-1")
    public WebElement passwordInput;
    @FindBy(xpath = "//span[text()=' LOGIN ']")
    public WebElement loginButton;
    @FindBy(xpath = "//div[ contains( text(), 'Invalid' )  ] ")
    public WebElement inValidUsernamePassword;
    @FindBy(xpath = "//div//mat-error")
    public WebElement blankPasswordError;



    public WebElement getWebElement(String stringElement){
        switch (stringElement){

            case "userNameInput": return this.userNameInput;
            case "passwordInput": return this.passwordInput;
            case "loginButton": return this.loginButton;
            case "inValidUsernamePassword" : return this.inValidUsernamePassword;
            case "blankPasswordError" : return this.blankPasswordError;

        }
        return null;
    }

}
