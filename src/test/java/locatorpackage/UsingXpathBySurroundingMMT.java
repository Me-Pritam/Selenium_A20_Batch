package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpathBySurroundingMMT
{
    public static void main(String[] args)
    {
       try
       {
           WebDriver driver = new ChromeDriver();

           driver.manage().window().maximize();

           Thread.sleep(2000);

           driver.get("https://www.cleartrip.com/");

           Thread.sleep(2000);

           driver.findElement(By.xpath("//*[name()='svg' and @data-testid='closeIcon']"))
                           .click();

           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[@data-testid='dateSelectOnward']"))
                   .click();

           Thread.sleep(2000);

           WebElement monthBox = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']"));

           for(;;)
           {
               if (monthBox.getText().equalsIgnoreCase("October 2026"))
               {
                   driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/..//div[text()='11']"))
                           .click();
                   break;
               }
               else{

                   Thread.sleep(2000);

                   driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']"))
                           .click();

               }
           }
       }
       catch (Exception e)
       {
           e.printStackTrace();
       }
    }
}
