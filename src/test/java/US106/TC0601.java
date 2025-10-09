package US106;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC0601 {
    public static void main(String[] args) {
        WebDriver driver= BaseDriver.driver("https://www.akakce.com/");

        final String email="tanerozcelik@gmail.com";
        final String password="Password123";

        WebElement loginBtn= driver.findElement(By.xpath("//a[@href='/hesabim/giris/']"));
        loginBtn.click();

        WebElement emailInput= driver.findElement(By.xpath("//input[@id='new-email']"));
        emailInput.sendKeys(email);

        WebElement continueBtn= driver.findElement(By.xpath("//button[@id='update']/b[text()='Devam Et']"));
        continueBtn.click();

        WebElement passwordInput= driver.findElement(By.xpath("//input[@id='umpc']"));
        passwordInput.sendKeys(password);

        WebElement loginBtn2= driver.findElement(By.xpath("//button[@id='update']/b[text()='Giriş Yap']"));
        loginBtn2.click();

        WebElement myAccount= driver.findElement(By.xpath("//div[@id='HM_v8']"));
        myAccount.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement notification= driver.findElement(By.xpath("//a[@class='mi n']"));
        notification.click();

        WebElement notificationText= driver.findElement(By.xpath("//div[@class='ntf-empty']/h2"));

        final String expectedNotification="Henüz hiç bildiriminiz yok";
        final String actualNotification=notificationText.getText();

        Assert.assertEquals("Bildirim mevcut",expectedNotification,actualNotification);

        driver.quit();

    }
}
