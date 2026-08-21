package framespackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingNestedFrame
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.dezlearn.com/nested-iframes-example/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='parent_iframe']")));

            driver.findElement(By.xpath("//button[normalize-space(text())='Click Here']"))
                    .click();

            driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe1']")));

            driver.findElement(By.xpath("//button[normalize-space(text())='Click Here']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
