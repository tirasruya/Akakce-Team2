package US102;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;
import java.time.Instant;

public class TestCaseUS102_1 {
    public static void main(String[] args) {
        WebDriver driver = BaseDriver.driver("https://akakce.com/");

        WebElement logInBtn = driver.findElement(By.id("H_rl_v8"));
      logInBtn.click();



        WebElement email= driver.findElement(By.id("new-email"));
        email.sendKeys("efeersan@gmail.com");

        WebElement continueBtn = driver.findElement(By.id("update"));
        continueBtn.click();


        BaseDriver.threadWait(5);
        WebElement password = driver.findElement(By.id("umpc"));
        password.sendKeys("Melocan123");

        WebElement continueBtn2 = driver.findElement(By.id("update"));
        continueBtn2.click();

        BaseDriver.threadWait(5);
        WebElement verifyProfileName = driver.findElement(By.xpath("//div/a[@id='H_a_v8']/i"));

        final String expectedProfileName = "Efe";
        final String actualProfileName = verifyProfileName.getText();

        Assert.assertEquals("False Profile", expectedProfileName, actualProfileName);


        driver.quit();


    }
}
