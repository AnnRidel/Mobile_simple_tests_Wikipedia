package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static io.appium.java_client.MobileBy.AccessibilityId;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {

    @Tag("selenide_android")
    @Test
    @DisplayName("Check Onboarding Windows Test")
    void checkOnboardingWindowsTest() {

        step("Page should have text 'The Free Encyclopedia …in over 300 languages'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Tap 'Continue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Page should have text 'New ways to explore'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("New ways to explore"));
        });

        step("Tap 'Continue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Page should have text 'Reading lists with sync'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Reading lists with sync"));
        });

        step("Tap 'Continue'", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Page should have text 'Send anonymous data'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/primaryTextView"))
                    .shouldHave(text("Send anonymous data"));
        });
    }

    @Tag("selenide_android")
    @Test
    @DisplayName("Search on Wikipedia test")
    void wikiSearchTest() {

        step("If opened onboarding page - tap 'Back' button", () -> {
            if ($(MobileBy.id("org.wikipedia.alpha:id/view_onboarding_page_indicator")).isDisplayed()) {
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_skip_button")).click();
            }
        });

        step("Tap 'Search Wikipedia'", () -> $(AccessibilityId("Search Wikipedia")).click());

        step("Type 'MobileBrowserstack'", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/search_src_text")).setValue("MobileBrowserstack");
        });

        step("Verify success search", () -> {
            $$(MobileBy.id("org.wikipedia.alpha:id/page_list_item_title")).shouldHave(sizeGreaterThan(0));
        });
    }

}