package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorInYouTube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("input.ytSearchboxComponentInput.yt-searchbox-input.title"))
                    .sendKeys("Selenium");

            Thread.sleep(2000);

            driver.findElement(By.cssSelector("[class='ytSearchboxComponentSearchButton']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
