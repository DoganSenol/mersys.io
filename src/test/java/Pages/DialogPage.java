package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

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
    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button[@class='mdc-switch mdc-switch--selected mdc-switch--checked']")
    public WebElement activeButtonOn;

    @FindBy(xpath = "//mat-slide-toggle[@formcontrolname='active']//button[@class='mdc-switch mdc-switch--unselected']")
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
    @FindBy(xpath="//ms-text-field[@formcontrolname='shortName']//input")
    public WebElement shortNameInput;
    @FindBy(xpath="//ms-integer-field[@formcontrolname='capacity']/input")
    public WebElement capacityInput;
    @FindBy(xpath="(//mat-select[@role='combobox'])[2]")
    public WebElement selectButton;
    @FindBy(xpath="//span[text()=' Laboratory ']")
    public WebElement laboratoryText;
    @FindBy(xpath="//mat-option/span")
    public List< WebElement> locationType;



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


























    //////////////////////////////Malik//////////////////////////////////////140
    @FindBy (css = "ms-dialog-content mat-select")
    public WebElement fieldType;
    @FindBy (css = "//ms-text-field[@placeholder='GENERAL.FIELD.NAME']//input")
    public WebElement searchName;
    @FindBy (css = "[aria-label='Close dialog']")
    public WebElement closeDialog;
    @FindBy (css = "[aria-label='Close']")
    public WebElement closeDialogMini;







































    //////////////////////////////Onur//////////////////////////////////////180







































    //////////////////////////////Murat//////////////////////////////////////220




















































    public WebElement getWebElement(String stringElement){
        switch (stringElement){

            case "loginVerify": return this.loginVerify;
            case "AddButton": return this.AddButton;
            case "nameInput": return this.nameInput;
            case "codeInput": return this.codeInput;
            case "activeButtonOff": return this.activeButtonOff;
            case "activeButtonOn": return this.activeButtonOn;
            case "saveButton": return this.saveButton;
            case "successMessage": return this.successMessage;
            case "alreadyExist": return this.alreadyExist;
            case "fieldNameInput": return this.fieldNameInput;
            case "editButton": return this.editButton;
            case "shortNameInput": return this.shortNameInput;
            case "capacityInput": return this.capacityInput;
            case "selectButton": return this.selectButton;
            case "laboratoryText": return this.laboratoryText;
            case "locationType": return (WebElement) this.locationType;
            case "searchButton": return this.searchButton;
            case "searchName": return this.searchName;
            case "deleteIcon": return this.deleteIcon;
            case "deleteButton": return this.deleteButton;
            case "closeDialog": return this.closeDialog;
            case "closeDialogMini": return this.closeDialogMini;





        }
        return null;
    }


}
