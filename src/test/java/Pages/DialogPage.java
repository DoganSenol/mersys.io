package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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
    @FindBy(css = "[class='mdc-switch mdc-switch--selected mdc-switch--checked']")
    public WebElement activeButtonOn;
    @FindBy(css = " [class='mdc-switch mdc-switch--unselected']")
    public WebElement activeButtonOff;
    @FindBy(xpath="//ms-save-button/button")
    public WebElement saveButton;
    @FindBy(xpath="//div[contains(text(),'successfully')]")
    public WebElement successMessage;
    @FindBy(xpath="//div[contains(text(),'already exists')]")
    public WebElement alreadyExist;
    @FindBy(xpath="//mat-form-field//input[@data-placeholder='Name']")
    public WebElement fieldNameInput;
    @FindBy(xpath="//ms-search-button//button")
    public WebElement searchButton;
    @FindBy(css="button[color='accent']")
    public WebElement editButton;
    @FindBy(css="button[color='warn']")
    public WebElement deleteIcon;
    @FindBy(xpath="//button[@color='accent' and @type='submit']")
    public WebElement deleteButton;



    public void ClickEditButton() throws InterruptedException {
        myClick(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@class='mdc-button mat-mdc-button mat-accent mat-flat-button mat-mdc-button-base']/*"), 0));
        Thread.sleep(1000);
        myScriptClick(editButton);

    }

    public void ClickDeleteIcon() throws InterruptedException {
        myClick(searchButton);
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//button[@class='mdc-button mat-mdc-button mat-accent mat-flat-button mat-mdc-button-base']/*"), 0));
        Thread.sleep(1000);
        myClick(deleteIcon);
        myClick(deleteButton);

    }


    ///////////////////Tuba/////////////////////////////////////////////// 65.Satir


































    //////////////////////////////Emre//////////////////////////////////////// 100







































    //////////////////////////////Malik//////////////////////////////////////140







































    //////////////////////////////Onur//////////////////////////////////////180







































    //////////////////////////////Murat//////////////////////////////////////220




















































    public WebElement getWebElement(String stringElement){
        switch (stringElement){

            case "loginVerify": return this.loginVerify;
            case "AddButton": return this.AddButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "activeButtonOff": return this.activeButtonOff;
            case "saveButton": return this.saveButton;
            case "successMessage": return this.successMessage;
            case "alreadyExist": return this.alreadyExist;
            case "fieldNameInput": return this.fieldNameInput;
            case "editButton": return this.editButton;




        }
        return null;
    }


}
