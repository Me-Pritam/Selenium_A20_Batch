package robotpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class PerformingKeyBoardActions
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.amazon.in/");

            Robot robot = new Robot();

//            robot.delay(2000);
//            robot.keyPress(KeyEvent.VK_WINDOWS);
//            robot.keyRelease(KeyEvent.VK_WINDOWS);

            driver.switchTo().newWindow(WindowType.TAB);

            driver.get("https://www.flipkart.com/");

            robot.delay(2000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_SHIFT);
            robot.keyPress(KeyEvent.VK_TAB);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_TAB);
            robot.keyRelease(KeyEvent.VK_SHIFT);
            robot.keyRelease(KeyEvent.VK_CONTROL);



        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
