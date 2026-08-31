package popuppackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class HandlingGeoLocationPopUP
{
    public static void main(String[] args) {

        try
        {
            Map<String,Object> prefs = new HashMap<>();

            prefs.put("profile.default_content_setting_values.geolocation",2);
            prefs.put("profile.default_content_setting_values.popup",2);

            ChromeOptions options = new ChromeOptions();

            options.setExperimentalOption("prefs",prefs);

            WebDriver driver = new ChromeDriver(options);

            driver.manage().window().maximize();

            driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

            driver.get("https://www.easemytrip.com/");
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }
}
