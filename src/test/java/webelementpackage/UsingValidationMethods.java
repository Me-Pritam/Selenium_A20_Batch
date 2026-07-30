package webelementpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingValidationMethods
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.naukri.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@id='register_Layer']"))
                    .click();

            Thread.sleep(2000);

            WebElement checkBox = driver.findElement(By.xpath("//a[normalize-space(@class)='checkbox-wrap']/i"));

            Thread.sleep(2000);

            if (checkBox.isDisplayed())
            {
                checkBox.click();

            }

            WebElement registerButton = driver.findElement(By.xpath("//button[text()='Register now']"));

            if (registerButton.isEnabled())
            {
                System.out.println("Register button is enabled");
            }
            else{

                System.out.println("Register button is disabled");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
