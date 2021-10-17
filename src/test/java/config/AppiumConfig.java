package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/appium.properties"
})
public interface AppiumConfig extends Config {
    @Key("appium.server.url")
    String appiumServerUrl();

    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("version")
    String version();

    @Key("app.url")
    String appURL();
}