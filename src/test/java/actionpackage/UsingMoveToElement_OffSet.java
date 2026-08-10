package actionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingMoveToElement_OffSet
{
    public static void main(String[] args)
    {
      try
      {
          WebDriver driver = new ChromeDriver();

          driver.manage().window().maximize();

          driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));

          driver.get("https://www.amazon.in/");

          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

          Actions actions = new Actions(driver);



//          actions.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']")))
//                  .perform();
//
//         boolean signInVisibility = driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']")).isDisplayed();
//
//         if (signInVisibility)
//         {
//             System.out.println("The SignUp is visible");
//         }
//         else {
//             System.out.println("The SignUP is not visible");
//         }

          WebElement freshLink = driver.findElement(By.xpath("//a[@href='/fresh?ref_=nav_cs_grocery']"));

          actions.moveByOffset(freshLink.getLocation().getX()+freshLink.getSize().getWidth()/2,freshLink.getLocation().getY()+freshLink.getSize().getHeight()/2)
                  .perform();
      }
      catch (Exception e)
      {
          e.printStackTrace();
      }
    }
}
