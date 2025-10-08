package US103;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class testCase_01 {
    public static void main(String[] args) {
        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        //1.step
        WebElement logInBtn= driver.findElement(By.id("H_a_v8"));
        logInBtn.click();

        //2.step
        WebElement girisYap= driver.findElement(By.xpath("//div[@class='img n']/following-sibling::button"));
        wait.until(ExpectedConditions.elementToBeClickable(girisYap));
        girisYap.click();

        //3.step

        WebElement email= driver.findElement(By.id("new-email"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("efeersan@gmail.com");

        //4.step

        WebElement continueBtn= driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();

        //5.
        WebElement password= driver.findElement(By.id("umpc"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("Melocan123");

        //6.Step

        WebElement login= driver.findElement(By.id("update"));
        login.click();

        driver.quit();



    }
}
