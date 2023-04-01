package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.Before;
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

    @Before(value = "@TCC41_TestPrep")
    public void logoutFromAdminPage() {
        Hooks.delay(1);
        edit.clickLogoutBtn();
        Hooks.delay(1);
        edit.confirmLogout();
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
        extentTest.log(LogStatus.PASS,"Admin sedang di menu Admin");
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
        extentTest.log(LogStatus.PASS,"Admin search Data "+keywd);
    }


    @And("Admin klik tombol action edit")
    public void admin_klik_tombol_action_edit() {
        Hooks.delay(3);
        edit.clickEditBtn();
        extentTest.log(LogStatus.PASS,"Admin klik tombol action edit");
    }
    @And("Admin edit field Full Name dengan data kosong")
    public void admin_edit_field_full_name_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearFullName();
        extentTest.log(LogStatus.PASS,"Edit field Full Name dengan data kosong");
    }
    @And("Admin edit field Privileges dengan data kosong")
    public void admin_edit_field_privileges_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetPrivilege();
        extentTest.log(LogStatus.PASS,"Edit field Privileges dengan data kosong");
    }
    @And("Admin edit field Supervisor dengan data kosong")
    public void admin_edit_field_supervisor_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearSupervisor();
        extentTest.log(LogStatus.PASS,"Edit field Supervisor dengan data kosong");
    }
    @And("Admin edit field Telephone dengan data kosong")
    public void admin_edit_field_telephone_dengan_data_kosong() {
        Hooks.delay(1);
        edit.resetTelephone();
        extentTest.log(LogStatus.PASS,"Edit field Telephone dengan data kosong");
    }
    @And("Admin edit field User Active dengan data kosong")
    public void admin_edit_field_user_active_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearUserActive();
        extentTest.log(LogStatus.PASS,"Edit field User Active dengan data kosong");
    }
    @And("Admin klik tombol Update")
    public void admin_klik_tombol_update() {
        Hooks.delay(1);
        edit.clickUpdateBtn();
        extentTest.log(LogStatus.PASS,"Admin klik tombol Update");
    }
    @And("Admin konfirmasi update data")
    public void admin_konfirmasi_update_data() {
        Hooks.delay(1);
        edit.confirmUpdate();
        extentTest.log(LogStatus.PASS,"Admin konfirmasi update data");
    }
    @And("Admin edit field Username dengan data kosong")
    public void admin_edit_username_dengan_data_kosong() {
        Hooks.delay(1);
        edit.clearUsername();
        extentTest.log(LogStatus.PASS,"Edit field Username dengan data kosong");
    }
    @And("Admin edit field Full Name dengan data valid")
    public void admin_edit_field_fullname_dengan_data_valid() {
        Hooks.delay(1);
        edit.clearFullName();
        Hooks.delay(1);
        edit.inputFullName("IJN Atago");
        extentTest.log(LogStatus.PASS,"Edit Full Name dengan data valid");
    }
    @And("Admin edit field Privilege dengan data valid")
    public void admin_edit_privilege_dengan_data_valid() {
        Hooks.delay(1);
        edit.inputPrivilege("Admin");
        extentTest.log(LogStatus.PASS,"Edit Privilege dengan data valid");
    }
    @And("Admin edit field Supervisor dengan data valid")
    public void admin_edit_supervisor_dengan_data_valid() {
        Hooks.delay(1);
        edit.inputSupervisor("ARIE");
        extentTest.log(LogStatus.PASS,"Edit Supervisor dengan data valid");
    }
    @And("Admin edit field Telephone dengan data valid")
    public void admin_edit_field_telephone_dengan_data_valid() {
        Hooks.delay(1);
        edit.resetTelephone();
        Hooks.delay(1);
        edit.inputTelephone("085861237070");
        extentTest.log(LogStatus.PASS,"Edit Telephone dengan data valid");
    }
    @And("Admin edit field User Active dengan value {string}")
    public void admin_edit_field_user_active_dengan_value_something(String userActive) {
        Hooks.delay(1);
        edit.inputUserActive(userActive);
        extentTest.log(LogStatus.PASS,"Admin edit field User Active dengan value "+userActive);
    }
    @And("Admin edit field Username dengan value {string}")
    public void admin_edit_field_username_dengan_value_something(String usrname) {
        Hooks.delay(1);
        edit.clearUsername();
        Hooks.delay(1);
        edit.inputUsername(usrname);
        extentTest.log(LogStatus.PASS,"Admin edit username dengan value "+usrname);
    }


    @Then("Muncul tampilan warning Data Full Name Tidak Lengkap")
    public void muncul_tampilan_warning_full_name_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmFullName(),"test24");
        extentTest.log(LogStatus.PASS,"Muncul tampilan warning data Full Name tidak lengkap");
    }
    @Then("Muncul tampilan warning Data Privileges Tidak Lengkap")
    public void muncul_tampilan_warning_data_privileges_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmPrivilege(),"Admin");
        extentTest.log(LogStatus.PASS,"Muncul tampilan warning data Privileges tidak lengkap");
    }
    @Then("Muncul tampilan warning Data Supervisor Tidak Lengkap")
    public void muncul_tampilan_warning_data_supervisor_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmSupervisor(),"ARIE");
        extentTest.log(LogStatus.PASS,"Muncul tampilan warning data Supervisor tidak lengkap");
    }
    @Then("Muncul tampilan warning Data Telephone Tidak Lengkap")
    public void muncul_tampilan_warning_data_telephone_tidak_lengkap() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmTelephone(),"56712345");
        extentTest.log(LogStatus.PASS,"Muncul tampilan warning data Telephone tidak lengkap");
    }
    @Then("Full Name berhasil diedit")
    public void full_name_berhasil_diedit() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmFullName(),"IJN Atago");
        extentTest.log(LogStatus.PASS,"Full Name berhasil diedit");
    }
    @Then("Privilege berhasil diedit")
    public void privilege_berhasil_diedit() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmprivilege(),"Admin");
        extentTest.log(LogStatus.PASS,"Privilege berhasil diedit");
    }
    @Then("Supervisor berhasil diedit")
    public void supervisor_berhasil_diedit() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmSupervisor(),"ARIE");
        extentTest.log(LogStatus.PASS,"Supervisor berhasil diedit");
    }
    @Then("Telephone berhasil diedit")
    public void telephone_berhasil_diedit() {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmTelephone(),"085861237070");
        extentTest.log(LogStatus.PASS,"Telephone berhasil diedit");
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
        extentTest.log(LogStatus.PASS,"Akun tidak dapat login kedalam sistem");
    }
    @Then("Akun {string} dapat login kedalam sistem")
    public void akun_yang_diedit_dapat_login(String username) {
        Hooks.delay(1);
        edit.clickLogoutBtn();
        Hooks.delay(1);
        edit.confirmLogout();
        Hooks.delay(2);
        login.enterUsername(username);
        login.enterPassword("qwerTYUI");
        Hooks.delay(1);
        login.clickBtnSignin();
        Hooks.delay(1);
        Assert.assertEquals(login.getTxtWelcome(),"Welcome to web psikotest");
        extentTest.log(LogStatus.PASS,"Akun dapat login kedalam sistem");
        Hooks.delay(1);
        login.dissmissLoginMsg();
    }
    @Then("Username direset menjadi {string}")
    public void username_direset_menjadi_something(String expectedUname) {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmUserName(),expectedUname);
        extentTest.log(LogStatus.PASS,"Username direset menjadi "+expectedUname);
    }
    @Then("Akun dapat login kedalam sistem dengan Username {string}")
    public void akun_dapat_login_dengan_username_something(String usrname) {
        Hooks.delay(1);
        Assert.assertEquals(edit.confirmUserName(),usrname);
        Hooks.delay(1);
        edit.clickLogoutBtn();
        Hooks.delay(1);
        edit.confirmLogout();
        Hooks.delay(2);
        login.enterUsername(usrname);
        login.enterPassword("12345");
        Hooks.delay(1);
        login.clickBtnSignin();
        Hooks.delay(1);
        Assert.assertEquals(login.getTxtWelcome(),"Welcome to web psikotest");
        Hooks.delay(1);
        login.dissmissLoginMsg();
        extentTest.log(LogStatus.PASS,"Akun dapat login kedalam sistem");
    }
}
