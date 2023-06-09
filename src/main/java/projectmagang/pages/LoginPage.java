package projectmagang.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import projectmagang.drivers.DriverSingleton;

public class LoginPage {
    private WebDriver driver;
    public LoginPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div[1]/table/tbody/tr/td[2]/div/input")
    WebElement username;

    @FindBy(xpath = "/html/body/div[8]/div[2]/div/div[2]/table/tbody/tr/td[2]/div/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"53784_query\"]/span")
    WebElement btnSignin;

    @FindBy(xpath = "//*[@id=\"ui-id-1\"]")
    WebElement loginTitle;

    @FindBy(xpath = "/html/body/div[8]/div[2]/p")
    WebElement txtWelcome;

    @FindBy(xpath = "//p[normalize-space()='Welcome to web psikotest']")
    WebElement loginSuccessMsg;

    @FindBy(xpath = "//div[@id='nikita-form-dialog']")
    WebElement txtLoginError;

    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement loginErrorOkBtn;

    @FindBy(xpath = "//span[normalize-space()='OK']")
    WebElement btnDismissLoginMsg;

    public String getLoginTitle(){
        return loginTitle.getText();
    }
    public String getTxtWelcome(){return txtWelcome.getText();}
    public void clickBtnSignin(){btnSignin.click();}
    public void dismissLoginWarningMsg() {
        loginErrorOkBtn.click();
    }
    public String getLoginErrorTxt() {
        return txtLoginError.getText();
    }
    public void enterUsername(String username){
        this.username.sendKeys(username);
    }
    public void enterPassword(String password){
        this.password.sendKeys(password);
    }
    public void clearLoginForm() {
        username.clear();
        password.clear();
    }

    public void dissmissLoginMsg() {
        btnDismissLoginMsg.click();
    }
    public String getLoginSuccessMsg() {
        return loginSuccessMsg.getText();
    }

}
