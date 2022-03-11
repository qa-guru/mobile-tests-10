package drivers;

import com.codeborne.selenide.WebDriverProvider;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackMobileDriver implements WebDriverProvider {

    public static URL getBrowserstackUrl() {
        try {
            return new URL("https://hub.browserstack.com/wd/hub");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(Capabilities capabilities) {
        UiAutomator2Options options = new UiAutomator2Options();
        options.merge(capabilities);
        options.setCapability("browserstack.appium_version", "1.8.0");
        options.setCapability("browserstack.user", "tpuretest_lSVWc2");
        options.setCapability("browserstack.key", "Ggd5nW19cyeGseGGn2m6");
        options.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
        options.setCapability("device", "Google Pixel 3");
        options.setCapability("os_version", "9.0");
        options.setCapability("project", "First Java Project");
        options.setCapability("build", "browserstack-build-1");
        options.setCapability("name", "first_test");

        return new AndroidDriver(getBrowserstackUrl(), options);
    }
}