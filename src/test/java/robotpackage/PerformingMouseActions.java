package robotpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;

public class PerformingMouseActions
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://www.flipkart.com/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          driver.findElement(By.xpath("//span[text()='✕']"))
                  .click();

          Robot robot = new Robot();

          robot.delay(2000);

//          robot.mouseWheel(50);

          robot.delay(2000);

          robot.mouseMove(800,300);
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
