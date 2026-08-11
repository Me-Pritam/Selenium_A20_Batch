package actionpackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PerformingCopyPasting
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

            driver.get("https://demowebshop.tricentis.com/register");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            Actions action = new Actions(driver);

            WebElement firstNameBox = driver.findElement(By.id("FirstName"));
            WebElement lastNameBox = driver.findElement(By.id("LastName"));

            action.click(firstNameBox)
                    .sendKeys("FirstName")
                    .keyDown(Keys.CONTROL)
                    .sendKeys("A")
                    .keyUp(Keys.CONTROL)
                    .keyDown(Keys.CONTROL)
                    .sendKeys("C")
                    .keyUp(Keys.CONTROL)
                    .click(lastNameBox)
                    .keyDown(Keys.CONTROL)
                    .sendKeys("V")
                    .keyUp(Keys.CONTROL)
                    .perform();

//            driver.switchTo().newWindow(WindowType.TAB);
//
//            driver.get("https://www.saucedemo.com/");
//
//            action.pause(2)
//                    .click(driver.findElement(By.id("user-name")))
//                    .keyDown(Keys.CONTROL)
//                    .sendKeys(Keys.TAB)
//                    .keyUp(Keys.CONTROL)
//                    .perform();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
