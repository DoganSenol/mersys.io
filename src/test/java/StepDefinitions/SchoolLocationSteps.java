package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import Pages.Methods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SchoolLocationSteps {



    String name ="Class188" ;
    String shortName ="CS188" ;
    String capacity ="1" ;
    String newName = "Edit";
    LeftBar lb=new LeftBar();
    DialogPage dp=new DialogPage();

    @When("Click on the element in SchoolPage")
    public void clickOnTheElementInSchoolPage(DataTable links) {
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = lb.getWebElement(strLinkList.get(i));
            lb.myClick(linkWebElement);
        }
    }

    @Then("Click on the Element in DialogPage")
    public void clickOnTheElementInDialogPage(DataTable buttons) {
        List<String> strLinkList = buttons.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = dp.getWebElement(strLinkList.get(i));
            dp.myClick(linkWebElement);
        }
    }


    @And("User Add the New School Locations")
    public void UserAddTheNewSchoolLocations() {
        dp.mySendKeys(dp.nameInput, name);
        dp.mySendKeys(dp.shortNameInput, shortName);
        dp.mySendKeys(dp.capacityInput, capacity);
    }

    @Then("User Click randomly LocationType")
    public void userClickRandomlyLocationType(DataTable dataTable) {

        dp.myClick(dp.selectButton);

        int randomPick= Methods.randomChoise(3);
        WebElement LocationType= dp.locationType.get(randomPick);
        dp.myClick(LocationType);
    }
}
