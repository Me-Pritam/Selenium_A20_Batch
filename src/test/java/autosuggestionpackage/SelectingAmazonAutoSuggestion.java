package autosuggestionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SelectingAmazonAutoSuggestion
{
    public static void main(String[] args)
    {
     try
     {
         WebDriver driver = new ChromeDriver();

         driver.manage().window().maximize();

         driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

         driver.get("https://www.amazon.in/");

         WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

         wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='twotabsearchtextbox']")))
                 .sendKeys("Vivo x300");

         List<WebElement> allSuggestions = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@id='nav-flyout-searchAjax']/descendant::div[contains(@class,'s-suggestion s-suggestion-ellipsis-direction')]")));

         for (WebElement option :allSuggestions)
         {
             if (option.getText().equals("vivo x300 pro"))
             {
                 option.click();
                 break;
             }
         }
     }
     catch (Exception e)
     {
         e.printStackTrace();
     }
    }
}
