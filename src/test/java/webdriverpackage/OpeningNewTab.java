package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpeningNewTab
{
    public static void main(String[] args) throws Exception
    {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

        driver.get("https://qspiders.com/");

        Thread.sleep(2000);

        driver.switchTo().newWindow(WindowType.WINDOW);

        driver.get("https://www.snapdeal.com/");
    }
}
