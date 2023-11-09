package StepDefinitions;

import Pages.Position_LeftNav;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.awt.*;
import java.util.List;

public class PositionsSteps {
    Position_LeftNav p=new Position_LeftNav();
    WebElement driver;

    @When("the user navigates to Positions")
    public void theUserNavigatesToPositions(DataTable DT) {
        List<String> links=DT.asList(String.class);
        for (int i = 0; i < links.size(); i++) {
            WebElement e=p.getWebElement(links.get(i));
            p.myClick(e);
        }
    }

    @Then("there should be a search button on the page")
    public void thereShouldBeASearchButtonOnThePage() {
        WebElement searchButton = driver.findElement(By.id("search-button"));

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }


    @Then("there should be an option to enable and disable positions with options {String} and {String}")
    public void thereShouldBeAnOptionToEnableAndDisablePositionsWithOptionsAnd(Button activ, Button deactiv){
        for (int i = 0; i < 10; i++) {
            System.out.println("Button " + i);
        }

    }
}