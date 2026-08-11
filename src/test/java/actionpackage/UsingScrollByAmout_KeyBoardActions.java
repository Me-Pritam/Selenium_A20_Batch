package actionpackage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingScrollByAmout_KeyBoardActions
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://www.worldometers.info/geography/flags-of-the-world/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            action.pause(2)
                    .scrollByAmount(0,500)
                    .pause(2)
                    .scrollByAmount(0,500)
                    .pause(2)
                    .scrollByAmount(0,500)
                    .perform();

            action.keyDown(Keys.CONTROL)
                    .sendKeys("A")
                    .keyUp(Keys.CONTROL)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
