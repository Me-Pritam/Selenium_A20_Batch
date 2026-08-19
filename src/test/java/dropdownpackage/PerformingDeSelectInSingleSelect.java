package dropdownpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class PerformingDeSelectInSingleSelect
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://demoqa.com/select-menu");

            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//            Select select = new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
//
//            select.selectByVisibleText("Green");
//
//            Thread.sleep(2000);
//
//            select.deselectByVisibleText("Green");
//
//            select.deselectAll();


            Select selectMulti = new Select(driver.findElement(By.xpath("//select[@name='cars']")));

            selectMulti.selectByVisibleText("Volvo");

            selectMulti.selectByVisibleText("Opel");

            selectMulti.selectByVisibleText("Audi");


            Thread.sleep(2000);

//            selectMulti.deselectByVisibleText("Opel");

            selectMulti.deselectAll();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
