package uk.co.allantong.features.navigation;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import uk.co.allantong.models.Menus;
import uk.co.allantong.steps.navigation.NavigationUser;

@RunWith(SerenityRunner.class)
public class WhenNavigationSystemMenus {

    @Steps
    NavigationUser anyone;

    @Steps
    NavigationUser authenticatedUser;

    @Managed
    WebDriver browser;

    @Test
    public void shouldBeAbleToNavigatedToHome() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.Home);

        // Then
        anyone.shouldSeeThePageTitleContaining("Home Page");
    }

    @Test
    public void shouldNotBeAbleToNavigatedToStudents() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.Students);

        // Then
        anyone.shouldSeeThePageTitleContaining("Students");
    }

    @Test
    public void shouldBeAbleToNavigatedToStudents() {
        // Given
        authenticatedUser.isOnTheHomePage();

        // When
        authenticatedUser.navigatesTo(Menus.Students);

        // Then
        authenticatedUser.shouldSeeThePageTitleContaining("Login");
    }

    @Test
    public void shouldBeAbleToNavigatedToAbout() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.About);

        // Then
        anyone.shouldSeeThePageTitleContaining("About");
    }

    @Test
    public void shouldBeAbleToNavigatedToContact() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.Contact);

        // Then
        anyone.shouldSeeThePageTitleContaining("Contact");
    }

    @Test
    public void shouldBeAbleToNavigatedToRegister() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.Register);

        // Then
        anyone.shouldSeeThePageTitleContaining("Register");
    }


    @Test
    public void shouldBeAbleToNavigatedToLogin() {
        // Given
        anyone.isOnTheHomePage();

        // When
        anyone.navigatesTo(Menus.Log);

        // Then
        anyone.shouldSeeThePageTitleContaining("Login");
    }
}
