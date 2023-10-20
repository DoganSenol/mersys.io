package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogPage extends Methods {
    public DialogPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    /////////////////////////////////////Senol///////////////////////////////////////////////
    @FindBy(xpath = "((//div[@fxlayout='row'])[3]//span)[1]")
    public WebElement loginVerify;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement AddButton;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='name']//input")
    public WebElement nameInput;
    @FindBy(xpath = "//ms-text-field[@formcontrolname='code']//input")
    public WebElement codeInput;
    @FindBy(xpath = "(//*[@class='mdc-switch__icon mdc-switch__icon--off'])[9]")
    public WebElement activeDisableButton;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;






    public WebElement getWebElement(String stringElement){
        switch (stringElement){

            case "loginVerify": return this.loginVerify;
            case "AddButton": return this.AddButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "activeDisableButton": return this.activeDisableButton;
            case "saveButton": return this.saveButton;
            case "successMessage": return this.successMessage;
            case "alreadyExist": return this.alreadyExist;



        }
        return null;
    }


}