import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TiktokClickTest {
    static AppiumDriver appiumDriver;

    public static void main(String[] args) {
        try {
            openTikTok();
        } catch (MalformedURLException e){
            e.printStackTrace();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void openTikTok() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName", "Mi A2 Lite");
        capabilities.setCapability("udid", "6788eaed0305");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");
        capabilities.setCapability("appPackage", "com.zhiliaoapp.musically");
        capabilities.setCapability("appActivity", "com.ss.android.ugc.aweme.main.MainActivity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        appiumDriver = new AppiumDriver(url, capabilities);

        TimeUnit.SECONDS.sleep(6);

        WebElement agreeBtn = appiumDriver.findElement(By.id("com.zhiliaoapp.musically:id/ad2"));
        agreeBtn.click();
        TimeUnit.SECONDS.sleep(5);

        WebElement profileBtn = appiumDriver.findElement(By.id("com.zhiliaoapp.musically:id/eil"));
        profileBtn.click();
    }
}
