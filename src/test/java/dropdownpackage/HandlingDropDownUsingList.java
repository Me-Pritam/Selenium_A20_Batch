package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandlingDropDownUsingList
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));

            driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

            List<String> desiredOptionName = new ArrayList<>();

            desiredOptionName.addAll(Arrays.asList("Mens Cotton Jacket...","Mens Casual Premium ...","John Hardy Women's L..."));


            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@id='select-multiple-native']")));

            List<WebElement> allOptions = selectMulti.getOptions();

            for (WebElement option: allOptions)
            {
                if (desiredOptionName.contains(option.getText()))
                {
                    option.click();
                }
            }


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
