package US104;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;
import java.util.Objects;

public class TC0402_n {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement logInBtn= driver.findElement(By.id("H_a_v8"));
        logInBtn.click();

        WebElement girisYap= driver.findElement(By.xpath("//div[@class='img n']/following-sibling::button"));
        wait.until(ExpectedConditions.elementToBeClickable(girisYap));
        girisYap.click();

        WebElement email= driver.findElement(By.id("new-email"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("efeersan@gmail.com");

        WebElement continueBtn= driver.findElement(By.id("update"));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();

        WebElement password= driver.findElement(By.id("umpc"));
        wait.until(ExpectedConditions.visibilityOf(password));
        password.sendKeys("invalid123");

        WebElement login= driver.findElement(By.id("update"));
        login.click();

        WebElement pssCheckText = driver.findElement(By.xpath("//div[@class='input-wrapper er' and @data-e='Lütfen şifrenizi kontrol edin.']"));

        String expected = "Lütfen şifrenizi kontrol edin.";
        String actual = Objects.requireNonNull(pssCheckText.getAttribute("data-e")).trim();

        Assert.assertEquals( expected, actual);

        Thread.sleep(1000);

        driver.quit();

    }
}
