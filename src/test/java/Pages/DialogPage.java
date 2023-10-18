package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DialogPage extends Methods {
    public DialogPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }
    @FindBy(xpath = "((//div[@fxlayout='row'])[3]//span)[1]")
    public WebElement loginVerify;
}
