package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocators
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            Thread.sleep(2000);

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.id("small-searchterms")).sendKeys("Books");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
