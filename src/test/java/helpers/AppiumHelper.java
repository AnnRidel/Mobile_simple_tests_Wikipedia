package helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.appiumConfig;

public class AppiumHelper {
    public static URL getAppiumServerUrl() {
        try {
            return new URL(appiumConfig.appiumServerUrl());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }
}