package US101;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.BaseDriver;

public class TestCase1 {
    public static void main(String[] args) {

        // Step 1
        WebDriver driver = BaseDriver.driver("https://akakce.com/");
        BaseDriver.threadWait(10);

        //
//        WebElement iframe = driver.findElement(By.xpath("//*[@id='cf-chl-widget-pr6qv']"));
//        driver.switchTo().frame(iframe);
//
//        WebElement verify = driver.findElement(By.xpath("//*[@id='PZGgl8']/div/label/input"));
//        verify.click();
//
//
//        //
//        WebElement homePageText = driver.findElement(By.xpath("//div[2]/h1"));
//
//        final String expectedHomePage = "Akakçe ile En Ucuzu Keşfet!";
//        final String actualHomePage = homePageText.getText();
//
//        Assert.assertEquals("Home page did not open.", expectedHomePage, actualHomePage);


    }
}
