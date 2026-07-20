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

           driver.get("https://www.easemytrip.com/");

           Thread.sleep(2000);

           driver.findElement(By.xpath("//div[@id='dvfarecal']"))
                   .click();

           Thread.sleep(2000);

           WebElement monthBox = driver.findElement(By.xpath("//div[@class='month2']"));

           for(;;)
           {
               if (monthBox.getText().equalsIgnoreCase("Oct 2026"))
               {
                   driver.findElement(By.xpath("//div[@class='month2']/../..//li[text()='11']"))
                           .click();
                   break;
               }
               else{

                   Thread.sleep(2000);

                   driver.findElement(By.xpath("//img[@onclick=\"NextPrevClick('nxtMnt')\"]"))
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
