package autosuggestionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HandlingAutoSuggestionEbay
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.ebay.com/");

          WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

          wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gh-ac']")))
                  .sendKeys("HotWheels");

          List<WebElement> allOptions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@id='ebay-autocomplete']/descendant::span[@class='suggestion']")));

          for(WebElement option : allOptions)
          {
              if (option.getText().contains("hot wheels super treasure hunt"))
              {
                  option.click();
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
