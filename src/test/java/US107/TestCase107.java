package US107;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utility.BaseDriver;

import java.time.Duration;

public class TestCase107 {
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

        WebElement myAccountBtn=driver.findElement(By.xpath("//a[@href='kisisel-bilgilerim/']"));
        myAccountBtn.click();

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        WebElement deleteAccount= driver.findElement(By.cssSelector("button#delete"));
        deleteAccount.click();

        WebElement chooseDeleteAccount=driver.findElement(By.xpath("//button[.//b[text()='Hesabımı Silmek İçin Devam Et']]"));
        chooseDeleteAccount.click();

        WebElement options= driver.findElement(By.xpath("//input[@value='option1']"));
        options.click();

        WebElement deleteFinal= driver.findElement(By.xpath("//button[@name='b']/b[text()='Hesabımı Sil']"));
        deleteFinal.click();

        BaseDriver.threadWait(3);

        WebElement homePageText = driver.findElement(By.xpath("//a[@href='/hesabim/giris/']"));

        final String expectedHomePage = "Giriş Yap";
        final String actualHomePage = homePageText.getText();


        Assert.assertEquals("Sayfa acilmadi",expectedHomePage,actualHomePage);

        driver.quit();
    }
}
