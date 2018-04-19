package uk.co.allantong.interfaces.common;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import uk.co.allantong.models.browser.MenusModel;

public class NavigationBar extends PageObject {

    public void selectMenu(MenusModel menuTitle) {
        find(By.partialLinkText(menuTitle.name())).click();
    }
}
