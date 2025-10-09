package US101;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class TC0102 {
    public static void main(String[] args) {

        //
        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //
        WebElement homePageText = driver.findElement(By.xpath("//div[2]/h1"));

        final String expectedHomePage = "Akakçe ile En Ucuzu Keşfet!";
        final String actualHomePage = homePageText.getText();

        Assert.assertEquals("Home page did not open.", expectedHomePage, actualHomePage);

        //
        WebElement logInBtn = driver.findElement(By.id("H_a_v8"));
        logInBtn.click();

        //
        WebElement girisYap = driver.findElement(By.xpath("//div[@class='img n']/following-sibling::button"));
        wait.until(ExpectedConditions.elementToBeClickable(girisYap));
        girisYap.click();

        //
        WebElement email= driver.findElement(By.id("new-email"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("ruyatest123@gmail.com");

        //
        WebElement continueBtn= driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();


        // NAME
        WebElement name = driver.findElement(By.id("name"));
        wait.until(ExpectedConditions.visibilityOf(name));
        name.sendKeys("TestUser");

        // SURNAME
        WebElement surname = driver.findElement(By.id("surname"));
        wait.until(ExpectedConditions.visibilityOf(surname));
        surname.sendKeys("Tester");

        // PASSWORD
        WebElement password = driver.findElement(By.id("umpc"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("Test123*");

        // WRONG PASSWORD
        WebElement passwordWrong = driver.findElement(By.id("umpc"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("Test12");

        // TERMS
        WebElement terms = driver.findElement(By.id("rnufpca"));
        wait.until(ExpectedConditions.elementToBeClickable(terms));
        terms.click();


        //
        WebElement signUpBtn= driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(signUpBtn));
        signUpBtn.click();


        //
        WebElement errorText = driver.findElement(By.xpath("//div[3]/div[1]/div"));
        Assert.assertTrue("Lutfen adinizi yaziniz.", errorText.isDisplayed());

        //
        WebElement errorText2 = driver.findElement(By.xpath("//div[3]/div[2]/div"));
        Assert.assertTrue("Lutfen soyadinizi yaziniz.", errorText2.isDisplayed());

        //
        WebElement errorText3 = driver.findElement(By.xpath("//div[4]/div[@class='input-wrapper er']"));
        Assert.assertTrue("Lutfen sifrenizi yaziniz.", errorText3.isDisplayed());

        //
        WebElement errorText4 = driver.findElement(By.id("rnufpca"));
        Assert.assertTrue("Terms onaylayiniz.", errorText4.isSelected());

        //
        WebElement errorText5 = driver.findElement(By.className("tooltip"));
        Assert.assertTrue("Sifreniz kriterlere uygun degil.", errorText3.isDisplayed());

    }
}