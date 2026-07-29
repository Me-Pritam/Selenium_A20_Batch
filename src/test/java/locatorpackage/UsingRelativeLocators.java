package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class UsingRelativeLocators
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.snapdeal.com/");

          Thread.sleep(4000);

          driver.findElement(RelativeLocator.with(By.xpath("//button[.='Download App']"))
                                             .straightRightOf(driver.findElement(By.xpath("//input[@id='search-box-input']"))))
                  .click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
