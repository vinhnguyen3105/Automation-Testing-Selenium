package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class CoursesPage {
    private WebDriver driver;

    //private By titleSubjectsPage = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[1]/div/span[1]");
    private By coursebtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[2]/div[2]/div/div[2]/div[1]/a/div");

    public CoursesPage(WebDriver driver) {
        this.driver = driver;
    }


    // verify title
//    public boolean verifyTitleSubjectsPage() {
//        WebElement element = driver.findElement(titleSubjectsPage);
//        String pageText = element.getText();
//        String expectedPageText = "Subjects";
//        return pageText.contains(expectedPageText);
//    }

    // click button

    public TheCoursePage clickcoursebtn() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(coursebtn).click();

        return new TheCoursePage(driver);
    }

}

