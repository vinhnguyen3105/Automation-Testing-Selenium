package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DashboardPage {
    private WebDriver driver;

    private By coursesbtn = By.xpath("/html/body/div/div[2]/div/div/nav/div/div/div[1]/div[3]/a[1]");
    private By cartbtn = By.xpath("/html/body/div[1]/div[2]/div/div/nav/div/div/div[2]/div/a[1]");
    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    // click button

    public CoursesPage clickCoursesbtn() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(coursesbtn).click();

        return new CoursesPage(driver);
    }

//    public ListCoursePage clickClearallbtn() {
//        //fluentWait(clearallbtn);
//        driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS);
//        driver.findElement(clearallbtn).click();
//
//        JavascriptExecutor jse = (JavascriptExecutor)driver;
//        jse.executeScript("arguments[0].click()",clearallbtn);
//
//        return new ListCoursePage(driver);
//    }

    public CartPage clickcartbtn() throws InterruptedException{
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(cartbtn).click();

        return new CartPage(driver);
    }


}

