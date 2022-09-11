package seleniumtest.testcase;

import logpackage.ultilities.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import seleniumtest.base.BaseSetup;
import seleniumtest.pages.*;


public class CheckthecourseincartTest extends BaseSetup {
    public WebDriver driver;
    public SignInPage signInPage;
    public DashboardPage dashboardPage;
    public CoursesPage listCoursePage;
    public TheCoursePage theCoursePage;
    public BooknowPage booknowPage;
    public CartPage cartPage;

//    @BeforeClass
//    public void setUp() {
//        driver = getDriver();
//    }

    @BeforeTest
    public void signIn() throws Exception {
        initializeTestBaseSetup("chrome", "https://dev.agora-colearning.space/home");
        driver = getDriver();
        System.out.println(driver);
        signInPage = new SignInPage(driver);
        dashboardPage = signInPage.signin("myy1@yopmail.com", "@123Tps");
    }

    @Test
    public void checkTheCourseInCart() throws Exception {
        Log.info("Run test case: Check the added course in the cart");

        Log.info("1. Click on the Cart icon");
        cartPage = dashboardPage.clickcartbtn();

        Log.info("2. Check the Validate button is shown");
        Assert.assertTrue(cartPage.verifyValidatebtn(), "Validate");

        Log.info("3. Check the title of the added course");
        Assert.assertTrue(cartPage.verifyTitleCourseInCart(), "Smart Edu");

        Log.info("The course is shown in the cart");

    }

    @AfterTest
    public void exitBrowser() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }

}


