package screenshotpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class ElementScreenshot
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

          driver.get("https://tinder.com/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          WebElement createAccountButton = driver.findElement(By.xpath("//div[text()='Create account']"));

          File tempFile = createAccountButton.getScreenshotAs(OutputType.FILE);

          File destFile = new File("./ScreenshotFolder/ElementSS.png");

          FileHandler.copy(tempFile,destFile);

      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
