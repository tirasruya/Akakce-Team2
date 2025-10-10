package US105;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TC0501 {
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

        WebElement myList=driver.findElement(By.xpath("//a[@class='mi fvl']"));
        myList.click();

        WebElement shoppingList= driver.findElement(By.xpath("//div[@class='imgContent_no m']"));
        shoppingList.click();

        WebElement checkList= driver.findElement(By.xpath("//div[@class='empty_list']/p"));

        final String expectedMessage="Listenizde Hiç Ürün Yok";
        final String actualMessage= checkList.getText();

        Assert.assertEquals("Liste bos degil",expectedMessage,actualMessage);

        driver.quit();

    }
}
