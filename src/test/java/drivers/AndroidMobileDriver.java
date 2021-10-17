package drivers;

import com.codeborne.selenide.WebDriverProvider;
import config.DeviceHost;
import helpers.AppiumHelper;
import helpers.BrowserStackHelper;
import helpers.SelenoidHelper;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import javax.annotation.Nonnull;

import static config.ProjectData.*;

public class AndroidMobileDriver implements WebDriverProvider {
    @Nonnull
    @Override
    public WebDriver createDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        if (deviceHost().equals(DeviceHost.BROWSER_STACK)) {
            return getBrowserStackMobileDriver(desiredCapabilities);
        }

        if (deviceHost().equals(DeviceHost.APPIUM)) {
            return getAppiumMobileDriver(desiredCapabilities);
        }

        return getSelenoidMobileDriver(desiredCapabilities);
    }

    public AndroidDriver<WebElement> getAppiumMobileDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", appiumConfig.platformName());
        desiredCapabilities.setCapability("deviceName", appiumConfig.deviceName());
        desiredCapabilities.setCapability("version", appiumConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app", appiumConfig.appURL());

        return new AndroidDriver<>(AppiumHelper.getAppiumServerUrl(), desiredCapabilities);
    }

    public AndroidDriver<WebElement> getSelenoidMobileDriver(@Nonnull DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("platformName", selenoidConfig.platformName());
        desiredCapabilities.setCapability("deviceName", selenoidConfig.deviceName());
        desiredCapabilities.setCapability("version", selenoidConfig.version());
        desiredCapabilities.setCapability("locale", "en");
        desiredCapabilities.setCapability("language", "en");
        desiredCapabilities.setCapability("appPackage", "org.wikipedia.alpha");
        desiredCapabilities.setCapability("appActivity", "org.wikipedia.main.MainActivity");
        desiredCapabilities.setCapability("app", selenoidConfig.appURL());

        desiredCapabilities.setCapability("enableVNC", true);
        desiredCapabilities.setCapability("enableVideo", true);

        return new AndroidDriver<>(SelenoidHelper.getSelenoidServerUrl(), desiredCapabilities);
    }

    public AndroidDriver<WebElement> getBrowserStackMobileDriver(DesiredCapabilities desiredCapabilities) {
        desiredCapabilities.setCapability("browserstack.user", browserStackConfig.browserStackUsername());
        desiredCapabilities.setCapability("browserstack.key", browserStackConfig.browserStackPassword());

        desiredCapabilities.setCapability("project", "First Java Project");
        desiredCapabilities.setCapability("build", "Android");
        desiredCapabilities.setCapability("name", "Java Android");
        desiredCapabilities.setCapability("autoGrantPermissions", "true");

        desiredCapabilities.setCapability("device", browserStackConfig.device());
        desiredCapabilities.setCapability("os_version", browserStackConfig.os_version());
        desiredCapabilities.setCapability("app", browserStackConfig.app());

        return new AndroidDriver<>(BrowserStackHelper.getBrowserstackUrl(), desiredCapabilities);
    }
}