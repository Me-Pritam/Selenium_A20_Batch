package windowswitching;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FLipkartWindowHandle
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://www.flipkart.com/");

            Thread.sleep(2000);

            String parentId= driver.getWindowHandle();

            driver.findElement(By.xpath("//span[text()='✕']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"))
                    .sendKeys("Samsung Galaxy S26 Ultra");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@aria-label='Search for Products, Brands and More']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//div[text()='Samsung Galaxy S26 Ultra 5G (White, 512 GB)']"))
                    .click();

            Thread.sleep(2000);

            Set<String> allPageIds = driver.getWindowHandles();

            for(String pageId : allPageIds)
            {
                if (pageId.equals(parentId))
                {
                    continue;
                }
                else {

                    driver.switchTo().window(pageId);
                    break;
                }
            }

            Thread.sleep(4000);

            driver.findElement(By.xpath("//div[.='Buy now']/ancestor::div[@class='_1psv1zeb9 _1psv1ze0']/descendant::*[name()='svg']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
