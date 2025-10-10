package US104;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class TC_0403_n {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement logInBtn= driver.findElement(By.id("H_a_v8"));
        logInBtn.click();

        WebElement girisYap= driver.findElement(By.xpath("//div[@class='img n']/following-sibling::button"));
        wait.until(ExpectedConditions.elementToBeClickable(girisYap));
        girisYap.click();

        WebElement email= driver.findElement(By.id("new-email"));
        wait.until(ExpectedConditions.visibilityOf(email));
        email.sendKeys("invalid@gmail.com");

        WebElement continueBtn= driver.findElement(By.xpath("//div[@class='bc']/button"));
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();

        WebElement createAccText = driver.findElement(By.cssSelector("#update > b"));

        String expected = "Devam Et";
        String actual = createAccText.getText();

        Assert.assertEquals( "Hesap Oluştur", expected, actual);

        Thread.sleep(1000);

        driver.quit();



    }
}
