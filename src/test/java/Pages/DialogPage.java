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
    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement fieldNameInput;
    @FindBy(xpath="//span[text()='Search']")
    public WebElement searchButton;

    @FindBy(css="button[color='accent']")
    public WebElement editButton;
///////////////////////////EMRE////////////////////////
    @FindBy(xpath = "(//input[@data-placeholder='Name'])[2]")
     public WebElement newPositionName;
    @FindBy(xpath = "(//ms-delete-button//button)[1]")
    public WebElement deleteImageBtn;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement deleteDialogBtn;
    @FindBy(xpath = "//ms-edit-button")
    public WebElement edit;
    @FindBy(xpath = "//ms-add-button[contains(@tooltip,'ADD')]//button")
    public WebElement addButton;
    @FindBy(xpath = "//div[contains(text(),'successfully')]")
    public WebElement successsMessage;
    @FindBy(xpath = "//span[text()='Save']")
    public WebElement saveeButton;
    @FindBy(css = "[data-placeholder='Name']")
    public WebElement nameSearch;


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
            case "fieldNameInput": return this.fieldNameInput;
            case "editButton": return this.editButton;
            case "newPositionName": return this.newPositionName;
            case "nameSearch": return this.nameSearch;
            case "deleteImageBtn": return this.deleteImageBtn;
            case "edit": return this.edit;
            case "addButton": return this.addButton;
            case "successsMessage": return this.successsMessage;
            case "saveeButton": return this.saveeButton;




        }
        return null;
    }


}
