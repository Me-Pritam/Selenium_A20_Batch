package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationCentralTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://testautomationcentral.com/#google_vignette");

            Thread.sleep(2000);

            WebElement link = driver.findElement(By.cssSelector("ul#menu-annieblog-header-menu a[href='https://testautomationcentral.com/demo/']"));

            System.out.println(link.getTagName());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
