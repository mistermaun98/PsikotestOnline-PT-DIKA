package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import projectmagang.drivers.DriverSingleton;

public class FormAddAdminPage {
    private WebDriver driver;
    public FormAddAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='tl_user_management--53685_text']")
    WebElement searchbar;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement searchBtn;
    @FindBy(xpath = "//span[normalize-space()='Admin']")
    WebElement btnMenuAdmin;


    @FindBy(xpath = "//span[normalize-space()='Add']")
    WebElement btnAddAdmin;


//    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-closethick']")
//    WebElement closeWarningLengkapiData;
    @FindBy(xpath = "//span[contains(@class,'ui-button-icon-primary ui-icon ui-icon-closethick')]")
    WebElement closeWarningLengkapiData;
    @FindBy(xpath = "//span[@class='ui-button-icon-primary ui-icon ui-icon-close']")
    WebElement closeAddAdminForm;

    //*[@id="tl_agent_editable-14-53699_text"]
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53699_text']")
    WebElement fieldFullName;
    @FindBy(xpath = "//select[@id='tl_agent_editable-14-53700_text']")
    WebElement listPrivileges;
    @FindBy(xpath = "//select[@id='tl_agent_editable-14-53702_text']")
    WebElement listSupervisor;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53705_text']")
    WebElement fieldTelephone;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53709_text']")
    WebElement fieldUsername;
    @FindBy(xpath = "//input[@id='tl_agent_editable-14-53710_text']")
    WebElement fieldPassword;


    @FindBy(xpath = "//button[@id='53711_query']")
    WebElement btnSaveData;
    @FindBy(xpath = "//span[normalize-space()='Yes']")
    WebElement btnConfirmSave;


    @FindBy(xpath = "//p[normalize-space()='Mohon Lengkapi Data']")
    WebElement lengkapiDataTXT;
    @FindBy(xpath = "//p[contains(text(),'Password harus berisi angka dan huruf manimal 8 ka')]")
    WebElement passwordWarningTXT;



    public void manualChooseSearchBar () {
        searchbar.click();
    }
    public void inputKeyword (String searchbar) {
        this.searchbar.sendKeys(searchbar);
    }
    public void searchKeyword() {
        searchBtn.click();
    }
    public void clickMenuAdmin() {btnMenuAdmin.click();}



    public void inputFullName (String fullname) {
        this.fieldFullName.sendKeys(fullname);
    }
    public void choosePrivilege(String priv) {
        Select drpPrivileges = new Select(listPrivileges);
        drpPrivileges.selectByValue(priv);
    }
    public void chooseSupervisor(String spv) {
        Select drpSupervisor = new Select(listSupervisor);
        drpSupervisor.selectByValue(spv);
    }
    public void inputTelephone (String telephone) {
        this.fieldTelephone.sendKeys(telephone);
    }
    public void inputUsername (String username) {
        this.fieldUsername.sendKeys(username);
    }
    public void inputPassword (String password) {
        this.fieldPassword.sendKeys(password);
    }



    public void addDataAdmin() {
        btnAddAdmin.click();
    }
    public void saveDataAdmin() {
        btnSaveData.click();
    }
    public void confirmSaveDataAdmin() {
        btnConfirmSave.click();
    }



    public void clearFullName() {
        fieldFullName.clear();
    }
    public void resetPrivilege() {
        listPrivileges.sendKeys(Keys.ARROW_UP,Keys.ENTER);
    }
    public void resetSupervisor() {
        Select purgeSPV = new Select(listSupervisor);
        purgeSPV.selectByVisibleText("");
    }
    public void clearTelephone() {
        fieldTelephone.clear();
    }
    public void clearUsername() {
        fieldUsername.clear();
    }
    public void clearPassword() {
        fieldPassword.clear();
    }



    public void closeLengkapiDataWarning() {
        closeWarningLengkapiData.click();
    }
    public void closeFormAddAdmin() {
        closeAddAdminForm.click();
    }
    public String getLengkapiDataError() {
        return lengkapiDataTXT.getText();
    }
    public String getPasswordWarning() {
        return passwordWarningTXT.getText();
    }
    public boolean verifyPasswordWarningPresent() {
        boolean isPresent = passwordWarningTXT.isDisplayed();
        return isPresent;
    }
}
