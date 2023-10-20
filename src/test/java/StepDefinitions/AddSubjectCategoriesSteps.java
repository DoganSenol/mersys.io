package StepDefinitions;

import Pages.DialogPage;
import Pages.EducationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddSubjectCategoriesSteps {

    DialogPage dp=new DialogPage();
    EducationPage ep=new EducationPage();

    @When("User Click to Education")
    public void userClickToEducation() {
        ep.myClick(ep.educationLink);
    }

    @Then("User CLick to Setup")
    public void userCLickToSetup() {
        ep.myClick(ep.setupLink);
    }

    @And("User Click to Subject Categories")
    public void userClickToSubjectCategories() {
        ep.myClick(ep.subjectCategoriesLink);
    }

    @And("User Create  New Subject Categories name as {string} and code as {string}")
    public void userCreateNewSubjectCategoriesNameAsAndCodeAs(String name, String code){
        dp.myClick(dp.AddButton);
        dp.mySendKeys(dp.nameInput, name);
        dp.mySendKeys(dp.codeInput, code);
        dp.myClick(dp.saveButton);
    }

    @And("Success Message should be displayed")
    public void successMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.successMessage, "success");
    }

    @Then("Already exist message should be displayed")
    public void alreadyExistMessageShouldBeDisplayed() {
        dp.verifyContainsText(dp.alreadyExist, "already");
    }
}
