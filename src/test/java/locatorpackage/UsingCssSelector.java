package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingCssSelector
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new EdgeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://deodap.in/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input[name='q']"))
                    .sendKeys("Phone Covers");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("button[aria-label='Search']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
