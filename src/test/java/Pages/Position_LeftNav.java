package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;

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

    @FindBy(xpath = "(//*[text()='Positions'])[1]")
    public WebElement positions;

    @FindBy(xpath = "(//*[text()='Search'])[1]")
    public WebElement searchButton;

    @FindBy(xpath = "(//*[@class='mdc-switch__ripple'])[1]")
    public WebElement option;

    public WebElement getWebElement(String strElement) {
        switch (strElement) {
            case "human resources":
                return this.humanResources;
            case "setup":
                return this.setup;
            case "position categories":
                return this.positionCategories;
            case "positions":
                return this.positions;
            case "search":
                return this.searchButton;
            case "aktiv":
                return this.option;

        }
        return null;
    }
}
