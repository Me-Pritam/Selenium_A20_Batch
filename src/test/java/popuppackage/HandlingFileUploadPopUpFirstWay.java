package popuppackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingFileUploadPopUpFirstWay
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(15));

            driver.get("https://practice.expandtesting.com/upload");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.findElement(By.xpath("//input[@name='file']"))
                    .sendKeys("C:/Users/User/Desktop/DummyUpload.txt");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
