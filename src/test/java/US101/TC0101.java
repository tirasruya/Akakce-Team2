package US101;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class TC0101 {
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

        //
        WebElement name = driver.findElement(By.id("name"));
        wait.until(ExpectedConditions.visibilityOf(name));
        name.sendKeys("TestUser");

        //
        WebElement surname = driver.findElement(By.id("surname"));
        wait.until(ExpectedConditions.visibilityOf(surname));
        surname.sendKeys("Tester");

        //
        WebElement password = driver.findElement(By.id("umpc"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("Test123*");

        //
        WebElement terms = driver.findElement(By.id("rnufpca"));
        wait.until(ExpectedConditions.elementToBeClickable(terms));
        terms.click();

        //
        WebElement signUpBtn= driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(signUpBtn));
        signUpBtn.click();

        //
        BaseDriver.threadWait(30);

        WebElement verifyBtn = driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(verifyBtn));
        verifyBtn.click();

        //
        WebElement user = driver.findElement(By.id("H_a_v8"));
        wait.until(ExpectedConditions.textToBePresentInElement(user, "TestUser"));

        Assert.assertTrue("User could not sign up.", user.isDisplayed());
    }
}