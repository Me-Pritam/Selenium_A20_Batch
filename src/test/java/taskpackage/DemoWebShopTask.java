package taskpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTask
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            Thread.sleep(2000);

            driver.get("https://demowebshop.tricentis.com/");

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[@href='/electronics']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//h2[@class='title' and normalize-space(.)='Cell phones']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//a[text()='Phone Cover']"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//img[contains(@src,'https://demowebshop.tricentis.com/content/images/thumbs/0000213_phone-cover_70.png')]"))
                    .click();

            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[@title='Close (Esc)']"))
                    .click();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
