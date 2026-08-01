package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingFluentWaitInDemoBlaze
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.demoblaze.com/");

            FluentWait<WebDriver> wait = new FluentWait<>(driver);

            wait.pollingEvery(Duration.ofSeconds(1));
            wait.withTimeout(Duration.ofSeconds(10));
            wait.ignoring(Exception.class);

            wait.until(ExpectedConditions.urlContains("demoblaze"));

            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Sign up']")))
                    .click();

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sign-username']")))
                    .sendKeys("demomail@agmail.com");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='sign-password']")))
                    .sendKeys("Password@12345");

            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Sign up']")))
                    .click();

            wait.until(ExpectedConditions.alertIsPresent()).accept();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
