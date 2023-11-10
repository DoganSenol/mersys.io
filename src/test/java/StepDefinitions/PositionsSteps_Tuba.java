package StepDefinitions;

import Pages.DialogPage;
import Pages.LeftBar;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PositionsSteps_Tuba {
    LeftBar lb = new LeftBar();
    DialogPage dp=new DialogPage();

    @When("the user navigates to Positions")
    public void theUserNavigatesToPositions(DataTable DT) {
        List<String> links = DT.asList(String.class);
        for (String link : links) {
            WebElement e = lb.getWebElement(link);
            lb.myClick(e);
        }
    }

    @Then("there should be a search button on the page")
    public void thereShouldBeASearchButtonOnThePage(){
        Assert.assertEquals(dp.searchName.getAttribute("data-placeholder"), "Name");
        Assert.assertEquals(dp.searchShortName.getAttribute("data-placeholder"), "Short Name");
        Assert.assertEquals(dp.searchButton.getText(), "Search");
    }

    @Then("there should be an option to enable and disable positions with options active and deactivate")
    public void thereShouldBeAnOptionToEnableAndDisablePositionsWithOptionsAnd() {
        Assert.assertTrue(dp.activeButton.isEnabled(), "activeButton is not find");
    }
}
