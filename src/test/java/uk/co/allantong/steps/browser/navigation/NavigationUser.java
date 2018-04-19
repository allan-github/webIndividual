package uk.co.allantong.steps.browser.navigation;

import net.thucydides.core.annotations.Step;
import static org.assertj.core.api.Assertions.assertThat;

import uk.co.allantong.models.browser.MenusModel;
import uk.co.allantong.interfaces.common.CurrentPage;
import uk.co.allantong.interfaces.common.HomePage;
import uk.co.allantong.interfaces.common.NavigationBar;


public class NavigationUser {

    HomePage homePage;
    CurrentPage currentPage;
    NavigationBar navigationBar;

    @Step
    public void isOnTheHomePage() {
        homePage.open();
    }

    @Step
    public void shouldSeeThePageTitleContaining(String expectedTitle) {
        assertThat(currentPage.getTitle()).containsIgnoringCase(expectedTitle);
    }

    @Step
    public void navigatesTo(MenusModel menuTitle) {
        navigationBar.selectMenu(menuTitle);
    }
}
