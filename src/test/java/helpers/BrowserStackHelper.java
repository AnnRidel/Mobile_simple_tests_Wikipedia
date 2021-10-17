package helpers;

import java.net.MalformedURLException;
import java.net.URL;

import static config.ProjectData.browserStackConfig;
import static io.restassured.RestAssured.given;

public class BrowserStackHelper {
    public static URL getBrowserstackUrl() {
        try {
            return new URL(String.format(browserStackConfig.browserStackURL(), browserStackConfig.browserStackUsername(),
                    browserStackConfig.browserStackPassword()));
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getBrowserstackVideoUrl(String sessionId) {
        String video_url = given()
                .auth().basic(browserStackConfig.browserStackUsername(), browserStackConfig.browserStackPassword())
                .when()
                .get("https://api-cloud.browserstack.com/app-automate/sessions/" + sessionId + ".json")
                .then()
                .statusCode(200)
                .extract()
                .response()
                .path("automation_session.video_url");

        System.out.println("video_url: " + video_url);
        return video_url;
    }
}