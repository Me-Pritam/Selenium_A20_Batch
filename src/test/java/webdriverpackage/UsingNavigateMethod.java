package webdriverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.URL;

public class UsingNavigateMethod
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://takeuforward.org/dsa/strivers-a2z-sheet-learn-dsa-a-to-z");

//            Thread.sleep(2000);
//
//            driver.navigate().refresh();
//
//            Thread.sleep(2000);
//
//            driver.navigate().back();
//
//            Thread.sleep(2000);
//
//            driver.navigate().forward();

//            Thread.sleep(2000);

            driver.navigate().to("https://www.geeksforgeeks.org/");

//            Thread.sleep(2000);

            driver.navigate().to(new URL("https://leetcode.com/"));
        }
        catch (Exception e)
        {
          e.printStackTrace();
        }

    }
}
