package screenshotpackage;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;

public class CapturingFullPageScreeshot
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new FirefoxDriver();

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

           driver.get("https://www.amarchitrakatha.com/");

           TakesScreenshot screenshot = (TakesScreenshot)driver;

           File tempFile = screenshot.getScreenshotAs(OutputType.FILE);

           File destFile = new File("./ScreenshotFolder/demoSS.png");

           FileHandler.copy(tempFile,destFile);


       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
