package driver;

import baseClassesAdmin.LoginAdminBaseClass;
import baseClassesPatient.LoginPatientBaseClass;
import baseClassesStaff.LoginStaffBaseClass;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import common.AppDependentMethods;
import common.AppIndependentMethods;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import reports.ReportUtility;
import java.util.Map;

@CucumberOptions(
        tags = "@Regression",
        glue = {"stepDefinitions"},
        features = {"src/test/resources/features"},
        dryRun = false,
        monochrome = true,
        plugin = {
                "pretty",
                "html:target/cucumber-report/cucumberReport.html",
                "json:target/cucumber-report/cucumberJson.json"
        }
)

public class CucumberTestRunner extends AbstractTestNGCucumberTests {
    public static AppIndependentMethods appInd = null;
    public static AppDependentMethods appDep = null;
    public static ReportUtility report = null;
    public static ExtentReports extent = null;
    public static ExtentTest test = null;
    public static Map<String, String> propData = null;
    public static LoginAdminBaseClass loginAdminBaseClass;
    public static LoginPatientBaseClass loginPatientBaseClass;
    public static WebDriver oBrowser;
    public static LoginStaffBaseClass loginStaffBaseClass;

    @BeforeSuite
    public void loadClasses(){
        try{
            appInd = new AppIndependentMethods();
            appDep = new AppDependentMethods();
            report = new ReportUtility();
            propData = appInd.getPropData(System.getProperty("user.dir") + "\\src\\main\\resources\\Config.properties");
            extent = report.startExtentReport("TestReport");
            loginAdminBaseClass = new LoginAdminBaseClass();
            loginStaffBaseClass = new LoginStaffBaseClass();
            loginPatientBaseClass = new LoginPatientBaseClass();
        }catch(Exception e){
            System.out.println("Exception in 'loadClasses()' method. " + e);
        }
    }

    @DataProvider
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
