package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UsingCssSelectorInDemoWebShop
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://demowebshop.tricentis.com/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div.header-menu a[href='/books']"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div[data-productid='13'] input[value='Add to cart']"))
                    .click();
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("a[class='ico-cart']"))
                    .click();
            Thread.sleep(2000);
            WebElement inputField  = driver.findElement(By.cssSelector("table.cart td.qty.nobr>input"));
                    inputField.clear();
                    Thread.sleep(1000);
                    inputField.sendKeys("10");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
