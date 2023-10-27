package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Position_LeftNav extends Methods {

    public Position_LeftNav() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text()='Human Resources']")
    public WebElement humanResources;

    @FindBy(xpath = "(//span[text()='Setup'])[3]")
    public WebElement setup;

    @FindBy(xpath = "//span[text()='Position Categories']")
    public WebElement positionCategories;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "human resources":
                return this.humanResources;
            case "setup":
                return this.setup;
            case "position categories":
                return this.positionCategories;
        }
        return null;
    }
}
