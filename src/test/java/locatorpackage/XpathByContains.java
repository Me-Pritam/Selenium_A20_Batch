package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByContains
{
    public static void main(String[] args)
    {
        try
        {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.imdb.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='suggestion-search']"))
                  .sendKeys("interstellar");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[@id='suggestion-search-button']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//h4[text()='Interstellar']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[contains(@class,'ipc-btn ipc-btn--full-width ipc-btn--left-align-content')]"))
                  .click();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
