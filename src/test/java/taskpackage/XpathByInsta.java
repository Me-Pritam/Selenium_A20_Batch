package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByInsta
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://www.instagram.com/");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//button[.='Log in']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@name='email']"))
                  .sendKeys("");

          Thread.sleep(1000);

          driver.findElement(By.xpath("//input[@type='password']"))
                  .sendKeys("");

          Thread.sleep(1000);

          driver.findElement(By.xpath("//div[@aria-label='Log In']"))
                  .click();

          Thread.sleep(6000);

          driver.findElement(By.xpath("//*[name()='svg' and @aria-label='Search']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//input[@aria-label='Search input']"))
                  .sendKeys("donlee");

          Thread.sleep(2000);

          driver.findElement(By.xpath("//span[text()='donlee']"))
                  .click();

          Thread.sleep(2000);

          driver.findElement(By.xpath("//div[.='Follow']"))
                  .click();



      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
