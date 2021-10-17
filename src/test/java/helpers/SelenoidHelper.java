package helpers;

import config.ProjectData;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.selenoidConfig;

public class SelenoidHelper {
    public static URL getSelenoidServerUrl() {
        try {
            return new URL(String.format(selenoidConfig.selenoidServerUrl(),
                    selenoidConfig.appiumServerUser(),
                    selenoidConfig.appiumServerPassword()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getSelenoidVideoUrl(String sessionId) {
        return ProjectData.selenoidConfig.videoStorage() + sessionId + ".mp4";
    }
}