package projectmagang.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import projectmagang.drivers.DriverSingleton;

public class EditAdminPage {
    private WebDriver driver;
    public EditAdminPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//input[@id='tl_user_management--53685_text']")
    WebElement searchBar;
    @FindBy(xpath = "//span[normalize-space()='Search']")
    WebElement btnSearch;


    @FindBy(xpath = "//img[contains(@src,'/psy/static/img/edit.png')]")
    WebElement btnEdit;


    @FindBy(xpath = "//input[@id='tl_agent_editable-21-53699_text']")
    WebElement fullName;
    @FindBy(xpath = "//select[@id='tl_agent_editable-21-53700_text']")
    WebElement listPrivileges;
    @FindBy(xpath = "//select[@id='tl_agent_editable-21-53702_text']")
    WebElement listSupervisor;
    @FindBy(xpath = "//input[@id='tl_agent_editable-21-53705_text']")
    WebElement telephone;
    @FindBy(xpath = "//input[@id='tl_agent_editable-21-53707_text']")
    WebElement useractive;
    @FindBy(xpath = "//input[@id='tl_agent_editable-21-53709_text']")
    WebElement fieldUsername;


    @FindBy(xpath = "//button[@id='53712_query']//span[contains(@class,'ui-button-text')][normalize-space()='Update']")
    WebElement updateBtn;
    @FindBy(xpath = "//span[normalize-space()='Yes']")
    WebElement confirmUpdateBtn;
    @FindBy(xpath = "//p[normalize-space()='Mohon Lengkapi Data']")
    WebElement dataNotCompleteTxt;


    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-2']")
    WebElement tblUserName;
    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-3']")
    WebElement tblFullName;
    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-4']")
    WebElement tblPrivileges;
    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-5']")
    WebElement tblSupervisor;
    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-6']")
    WebElement tblTelephone;
    @FindBy(xpath = "//td[@id='tl_user_management--53683-cell-0-8']")
    WebElement tblUserActive;


    @FindBy(xpath = "//span[normalize-space()='SUPER']")
    WebElement btnLogout;
    @FindBy(xpath = "//span[normalize-space()='YA']")
    WebElement confirmLogoutBtn;


    public void chooseSearchbar() {
        searchBar.click();
    }
    public void selectAllTextSearchBar() {
        searchBar.sendKeys(Keys.CONTROL,"a");
    }
    public void searchKeyword (String searchbar) {
        this.searchBar.sendKeys(searchbar);
    }
    public void clickSearchBtn() {
        btnSearch.click();
    }
    public void clickEditBtn() {
        btnEdit.click();
    }


    public void clearFullName() {
        fullName.clear();
    }
    public void resetPrivilege() {
        listPrivileges.sendKeys(Keys.ARROW_UP,Keys.ENTER);
    }
    public void clearSupervisor() {
        Select purgeSPV = new Select(listSupervisor);
        purgeSPV.selectByVisibleText("");
    }
    public void resetTelephone() {
        telephone.clear();
    }
    public void clearUserActive() {
        useractive.clear();
    }
    public void clearUsername() { //tcc 35
        fieldUsername.clear();
    }


    public void clickUpdateBtn() {
        updateBtn.click();
    }
    public void confirmUpdate() {
        confirmUpdateBtn.click();
    }
    public String getWarningLengkapiData() {
        return dataNotCompleteTxt.getText();
    }


    public String confirmUserName() {
        return tblUserName.getText();
    }
    public String confirmFullName() {
        return tblFullName.getText();
    }
    public String confirmPrivilege() {
        return tblPrivileges.getText();
    }
    public String confirmSupervisor() {
        return tblSupervisor.getText();
    }
    public String confirmTelephone() {
        return tblTelephone.getText();
    }
    public String confirmUserActive() {
        return tblUserActive.getText();
    }


    public void clickLogoutBtn() {
        btnLogout.click();
    }
    public void confirmLogout() {
        confirmLogoutBtn.click();
    }
}
