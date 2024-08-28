/*
package baseClassesStaff;

import driver.CucumberTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesStaff.StaffPage;


import pagesStaff.HomePageStaff;


public class LoginStaffBaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, String strURL, String pageTitle) {
        try {
            Assert.assertTrue(appDep.navigateURLStaffPage(oBrowser, propData.get(strURL), pageTitle));
            return true;
        } catch (Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        } catch (AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameWasSetSuccessful(WebDriver oBrowser, String userName) {
        try {
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Username_Edit, userName));
            return true;
        } catch (Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        } catch (AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordWasSetSuccessful(WebDriver oBrowser, String password) {
        try {
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Password_Edit, password));
            return true;
        } catch (Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        } catch (AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginWasSuccessful(WebDriver oBrowser) {
        try {
          appInd.verifyText(oBrowser, HomePageStaff.obj1_HomePageStaff_Title, "Image", "DDN");
           return true;
        } catch (Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        } catch (AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }
}
*/

package baseClassesStaff;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesStaff.HomePageStaff;
import pagesStaff.StaffPage;

import java.util.List;
import java.util.Map;

public class LoginStaffBaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appDep.navigateURLStaffPage(oBrowser, input.get(0).get("appURL"), input.get(0).get("appPageTitle")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameSetSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Username_Edit, input.get(0).get("userName")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordSetSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Password_Edit, input.get(0).get("password")));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginTomypatientspaceWasSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            boolean blnRes = appInd.verifyText(oBrowser, HomePageStaff.obj1_HomePageStaff_Title, "image", input.get(0).get("DDN"));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyLoginTomypatientspaceWasSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyLoginTomypatientspaceWasSuccessful()' method. " + e);
            return false;
        }
    }
}
