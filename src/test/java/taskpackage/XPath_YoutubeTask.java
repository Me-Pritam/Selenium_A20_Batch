package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPath_YoutubeTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//yt-icon-button[@id='guide-button']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@title='Music']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("Kahani suno 2.0");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[contains(@aria-label,'Kaifi Khalil - Kahani Suno 2.0 ')]"))
                    .click();

            Thread.sleep(2000);

            driver.manage().window().fullscreen();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
