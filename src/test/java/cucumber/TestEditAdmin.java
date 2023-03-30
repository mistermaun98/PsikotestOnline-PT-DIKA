package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.EditAdminPage;
import projectmagang.pages.FormPrivilegePOPage;
import projectmagang.pages.LoginPage;

public class TestEditAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static EditAdminPage edit = new EditAdminPage();
    public static LoginPage login = new LoginPage();
    public static FormPrivilegePOPage fpp = new FormPrivilegePOPage();

    public TestEditAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Given("Admin sedang di menu Admin")
    public void admin_sedang_di_menu_admin() {
        login.clearLoginForm();
        Hooks.delay(1);
        login.enterUsername("super");
        login.enterPassword("1");
        Hooks.delay(1);
        login.clickBtnSignin();
        Hooks.delay(1);
        login.dissmissLoginMsg();

        Hooks.delay(1);
        fpp.clickMenuUserManagement();
        Hooks.delay(1);
        fpp.clickBtnAdmin();
        Hooks.delay(1);

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
        edit.clearSupervisor();
    }
    @And("Admin edit field Telephone dengan data kosong")
    public void admin_edit_field_telephone_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetTelephone();
    }
    @And("Admin edit field User Active dengan data kosong")
    public void admin_edit_field_user_active_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearUserActive();
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
    @And("Admin edit field Username dengan data kosong")
    public void admin_edit_username_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearUsername();
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
        Assert.assertEquals(edit.confirmSupervisor(),"ARIE");
    }
    @Then("Muncul tampilan warning Data Telephone Tidak Lengkap")
    public void muncul_tampilan_warning_data_telephone_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmTelephone(),"2468101214");
    }
    @Then("Akun {string} tidak dapat login kedalam sistem")
    public void akun_yang_diedit_tidak_dapat_login(String username) {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmUserActive(),"");
        Hooks.delay(1);
        edit.clickLogoutBtn();
        Hooks.delay(1);
        edit.confirmLogout();
        Hooks.delay(3);
        login.enterUsername(username);
        login.enterPassword("qwerTYUI");
        Hooks.delay(1);
        login.clickBtnSignin();
        Hooks.delay(2);
        Assert.assertTrue(login.getLoginErrorTxt().contains("akun anda tidak aktif"));
        Hooks.delay(1);
        login.dismissLoginWarningMsg();
    }
    @Then("Username direset menjadi {string}")
    public void username_direset_menjadi_something(String expectedUname) {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmUserName(),expectedUname);
    }
}
