package webdriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class UsingFindElements
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

          driver.get("https://demowebshop.tricentis.com/");

          List<WebElement> allLinks = driver.findElements(By.tagName("a"));

          for(WebElement element : allLinks)
          {
              if (element.getText().equals("Tricentis"))
              {
                  element.click();

                  break;
              }
          }
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
