package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathInYoutube
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.youtube.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@name='search_query']"))
                    .sendKeys("Moon knight");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label='Search']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath(" //*[text()='Marvel Studios’ Moon Knight | Official Trailer | Disney+']"))
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
