package config;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "classpath:config/browser_stack.properties"
})
public interface BrowserStackConfig extends Config {
    @Key("browserStackURL")
    String browserStackURL();

    @Key("browserStackUsername")
    String browserStackUsername();

    @Key("browserStackPassword")
    String browserStackPassword();

    @Key("app")
    String app();

    @Key("device")
    String device();

    @Key("os_version")
    String os_version();
}