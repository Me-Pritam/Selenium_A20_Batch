package synchronizationpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class UsingfluentWait
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--incognito"));

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

          driver.get("https://www.demoblaze.com/");

          FluentWait<WebDriver> wait = new FluentWait(driver);

          wait.pollingEvery(Duration.ofSeconds(2));

          wait.withTimeout(Duration.ofSeconds(20));

          wait.ignoring(NoSuchElementException.class);

          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Sony xperia z5']")))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
