package locatorpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class RegisterUsingCssSelector
{
    public static void main(String[] args)
    {
        Random random = new Random();

        int num = random.nextInt(10,100);

      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          Thread.sleep(2000);

          driver.get("https://demowebshop.tricentis.com/");

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("a[href='/register']")).click();

          Thread.sleep(2000);

          driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("m"+num+"@gmail.com");
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
