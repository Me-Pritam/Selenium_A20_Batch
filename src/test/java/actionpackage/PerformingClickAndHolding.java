package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerformingClickAndHolding
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://yonobusiness.sbi.bank.in/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

            Actions action = new Actions(driver);

            action.click(driver.findElement(By.xpath("//div[@role='dialog']/descendant::span[contains(@class,'ng-tns-c2785778308-3 icon-cancel')]")))
                            .perform();

            action.click(driver.findElement(By.xpath("//button[.='Login']")))
                    .click(driver.findElement(By.xpath("//li[@title='Login']")))
                    .perform();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(25));

            wait.until(ExpectedConditions.stalenessOf(driver.findElement(By.tagName("body"))));

            action.sendKeys(driver.findElement(By.xpath("//input[@id='password']")),"Password@1234")
                    .pause(Duration.ofSeconds(2))
                    .clickAndHold(driver.findElement(By.xpath("//img[@src='assets/img/Revamp/icon_eye_close.svg']")))
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
