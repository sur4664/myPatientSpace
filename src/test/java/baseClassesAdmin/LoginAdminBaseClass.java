/*
package baseClassesAdmin;

import driver.CucumberTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesAdmin.HomePageAdmin;

import pagesAdmin.AdminPage;



public class LoginAdminBaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, String strURL, String pageTitle){
        try{
            Assert.assertTrue(appDep.navigateURLAdminPage(oBrowser, propData.get(strURL), pageTitle));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyURLLoadedSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyUserNameWasSetSuccessful(WebDriver oBrowser, String userName){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_UserName_Edit, userName));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyUserNameWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyPasswordWasSetSuccessful(WebDriver oBrowser, String password){
        try{
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_Password_Edit, password));
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }


    public boolean verifyLoginWasSuccessful(WebDriver oBrowser){
        try{
            appInd.verifyText(oBrowser, HomePageAdmin.obj_HomePageAdmin_Title, "Image", "NFA");
            return true;
        }catch(Exception e){
            report.writeReport(oBrowser, "Exception", "Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }catch(AssertionError e){
            report.writeReport(oBrowser, "Exception", "Assertion Exception in 'verifyPasswordWasSetSuccessful()' method. " + e);
            return false;
        }
    }
}


 */

package baseClassesAdmin;

import driver.CucumberTestRunner;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesAdmin.AdminPage;
import pagesAdmin.HomePageAdmin;

import java.util.List;
import java.util.Map;

public class LoginAdminBaseClass extends CucumberTestRunner {
    public boolean verifyURLLoadedSuccessful(WebDriver oBrowser, DataTable dataTable){
        List<Map<String, String>> input = null;
        try{
            input = dataTable.asMaps(String.class, String.class);
            Assert.assertTrue(appDep.navigateURLAdminPage(oBrowser, input.get(0).get("appURL"), input.get(0).get("appPageTitle")));
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
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_UserName_Edit, input.get(0).get("userName")));
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
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_Password_Edit, input.get(0).get("password")));
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
            boolean blnRes = appInd.verifyText(oBrowser, HomePageAdmin.obj_HomePageAdmin_Title, "image", input.get(0).get("NFA"));
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
