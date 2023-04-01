package cucumber;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import projectmagang.pages.FormAddAdminPage;
import projectmagang.pages.FormPrivilegePOPage;
import projectmagang.pages.MenuAdminPage;

public class TestAddAdmin {
    public static WebDriver driver;
    public static ExtentTest extentTest;
    public static FormAddAdminPage addAdmin = new FormAddAdminPage();
    public static FormPrivilegePOPage fpp = new FormPrivilegePOPage();
    public static MenuAdminPage menuadmin = new MenuAdminPage();

    public TestAddAdmin(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @Before(value = "@TCC24")
    public void backToAddAdminForm() {
        Hooks.delay(1);
        addAdmin.closeFormAddAdmin();
    }


    @Given("Admin berada di form Add Admin")
    public void admin_berada_di_form_add_admin() {
        Hooks.delay(1);
        addAdmin.addDataAdmin();
        extentTest.log(LogStatus.PASS,"Admin berada di form Add Admin");
    }
    //@Given("Admin ingin input data Admin")



    @When("Admin input field Full Name")
    public void admin_input_field_fullname() {
        Hooks.delay(1);
        addAdmin.inputFullName("USS Enterprise");
    }
    @When("Admin input field Privileges")
    public void admin_input_field_privilege() {
        Hooks.delay(1);
        addAdmin.choosePrivilege("Admin");
    }


    @And("Admin kosongkan field Privileges")
    public void admin_kosongkan_field_privileges() {
        Hooks.delay(1);
        addAdmin.resetPrivilege();
    }
    @And("Admin input field Supervisor")
    public void admin_input_field_supervisor() {
        Hooks.delay(1);
        addAdmin.chooseSupervisor("SUPER");
    }
    @And("Admin kosongkan field Supervisor")
    public void admin_kosongkan_field_supervisor() {
        Hooks.delay(1);
        addAdmin.resetSupervisor();
    }
    @And("Admin input field Telephone")
    public void admin_input_field_telephone() {
        Hooks.delay(1);
        addAdmin.inputTelephone("08553426070");
    }
    @And("Admin kosongkan field Telephone")
    public void admin_kosongkan_field_telephone() {
        Hooks.delay(1);
        addAdmin.clearTelephone();
    }
    @And("Admin input field Username")
    public void admin_input_field_username() {
        Hooks.delay(1);
        addAdmin.clearUsername();
        Hooks.delay(1);
        addAdmin.inputUsername("thebigE001");
    }
    @And("Admin kosongkan field Username")
    public void admin_kosongkan_field_username() {
        Hooks.delay(1);
        addAdmin.clearUsername();
    }
    @And("Admin input field Password")
    public void admin_input_field_password() {
        Hooks.delay(1);
        addAdmin.clearPassword();
        Hooks.delay(1);
        addAdmin.inputPassword("enty001uss");
    }
    @And("Admin kosongkan field Password")
    public void admin_kosongkan_field_password() {
        Hooks.delay(1);
        addAdmin.clearPassword();
    }
    @And("Admin klik tombol Save")
    public void admin_klik_tombol_save() {
        Hooks.delay(1);
        addAdmin.saveDataAdmin();
    }



    @Then("Muncul tampilan warning Mohon Lengkapi Data")
    public void muncul_tampilan_mohon_lengkapi_data() {
        Hooks.delay(1);
        Assert.assertEquals(addAdmin.getLengkapiDataError(),"Mohon Lengkapi Data");
        Hooks.delay(1);
        addAdmin.closeLengkapiDataWarning();
    }
    @Then("Data berhasil disimpan")
    public void data_berhasil_disimpan() {
        System.out.println("Data Berhasil disimpan");
        Hooks.quitBrowser();
    }



    // TCC.PO.024 - TCC.PO.028
    @When("Admin input field Full Name {string}")
    public void admin_input_field_full_name_something(String fullname) {
//        Hooks.delay(1);
//        addAdmin.addDataAdmin();
        Hooks.delay(2);
        addAdmin.inputFullName(fullname);
    }

    @And("Admin input field Privileges {string}")
    public void admin_input_field_privileges_something(String privileges) {
        Hooks.delay(1);
        addAdmin.choosePrivilege(privileges);
    }
    @And("Admin input field Supervisor {string}")
    public void admin_input_field_supervisor_something(String supervisor) {
        Hooks.delay(1);
        addAdmin.chooseSupervisor(supervisor);
    }
    @And("Admin input field Telephone {string}")
    public void admin_input_field_telephone_something(String telp) {
        Hooks.delay(1);
        addAdmin.inputTelephone(telp);
    }
    @And("Admin input field Username {string}")
    public void admin_input_field_username_something(String uname) {
        Hooks.delay(1);
        addAdmin.clearUsername();
        Hooks.delay(1);
        addAdmin.inputUsername(uname);
    }
    @And("Admin input field Password {string}")
    public void admin_input_field_password_something(String passwd) {
        Hooks.delay(1);
        addAdmin.clearPassword();
        Hooks.delay(1);
        addAdmin.inputPassword(passwd);
    }
    @And("Admin konfirmasi simpan data")
    public void admin_konfirmasi_simpan_data() {
        Hooks.delay(1);
        addAdmin.confirmSaveDataAdmin();
    }

    @Then("Muncul notifikasi Pemberitahuan Password error")
    public void muncul_notifikasi_pemberitahuan_password_error() {
        Hooks.delay(1);
        Assert.assertTrue(addAdmin.verifyPasswordWarningPresent());
    }
}
