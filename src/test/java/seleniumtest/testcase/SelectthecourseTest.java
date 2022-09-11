package seleniumtest.testcase;

import logpackage.ultilities.Log;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import seleniumtest.base.BaseSetup;
import seleniumtest.pages.*;


public class SelectthecourseTest extends BaseSetup {
    public WebDriver driver;
    public SignInPage signInPage;
    public DashboardPage dashboardPage;
    public CoursesPage coursesPage;
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
    public void selectTheCourse() throws Exception {
        Log.info("Run test case: Select the course");

        Log.info("1. Click on the Courses button");
        coursesPage = dashboardPage.clickCoursesbtn();

        Log.info("2. Select the course");
        theCoursePage = coursesPage.clickcoursebtn();

        Log.info("3. Check the Book now button is shown");
        Assert.assertTrue(theCoursePage.verifyBooknowbutton(), "Book now");

        Log.info("4. Check the title of the course");
        Assert.assertEquals(theCoursePage.verifyTitleCourse(), "Smart Edu");

        Log.info("Select the course successfully");


//        Log.info("3. Click on the Book now button");
//        booknowPage = theCoursePage.clickbooknowbtn();
//
//        Log.info("4. Click on the Next button");
//        cartPage = booknowPage.clicknextbtn();

    }

    @AfterTest
    public void exitBrowser() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }


}


