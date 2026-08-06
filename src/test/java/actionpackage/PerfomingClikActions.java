package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerfomingClikActions
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/buttons");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

//            action.pause(Duration.ofSeconds(2))
//                    .click(driver.findElement(By.xpath("//button[text()='Click Me']")))
//                    .perform();

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));

            action.click(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Click Me']"))))
                    .pause(Duration.ofSeconds(2))
                    .contextClick(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Right Click Me']"))))
                    .pause(Duration.ofSeconds(2))
                    .doubleClick(wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Double Click Me']"))))
                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
