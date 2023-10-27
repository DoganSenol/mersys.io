package StepDefinitions;

import Pages.DialogPage;
import Pages.EducationPage;
import Pages.LoginPage;
import Pages._01_Position_LeftNav;
import Utilities.BaseDriver;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class _01_Position {


    _01_Position_LeftNav ln = new _01_Position_LeftNav();
    LoginPage lp = new LoginPage();
    DialogPage dp = new DialogPage();


    public WebDriverWait wait = new WebDriverWait(BaseDriver.getDriver(), Duration.ofSeconds(20));

    String positionNameStr = "Jon123";
    String newpositionNameStr = "Bravo";

    @When("the user navigates to position categories")
    public void theUserNavigatesToPositionCategories(DataTable links) {
        BaseDriver.getDriver().get("https://test.mersys.io/");
        lp.mySendKeys(lp.userNameInput, "turkeyts");
        lp.mySendKeys(lp.passwordInput, "TechnoStudy123");
        lp.myClick(lp.loginButton);
        List<String> strLinkList = links.asList(String.class);
        for (int i = 0; i < strLinkList.size(); i++) {
            WebElement linkWebElement = ln.getWebElement(strLinkList.get(i));
            ln.myClick(linkWebElement);
        }
    }

    @And("the user clicks on the add button")
    public void theUserClicksOnTheAddButton() {
        dp.myClick(dp.addButton);
        dp.mySendKeys(dp.newPositionName, positionNameStr);
    }

    @And("the user clicks on the save button")
    public void theUserClicksOnTheSaveButton() {
        dp.myClick(dp.saveButton);
    }

    @Then("the position categories should be added successfully")
    public void thePositionCategoriesShouldBeAddedSuccessfully() {
        dp.verifyContainsText(dp.successMessage, "success");
    }

    @And("the user clicks on the edit button")
    public void theUserClicksOnTheEditButton() {
        dp.mySendKeys(dp.nameSearch, positionNameStr);
        dp.myClick(dp.nameSearch);
        wait.until(ExpectedConditions.elementToBeClickable(dp.searchButton));
        dp.myClick(dp.edit);
        dp.mySendKeys(dp.newPositionName, newpositionNameStr);
        dp.myClick(dp.saveeButton);
    }

    @Then("position categories should be edited successfully")
    public void positionCategoriesShouldBeEditedSuccessfully() {
        dp.verifyContainsText(dp.successMessage, "updated");
    }

    @And("the user clicks on the delete button")
    public void theUserClicksOnTheDeleteButton() {
        dp.mySendKeys(dp.nameSearch, newpositionNameStr);
        dp.myClick(dp.nameSearch);
        wait.until(ExpectedConditions.elementToBeClickable(dp.nameSearch));
        dp.myClick(dp.deleteImageBtn);
        dp.myClick(dp.deleteDialogBtn);
    }

    @Then("position categories should be deleted successfully")
    public void positionCategoriesShouldBeDeletedSuccessfully() {
        dp.verifyContainsText(dp.successsMessage, "success");
    }
}