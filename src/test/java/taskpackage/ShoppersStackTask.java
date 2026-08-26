package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ShoppersStackTask
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new FirefoxDriver();

           driver.manage().window().maximize();

           driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));

           driver.get("https://www.shoppersstack.com/");

           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

           WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

           WebElement featureTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[text()='Featured Products']")));

           Actions action = new Actions(driver);

           action.scrollToElement(featureTab).perform();
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
