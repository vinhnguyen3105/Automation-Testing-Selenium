package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;

public class CartPage {
    private WebDriver driver;

//    private By browsecampssbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/div/div/div/div/div/div/a");
//
//    private By titleSubjectsPage = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[1]/div/span[1]");
//
//    private By clearallbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[2]/div[2]/div/div[1]/span/div/button");
//
//    private By coursebtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[2]/div[2]/div/div[2]/div[1]/a/div");
//
//    private By titleSubject = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[1]/div[1]/div[1]/div[1]");
//
//    private By titleCourse = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[1]/div[1]/div[1]/h1");
//
//    private By booknowbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div/div[3]/div[2]/div[5]/div[2]/button");
//
//    private By titlePage = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[1]/p");
//
//    private By nextbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/button");
//
//    private By cartbtn = By.xpath("/html/body/div[1]/div[2]/div/div/nav/div/div/div[2]/div/a[1]");

    private By validatebtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/div[1]/div/div[2]/div[2]/button");

    private By titleCourseInCart = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/div[1]/div/div[1]/div/div[1]/div[1]/div[2]/div[1]/div[1]/p[2]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean verifyValidatebtn() {
        WebElement element = driver.findElement(validatebtn);
        String pageText = element.getText();
        String expectedPageText = "Validate";
        return pageText.contains(expectedPageText);
    }

    public boolean verifyTitleCourseInCart() {
        WebElement element = driver.findElement(titleCourseInCart);
        String pageText = element.getText();
        String expectedPageText = "Smart Edu";
        return pageText.contains(expectedPageText);
    }

}

