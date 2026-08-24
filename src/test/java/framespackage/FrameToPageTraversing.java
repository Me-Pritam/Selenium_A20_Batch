package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FrameToPageTraversing
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.iiit.ac.in/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            Actions action = new Actions(driver);

            action.scrollToElement(driver.findElement(By.xpath("//h2[text()='In the news']")))
                    .perform();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='IIITH Campus']")));

            driver.findElement(By.xpath("//button[@aria-label='Play video']"))
                    .click();

            action.pause(Duration.ofSeconds(2))
                    .click(driver.findElement(By.xpath("//button[@aria-label='Pause video']")))
                    .perform();

            driver.switchTo().defaultContent();

            driver.findElement(By.xpath("//a[@href='https://iiit.ac.in/careers/%20']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
