/*
package stepDefinitionPatient;

import driver.CucumberTestRunner;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesPatient.HomePagePatient;
import pagesPatient.PatientPage;
import pagesAdmin.AdminPage;

public class LoginPatientStepDefinition extends CucumberTestRunner {
    @Then("Verify the URL {string} is loaded properly with proper title {string}")
    public void verifyTheURLIsLoadedProperly(String strURL, String pageTitle) {
        Assert.assertTrue(loginPatientBaseClass.verifyURLLoadedSuccessful(oBrowser, strURL, pageTitle));
    }

    @And("User enter the valid username {string}")
    public void userEnterTheValidUsername(String userName) {
        Assert.assertTrue(loginPatientBaseClass.verifyUserNameWasSetSuccessful(oBrowser, propData.get("username")));
    }

    @And("user enter the valid password {string}")
    public void userEnterTheValidPassword(String password) {
        Assert.assertTrue(loginPatientBaseClass.verifyPasswordWasSetSuccessful(oBrowser, propData.get("Password")));
    }

    @And("User click on Login button")
    public void userClickOnLoginButton() {
        Assert.assertTrue(appInd.clickObject(oBrowser, PatientPage.obj2_LoginButton));
    }

    @Then("Verify login to application is successful")
    public void verifyLoginToApplicationIsSuccessful() {
        Assert.assertTrue(loginPatientBaseClass.verifyLoginWasSuccessful(oBrowser));
    }


}

*/

package stepDefinitionPatient;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import pagesPatient.PatientPage;

public class LoginPatientStepDefinition extends CucumberTestRunner {
    @Given("Verify the URL is loaded properly with proper title")
    public void verifyTheURLIsLoadedProperlyWithProperTitle(DataTable dataTable) {
        Assert.assertTrue(loginPatientBaseClass.verifyURLLoadedSuccessful(oBrowser, dataTable));
    }

    @And("User enter the valid username")
    public void userEnterTheValidUsername(DataTable dataTable) {
        Assert.assertTrue(loginPatientBaseClass.verifyUserNameSetSuccessful(oBrowser, dataTable));
    }

    @And("user enter the valid password")
    public void userEnterTheValidPassword(DataTable dataTable) {
        Assert.assertTrue(loginPatientBaseClass.verifyPasswordSetSuccessful(oBrowser, dataTable));
    }

    @And("User clicks on Login button")
    public void userClicksOnLoginButton() {
        Assert.assertTrue(appInd.clickObject(oBrowser, PatientPage.obj2_LoginButton));
    }

    @Then("Verify login to actiTime application is successful")
    public void verifyLoginTomypatientspaceApplicationIsSuccessful(DataTable dataTable) {
        Assert.assertTrue(loginPatientBaseClass.verifyLoginTomypatientspaceWasSuccessful(oBrowser, dataTable));
    }
}
