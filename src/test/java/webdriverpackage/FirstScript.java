package webdriverpackage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript
{
    public static void main(String[] args)
    {
        String givenURL= "https://chat.qspiders.com/";

        try
        {
          WebDriver driver = new ChromeDriver();

          driver.get(givenURL);

          Thread.sleep(2000);

          String actualURL = driver.getCurrentUrl();

          if (actualURL.equals(givenURL))
          {
              System.out.println("The Given and the Actual URL is SAME");
          }
          else
          {
              System.out.println("The Given and the Actual URL is NOT SAME");
          }

          String desiredTitle = "Qtalk";

          String actualTitle = driver.getTitle();

          if (desiredTitle.equals(actualTitle))
          {
              System.out.println("The Desired Title & the Actual Title is SAME");
          }
          else{
              System.out.println("The Desired Title & the Actual Title is NOT SAME");
          }

            System.out.println(driver.getPageSource());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
