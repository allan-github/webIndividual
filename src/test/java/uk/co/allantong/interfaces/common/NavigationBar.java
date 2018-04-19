package uk.co.allantong.ui.common;

import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.pages.PageObject;
import uk.co.allantong.models.Menus;

public class NavigationBar extends PageObject {

    public void selectMenu(Menus menuTitle) {
        find(By.partialLinkText(menuTitle.name())).click();
    }
}
