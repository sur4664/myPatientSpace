package common;

import driver.CucumberTestRunner;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pagesPatient.HomePagePatient;
import pagesPatient.PatientPage;
import pagesStaff.StaffPage;
import pagesAdmin.HomePageAdmin;
import pagesAdmin.AdminPage;
import pagesStaff.HomePageStaff;

public class AppDependentMethods extends CucumberTestRunner {
    /*************************************
     * method Name	: navigateURL()
     * purpose		: it will navigate the URL to AdminPage
     *
     *********************************/
    public boolean navigateURLAdminPage(WebDriver oBrowser, String strURL, String pageTitle) {
        try {
            oBrowser.navigate().to(strURL);
            appInd.waitForElement(oBrowser, AdminPage.obj_Login_Button, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "The URL '"+strURL+"' is navigated successful");
            return appInd.compareExactValue(oBrowser, oBrowser.getTitle(), pageTitle);
        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'navigateURL() method'. " + e);
            return false;
        }
    }


    /*************************************
     * method Name	: navigateURL()
     * purpose		: it will navigate the URL to StaffPage
     *
     *********************************/
    public boolean navigateURLStaffPage(WebDriver oBrowser, String strURL, String pageTitle) {
        try {
            oBrowser.navigate().to(strURL);
            appInd.waitForElement(oBrowser, StaffPage.obj1_Login_Button, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "The URL '"+strURL+"' is navigated successful");
            return appInd.compareExactValue(oBrowser, oBrowser.getTitle(), pageTitle);
        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'navigateURL() method'. " + e);
            return false;
        }
    }


    /*************************************
     * method Name	: navigateURL()
     * purpose		: it will navigate the URL to PatientPage
     *
     *********************************/
    public boolean navigateURLPatientPage(WebDriver oBrowser, String strURL, String pageTitle) {
        try {
            oBrowser.navigate().to(strURL);
            appInd.waitForElement(oBrowser, PatientPage.obj2_LoginButton, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "The URL '"+strURL+"' is navigated successful");
            return appInd.compareExactValue(oBrowser, oBrowser.getTitle(), pageTitle);
        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'navigateURL() method'. " + e);
            return false;
        }
    }


    /*************************************
     * method Name	: loginTo mypatientspaceAdminPage()
     * purpose		: it will login to mypatientspace application adminpage
     *
     *********************************/
    public boolean loginTomypatientspaceAdminPage(WebDriver oBrowser, String userName, String password) {
        try {
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_UserName_Edit, userName));
            Assert.assertTrue(appInd.setObject(oBrowser, AdminPage.obj_Password_Edit, password));
            Assert.assertTrue(appInd.clickObject(oBrowser, AdminPage.obj_Login_Button));
            appInd.waitForElement(oBrowser, HomePageAdmin.obj_InviteStaff_Button, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "Login to mypatientspace successful");
            boolean blnRes = appInd.verifyText(oBrowser, HomePageAdmin.obj_HomePageAdmin_Title, "Image", "NFA");
            return true;

        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'loginTomypatientspace() method'. " + e);
            return false;
        }catch(AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assert Error in 'loginTomypatientspace() method'. " + e);
            return false;
        }
    }

    /*************************************
     * method Name	: loginTo mypatientspaceStaffPage()
     * purpose		: it will login to mypatientspace application Staffpage
     *
     *********************************/
    public boolean loginTomypatientspaceStaffPage(WebDriver oBrowser, String userName, String password) {
        try {
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Username_Edit, userName));
            Assert.assertTrue(appInd.setObject(oBrowser, StaffPage.obj1_Password_Edit, password));
            Assert.assertTrue(appInd.clickObject(oBrowser, StaffPage.obj1_Login_Button));
            appInd.waitForElement(oBrowser, HomePageStaff.obj2_Patients_Menu, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "Login to mypatientspace successful");
            boolean blnRes = appInd.verifyText(oBrowser, HomePageStaff.obj1_HomePageStaff_Title, "Image", "DDN");
            return true;

        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'loginTomypatientspace() method'. " + e);
            return false;
        }catch(AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assert Error in 'loginTomypatientspace() method'. " + e);
            return false;
        }
    }


    /*************************************
     * method Name	: loginTo mypatientspacePatientPage()
     * purpose		: it will login to mypatientspace application Staffpage
     *
     *********************************/
    public boolean loginTomypatientspacePatientPage(WebDriver oBrowser, String userName, String password) {
        try {
            Assert.assertTrue(appInd.setObject(oBrowser, PatientPage.obj2_Username_Edit, userName));
            Assert.assertTrue(appInd.setObject(oBrowser, PatientPage.obj2_Password_Edit, password));
            Assert.assertTrue(appInd.clickObject(oBrowser, PatientPage.obj2_LoginButton));
            appInd.waitForElement(oBrowser, HomePagePatient.obj2_Update_Menu, "Clickable", "", 10);
            report.writeReport(oBrowser, "Screenshot", "Login to mypatientspace successful");
            boolean blnRes = appInd.verifyText(oBrowser, HomePagePatient.obj2_HomePagePatient_Title, "Image", "NP");
            return true;

        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'loginTomypatientspace() method'. " + e);
            return false;
        }catch(AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assert Error in 'loginTomypatientspace() method'. " + e);
            return false;
        }
    }


    /**********************************************
     * Method Name		: logoutFrommypatientspace()
     * Purpose			: it is used to logout from the mypatientspace
     * Author			:
     * Date created		:
     * Modified By		:
     * Date modified	:
     **********************************************/
   /* public boolean logoutFromActiTime(WebDriver oBrowser) {
        try {
            report.writeReport(oBrowser, "Screenshot", "Before logout from mypatientspace");
            Assert.assertTrue(appInd.clickObject(oBrowser, HomePage.obj_Logout_Link));
            appInd.waitForElement(oBrowser, LoginPage.obj_LoginPage_Header, "Text", "Please identify yourself", 10);
            report.writeReport(oBrowser, "Screenshot", "After logout from actiTime");
            return appInd.verifyText(oBrowser, LoginPage.obj_LoginPage_Header, "Text", "Please identify yourself");
        }catch(Exception e) {
            report.writeReport(oBrowser, "Exception", "Exception in 'logoutFromActiTime() method'. " + e);
            return false;
        }catch(AssertionError e) {
            report.writeReport(oBrowser, "Exception", "Assert Error in 'logoutFromActiTime() method'. " + e);
            return false;
        }
    }*/

}

