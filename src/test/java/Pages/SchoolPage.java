package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchoolPage extends Methods {

    public SchoolPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "(//span[text()='Setup'])[1]")
    public WebElement setupLink;
    @FindBy(xpath = " //span[text()='School Setup']")
    public WebElement schoolSetup;
    @FindBy(xpath = "//span[@class='nav-link-title ng-star-inserted'][normalize-space()='Locations']")
    public WebElement Locations;




    public WebElement getWebElement(String stringElement) {
        switch (stringElement) {
            case "setupLink": return this.setupLink;
            case "schoolSetup": return this.schoolSetup;
            case "Locations": return this.Locations;
        }

        return null;
    }
}