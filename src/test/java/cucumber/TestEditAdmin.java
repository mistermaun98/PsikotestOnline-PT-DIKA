package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.EditAdminPage;

public class TestEditAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static EditAdminPage edit = new EditAdminPage();

    public TestEditAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }


    @When("Admin search data admin {string} dengan Search bar")
    public void admin_search_data_admin_something_dengan_search_bar(String keywd) {
        edit.chooseSearchbar();
        Hooks.delay(1);
        edit.selectAllTextSearchBar();
        Hooks.delay(1);
        edit.searchKeyword(keywd);
        Hooks.delay(1);
        edit.clickSearchBtn();
    }


    @And("Admin klik tombol action edit")
    public void admin_klik_tombol_action_edit() {
        Hooks.delay(3);
        edit.clickEditBtn();
    }
    @And("Admin edit field Full Name dengan data kosong")
    public void admin_edit_field_full_name_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearFullName();
    }
    @And("Admin edit field Privileges dengan data kosong")
    public void admin_edit_field_privileges_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetPrivilege();
    }
    @And("Admin edit field Supervisor dengan data kosong")
    public void admin_edit_field_supervisor_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetSupervisor();
    }
    @And("Admin edit field Telephone dengan data kosong")
    public void admin_edit_field_telephone_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetTelephone();
    }
    @And("Admin klik tombol Update")
    public void admin_klik_tombol_update() {
        Hooks.delay(1);
        edit.clickUpdateBtn();
    }
    @And("Admin konfirmasi update data")
    public void admin_konfirmasi_update_data() {
        Hooks.delay(1);
        edit.confirmUpdate();
    }


    @Then("Muncul tampilan warning Data Full Name Tidak Lengkap")
    public void muncul_tampilan_warning_full_name_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmFullName(),"test24");
    }
    @Then("Muncul tampilan warning Data Privileges Tidak Lengkap")
    public void muncul_tampilan_warning_data_privileges_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmPrivilege(),"Admin");
    }
    @Then("Muncul tampilan warning Data Supervisor Tidak Lengkap")
    public void muncul_tampilan_warning_data_supervisor_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmSupervisor(),"SUPER");
    }
    @Then("Muncul tampilan warning Data Telephone Tidak Lengkap")
    public void muncul_tampilan_warning_data_telephone_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmTelephone(),"2468101214");
    }
}
