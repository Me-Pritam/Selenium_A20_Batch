package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PerformingDragAndDrop
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.timr.co/mobile-drag-drop/demo/#");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));

            Actions action = new Actions(driver);

            WebElement boxOne = driver.findElement(By.xpath("//a[@id='one']"));

            WebElement binBox = driver.findElement(By.xpath("//div[@id='innerBin']"));

            action.pause(Duration.ofSeconds(2))
                    .dragAndDrop(boxOne,binBox)
                    .perform();

            driver.switchTo().newWindow(WindowType.TAB);

            driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");

            WebElement dragBox= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='draggable']")));

            action.pause(Duration.ofSeconds(2))
                    .dragAndDropBy(dragBox,100,200)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(dragBox,200,-200)
                    .pause(Duration.ofSeconds(1))
                    .dragAndDropBy(dragBox,300,200)
                    .perform();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
