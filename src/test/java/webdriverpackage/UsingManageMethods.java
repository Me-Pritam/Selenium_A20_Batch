package webdriverpackage;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingManageMethods
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.get("https://www.geeksforgeeks.org/");

            Thread.sleep(2000);

//            driver.manage().window().maximize();
//
//            Thread.sleep(2000);
//
//            driver.manage().window().fullscreen();
//
//            Thread.sleep(2000);
//
//            driver.manage().window().minimize();

            driver.manage().window().setSize(new Dimension(500,500));

            Thread.sleep(2000);

            driver.manage().window().setPosition(new Point(500,500));

            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(100,200));

            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(600,80));

            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(50,500));

            Thread.sleep(1000);

            driver.manage().window().setPosition(new Point(800,500));

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
