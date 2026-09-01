package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BasicAuthPopUPFirstWay
{
    public static void main(String[] args) {

        try
        {
            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
