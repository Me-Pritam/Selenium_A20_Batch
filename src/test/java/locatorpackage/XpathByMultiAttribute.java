package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByMultiAttribute
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.amazon.in/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("Toys");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .click();

          Thread.sleep(4000);

          driver.findElement(By.xpath("//div[@data-cy='title-recipe' and contains(.,'HVB Shinchan y for Kids, ')]"))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
