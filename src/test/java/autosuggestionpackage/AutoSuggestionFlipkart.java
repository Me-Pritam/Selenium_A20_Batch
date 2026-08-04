package autosuggestionpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggestionFlipkart
{
    public static void main(String[] args)
    {
        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.get("https://www.flipkart.com/");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

            driver.findElement(By.xpath("//span[@role='button']"))
                            .click();

            driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']"))
                    .sendKeys("Prestige");

            WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));

            List<WebElement> allOptions = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//ul[contains(@class,'VCplLH lTpUwR bRjjIF _1psv1ze5l _1psv1ze9l')]/descendant::div[contains(@class,'VDtK0l _1psv1ze2u _1psv1ze53 _1psv1ze9x _1psv1ze7o')]"))));

            for(WebElement option: allOptions)
            {
                if (option.getText().equals("prestige air fryer"))
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
