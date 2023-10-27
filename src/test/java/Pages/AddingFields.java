package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddingFields extends Methods{
    public AddingFields() {
        PageFactory.initElements(BaseDriver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setup;
    @FindBy(xpath = "//*[text()='Parameters']")
    public WebElement parameters;
    @FindBy(xpath = "//span[text()='Fields']")
    public WebElement fields;


    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "setup" : return this.setup;
            case "parameters" : return this.parameters;
            case "fields" : return  this.fields;
            default:
                return null;
        }
    }
}
