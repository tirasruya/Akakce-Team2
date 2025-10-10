package US103;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class TC_0301_p {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

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
        password.sendKeys("Melocan123");

        WebElement login= driver.findElement(By.id("update"));
        login.click();

        WebElement logInBtn1= driver.findElement(By.id("H_a_v8"));
        logInBtn1.click();


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,100);");
        Thread.sleep(1000);

        WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@class='mnu nl']/a[4]")));
        logout.click();

        WebElement btnLogin2 = driver.findElement(By.xpath("//div[@class='wbb_v8 lp n']/button"));
        Assert.assertTrue("Ana Sayfaya Dönüş Olmadı.",btnLogin2.getText().contains("Giriş Yap"));
        System.out.println("Ana sayfaya başarılı dönüş oldu.");

        driver.quit();


    }
}
