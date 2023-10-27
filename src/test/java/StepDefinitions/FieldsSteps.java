package StepDefinitions;

import Pages.AddingFields;
import Pages.DialogPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import org.openqa.selenium.WebElement;

import java.util.List;

public class FieldsSteps {
    AddingFields af=new AddingFields();
    DialogPage dp=new DialogPage();

    @io.cucumber.java.en.
            When("the user navigates to fields")
    public void theUserNavigatesToFields(DataTable links) {


        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = af.getWebElement(strLinkList.get(i));
            af.myClick(linkWebElement);
        }


    }

    @And("Click on the save button in Dialog")
    public void clickOnTheSaveButtonInDialog(DataTable elements) {
        List<String> strLinkList = elements.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dp.getWebElement(strLinkList.get(i));
            dp.myClick(linkWebElement);
        }

    }

    @And("Click on the Edit Button")
    public void clickOnTheEditButton() throws InterruptedException {
        DialogPage dc=new DialogPage();
        dc.ClickEditButton();
    }
}
