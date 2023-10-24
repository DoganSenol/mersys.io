package StepDefinitions;

import Pages.DialogPage;
import Pages.Methods;
import Pages.SchoolPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US007AddSchoolLocationSteps {
    SchoolPage sP=new SchoolPage();
    DialogPage dP=new DialogPage();



    @When("Click on the element in SchoolPage")
    public void clickOnTheElementInSchoolPage(DataTable linkler) {
        List<String> strlinkList = linkler.asList(String.class);

        for (int i = 0; i < strlinkList.size(); i++) {
            WebElement linkWebElement = sP.getWebElement(strlinkList.get(i));
            sP.myClick(linkWebElement);

        }
    }

    @And("User Sending Keys in DialogPage")
    public void userSendingKeysInDialogPage(DataTable dt) {
        List<List<String>> items= dt.asLists(String.class);
        for (int i = 0; i < items.size(); i++) {
            WebElement e=dP.getWebElement(items.get(i).get(0));
            String text= items.get(i).get(1);
            dP.mySendKeys(e,text);

        }
    }

    @Then("Click on the Element in DialogPage")
    public void clickOnTheElementInDialogPage(DataTable buttons) {
        List<String> strButtonList= buttons.asList(String.class);
        for (int i = 0; i < strButtonList.size(); i++) {
            WebElement linkWebelemet= dP.getWebElement(strButtonList.get(i));
            dP.myClick(linkWebelemet);

        }
    }

    @Then("User Click randomly LocationType")
    public void userClickRandomlyLocationType(DataTable random) {

        dP.myClick(dP.selectButton);

        int randomPick= Methods.randomChoise(3);
        WebElement LocationType= dP.locationType.get(randomPick);
        dP.myClick(LocationType);


    }
}
