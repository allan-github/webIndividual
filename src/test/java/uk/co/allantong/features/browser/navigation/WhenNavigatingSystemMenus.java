package uk.co.allantong.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.*;
import org.junit.Ignore;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import uk.co.allantong.models.Menus;
import uk.co.allantong.steps.navigation.NavigationUser;

@RunWith(SerenityRunner.class)
public class WhenNavigatingSystemMenus {

    @Steps
    NavigationUser anyOne;

    @Steps
    NavigationUser authenticatedUser;

    @Managed(driver="chrome")
    WebDriver browser;

    @Test
    @WithTags ({
        @WithTag(name="Reporting"),
        @WithTag(type="release", name="sprint-2")
    })
    public void shouldBeAbleToNavigateToHome() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.Home);

        // Then
        anyOne.shouldSeeThePageTitleContaining("Home Page");
    }

    @Test
    public void shouldNotBeAbleToNavigateToStudents() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.Students);

        // Then
        anyOne.shouldSeeThePageTitleContaining("Students");
    }

    @Test
    @Pending
    public void shouldBeAbleToNavigateToStudents() {
        // Given
        authenticatedUser.isOnTheHomePage();

        // When
        authenticatedUser.navigatesTo(Menus.Students);

        // Then
        authenticatedUser.shouldSeeThePageTitleContaining("Login");
    }

    @Test
    public void shouldBeAbleToNavigateToAbout() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.About);

        // Then
        anyOne.shouldSeeThePageTitleContaining("About");
    }

    @Test
    public void shouldBeAbleToNavigateToContact() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.Contact);

        // Then
        anyOne.shouldSeeThePageTitleContaining("Contact");
    }

    @Test
    public void shouldBeAbleToNavigateToRegister() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.Register);

        // Then
        anyOne.shouldSeeThePageTitleContaining("Register");
    }


    @Test
    public void shouldBeAbleToNavigateToLogin() {
        // Given
        anyOne.isOnTheHomePage();

        // When
        anyOne.navigatesTo(Menus.Log);

        // Then
        anyOne.shouldSeeThePageTitleContaining("Login");
    }


    @Test
    @Ignore
    public void ThisJustDemonstratesTheIgnore() {}

}
