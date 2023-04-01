package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import projectmagang.pages.FormAddAdminPage;

public class TestAddAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static FormAddAdminPage addAdmin = new FormAddAdminPage();

    public TestAddAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


}
