package Pages;

import Utilities.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationPage extends  Methods {
    public EducationPage() {
        PageFactory.initElements(BaseDriver.getDriver(), this);
    }


        @FindBy(xpath = "//span[text()='Education']")
        public WebElement educationLink;
        @FindBy(xpath = "(//span[text()='Setup'])[5]")
        public WebElement setupLink;
    @FindBy(xpath = " //span[@class='nav-link-title ng-star-inserted' and text()='Subject Categories']")
    public WebElement subjectCategoriesLink;






        public WebElement getWebElement(String stringElement){
            switch (stringElement){

                case "educationLink": return this.educationLink;
                case "setupLink": return this.setupLink;
                case "subjectCategoriesLink": return this.subjectCategoriesLink;


            }
            return null;
        }

}
