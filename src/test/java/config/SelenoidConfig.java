package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/selenoid.properties"
})
public interface SelenoidConfig extends Config {
    @Key("selenoid.server.url")
    String selenoidServerUrl();

    @Key("platform.name")
    String platformName();

    @Key("device.name")
    String deviceName();

    @Key("version")
    String version();

    @Key("app.url")
    String appURL();

    @Key("video.storage")
    String videoStorage();

    @Key("username")
    String appiumServerUser();

    @Key("password")
    String appiumServerPassword();
}