package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCssSelectorInSauceLabs
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            Thread.sleep(2000);
            driver.get("https://www.saucedemo.com/");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input[name='password']")).sendKeys("secret_sauce");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("input#login-button")).click();
            Thread.sleep(8000);
            driver.findElement(By.cssSelector("div.inventory_item:nth-child(1) button")).click();
            Thread.sleep(2000);
            String itemPrice= driver.findElement(By.cssSelector("div.inventory_item:nth-child(1) div.inventory_item_price"))
                    .getText().replace("$","");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector("div#shopping_cart_container")).click();
            Thread.sleep(2000);
            String priceInCart = driver.findElement(By.cssSelector("div.cart_item div.inventory_item_price"))
                    .getText().replace("$","");

            if (priceInCart.equals(itemPrice))
            {
                System.out.println("The Price is correct");
            }
            else{
                System.out.println("The Price is incorrect");
            }

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
