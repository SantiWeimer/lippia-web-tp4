package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static com.crowdar.core.actions.WebActionManager.navigateTo;
import static lippia.web.constants.MyAccountConstants.LOGIN_ERROR_TEXT;
import static lippia.web.constants.SuperiorNavigationBarConstants.*;
import static lippia.web.constants.ProductConstants.*;


public class SuperiorBarNavigationBarService extends ActionManager {


    public static void tapMenuButton(String button) {

        switch (button)
        {
            case "Shop":
                WebActionManager.click( SHOP_MENU_BUTTON );
                break;
            case "Home":
                WebActionManager.click( HOME_MENU_BUTTON );
                break;
            case "My Account":
                WebActionManager.click( MY_ACCOUNT_MENU_BUTTON );
                break;
            case "Basket":
                WebActionManager.click( BASKET_MENU_BUTTON );
                break;

        }
    }

    public static void comprobateBasketMenu() {

        Assert.assertEquals(WebActionManager.getElement(BOOK_PRICE_TEXT).getText(), WebActionManager.getElement(BASKET_MENU_PRICE_TEXT).getText());
    }


}
