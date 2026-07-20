package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySingleAttribute
{
    public static void main(String[] args)
    {
      try
      {
          //Opening the Broswer
          WebDriver driver = new ChromeDriver();

          //Maximizing the Browser
          driver.manage().window().maximize();

          Thread.sleep(2000);

          //Opening the amazon.in
          driver.get("https://www.amazon.in/");

          Thread.sleep(2000);

          //Locate the search bar and write Primebook Laptop
          driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"))
                  .sendKeys("Primebook Laptop");

          Thread.sleep(2000);

          //Locate the Search icon and click to search
          driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"))
                  .click();

          Thread.sleep(2000);

          //Locate the Desired Laptop and click on that
          driver.findElement(By.xpath("//h2[.='Primebook 2 Max (2026) | 8GB RAM, 256GB UFS Storage | 15.6-Inch Full HD IPS Display | 12hrs Battery | MediaTek Helio G99 | Android 15 (PrimeOS 3.0) | Backlit Keyboard | in-Built AI (Gray)']"))
                  .click();

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
