package seleniumtest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class BooknowPage {
    private WebDriver driver;

    //private By titlePage = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[1]/p");
    private By nextbtn = By.xpath("/html/body/div[1]/div[2]/div/div/main/div/div[2]/button");

    //private By cartbtn = By.xpath("/html/body/div[1]/div[2]/div/div/nav/div/div/div[2]/div/a[1]");

    public BooknowPage(WebDriver driver) {
        this.driver = driver;
    }


    // verify title

//    public boolean verifyTitlePage() {
//        WebElement element = driver.findElement(titlePage);
//        String pageText = element.getText();
//        String expectedPageText = "Select child and confirm";
//        return pageText.contains(expectedPageText);
//    }

    // click button

    public CartPage clicknextbtn()  throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(nextbtn).click();

        return new CartPage(driver);
    }

//    public CartPage clickcartbtn() throws InterruptedException{
//        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
//                .withTimeout(Duration.ofSeconds(40))
//                .pollingEvery(Duration.ofSeconds(5))
//                .ignoring(NoSuchElementException.class);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(cartbtn));
//        driver.findElement(cartbtn).click();
//
//        return new CartPage(driver);
//    }

}

