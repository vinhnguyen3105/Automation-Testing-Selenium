package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class TheCoursePage {
    private WebDriver driver;

    //private By titleSubject = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[1]/div[1]/div[1]/div[1]");

    private By titleCourse = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[1]/div[1]/div[1]/div[1]/h1");
    //private By titleCourse = By.className("course-name tw-text-3xl tw-leading-9 tw-font-bold tw-text-gray-800");
    private By booknowbtn = By.xpath("/html/body/div/div[2]/div/div/main/div/div[1]/div[3]/div[2]/div[5]/div[2]/button[2]");

    ////*[@class='btn-select-teacher tw-w-full md:tw-w-auto']

    //private By titlePage = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[1]/p");

    //private By nextbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/button");

    public TheCoursePage(WebDriver driver) {
        this.driver = driver;
    }


    // verify title

//    public boolean verifyTitleSubject() {
//        WebElement element = driver.findElement(titleSubject);
//        String pageText = element.getText();
//        String expectedPageText = "TNA_3 | Robotics";
//        return pageText.contains(expectedPageText);
//    }

//    public String getTitleCourse() {
//        String pageTitle = driver.getTitle();
//        return pageTitle;
//    }
//
//    public String verifyTitleCourse() {
//        String expectedTitle = "Courses - Learn English Courses: New work and study opportunities worldwide with a Online English courses - Agora";
//        return getTitleCourse();
//    }

    public String verifyTitleCourse() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = driver.findElement(titleCourse);
        String pageText = element.getText();
        //String expectedPageText = "Learn English Courses: New work and study opportunities worldwide with a Online English courses";
        return pageText;
    }

    public boolean verifyBooknowbutton() {
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        WebElement element = driver.findElement(booknowbtn);
        String pageText = element.getText();
        String expectedPageText = "Book now";
        return pageText.contains(expectedPageText);
    }


    // click button

//    public BooknowPage clickbooknowbtn() throws InterruptedException{
//        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
//        driver.findElement(booknowbtn).click();
//
//        WebElement element = driver.findElement(booknowbtn);
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//        Thread.sleep(500);
//
//        Actions action = new Actions(driver);
//        action.moveToElement(driver.findElement(booknowbtn)).click().perform();
//
//        JavascriptExecutor executor = (JavascriptExecutor)driver;
//        executor.executeScript("arguments[0].click();", booknowbtn);
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement((WebElement) booknowbtn).click().perform();
//
//        return new BooknowPage(driver);
//    }

//    public BooknowPage clicknextbtn()  throws InterruptedException {
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(40))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(nextbtn));
//        driver.findElement(nextbtn).click();
//
//        return new BooknowPage(driver);
//    }

}

