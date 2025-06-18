package lippia.web.services;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.core.actions.WebActionManager;
import org.testng.Assert;

import static lippia.web.constants.ShopConstants.*;

public class ShopService {


    public static void tapShopButton(String button) {

        switch (button)
        {
            case "Add to basket":
                WebActionManager.click( ADD_TO_BASKET_SHOP_BUTTON );
                break;
        }

    }


}
