package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.NoSuchElementException;

public class SignInPage {
    private WebDriver driver;

    private By loginBtn = By.xpath("/html/body/div[1]/div[2]/div/div/nav/div/div/div[2]/div/button[1]");
    //private By headerPageText = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/div/div/div/div/div/div/a");
    private By emailInput = By.id("auth-email");
    private By passwordInput = By.id("password");
    private By signinBtn = By.xpath("/html/body/div[1]/div[2]/div/div/div/span/form/div/button");


    // Khởi tạo class khi được gọi và truyền driver vào để các thành phần trong
    // class này đọc
    public SignInPage(WebDriver driver) {
        this.driver = driver;
    }

//    public String getSignInPageTitle() {
//        String pageTitle = driver.getTitle();
//        return pageTitle;
//    }
//
//    public boolean verifySignInPageTitle() {
//        String expectedTitle = "Agora";
//        return getSignInPageTitle().equals(expectedTitle);
//    }
//
//    public boolean verifySignInPageText() {
//        WebElement element = driver.findElement(headerPageText);
//        String pageText = element.getText();
//        String expectedPageText = "Browse camps";
//        return pageText.contains(expectedPageText);
//    }

    // Sau khi thực hiện click Submit thì khởi tạo trang DashboardPage
    public DashboardPage signin(String username, String password) throws Exception {
        //verifySignInPageTitle();
        //verifySignInPageText();
        clickLogIn();
        Thread.sleep(5000);
        enterEmail(username);
        enterPassword(password);
        clickSignIn();
        Thread.sleep(5000);

        return new DashboardPage(driver);
    }

//    public boolean verifySignIn() {
//        enterEmail("test");
//        enterPassword("pass");
//        clickSignIn();
//        return getErrorMessage().contains("incorrect");
//    }

    public void enterEmail(String email) {
        WebElement emailTxtBox = driver.findElement(emailInput);
        if (emailTxtBox.isDisplayed())
            emailTxtBox.sendKeys(email);
    }

    public void enterPassword(String password) {
        WebElement passwordTxtBox = driver.findElement(passwordInput);
        if (passwordTxtBox.isDisplayed())
            passwordTxtBox.sendKeys(password);
    }

    public void clickSignIn() {
        WebElement signin = driver.findElement(signinBtn);
        if (signin.isDisplayed()) {
            signin.click();
        }
    }

    public void clickLogIn() {
        WebElement signin = driver.findElement(loginBtn);
        if (signin.isDisplayed()) {
            signin.click();
        }
    }

//    public String getErrorMessage() {
//        String strErrorMsg = null;
//        WebElement errorMsg = driver.findElement(errorMsgText);
//        if (errorMsg.isDisplayed() && errorMsg.isEnabled())
//            strErrorMsg = errorMsg.getText();
//        return strErrorMsg;
//    }

//    public void waitForPageLoaded() {
//        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
//            public Boolean apply(WebDriver driver) {
//                return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
//                        .equals("complete");
//            }
//        };
//        try {
//            Thread.sleep(1000);
//            WebDriverWait wait = new WebDriverWait(driver, 30);
//            wait.until(expectation);
//        } catch (Throwable error) {
//            Assert.fail("Timeout waiting for Page Load Request to complete.");
//        }
//    }
}
