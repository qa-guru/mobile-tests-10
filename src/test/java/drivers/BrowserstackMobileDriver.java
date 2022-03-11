package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobilePlatform;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.openqa.selenium.Platform.ANDROID;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl() {
        try {
            return new URL("http://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        MutableCapabilities capabilities1 = new MutableCapabilities();
        capabilities1.setCapability("browserstack.user", "tpuretest_lSVWc2");

//        capabilities1.merge(capabilities);
//        capabilities1.setCapability("browserstack.appium_version", "1.8.0");
        capabilities1.setCapability("browserstack.user", "tpuretest_lSVWc2");
        capabilities1.setCapability("browserstack.key", "Ggd5nW19cyeGseGGn2m6");
        capabilities1.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        capabilities1.setCapability("device", "Google Pixel 3");
        capabilities1.setCapability("os_version", "9.0");
        capabilities1.setCapability("project", "First Java Project");
        capabilities1.setCapability("build", "browserstack-build-1");
        capabilities1.setCapability("name", "first_test");
        capabilities1.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
        capabilities1.setCapability("platformName", MobilePlatform.ANDROID);

        return new RemoteWebDriver(getBrowserstackUrl(), capabilities1);
    }
}