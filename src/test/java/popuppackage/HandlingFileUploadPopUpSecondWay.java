package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

public class HandlingFileUploadPopUpSecondWay
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://practice.expandtesting.com/upload");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            Actions action = new Actions(driver);



            action.click(driver.findElement(By.xpath("//input[@name='file']")))
                    .perform();


            StringSelection path = new StringSelection("C:\\Users\\User\\Desktop\\DummyUpload.txt");

            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path,null);

            Robot robot = new Robot();

            robot.delay(2000);

            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.delay(200);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);

            robot.delay(2000);

            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
