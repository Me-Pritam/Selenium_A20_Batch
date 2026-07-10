package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaapTolTask
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          Thread.sleep(2000);

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://deodap.in/");

          Thread.sleep(2000);

          driver.findElement(By.linkText("Rakhi")).click();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }

}
