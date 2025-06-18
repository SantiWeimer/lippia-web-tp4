package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.BasketConstants.*;

public class BasketService {

    public static void comprobateBasketTotalsContent() {
        Assert.assertEquals(WebActionManager.getElements( BASKET_TOTALS_CONTENT ).size(), 3);
        WebActionManager.isVisible( BASKET_SUBTOTALS_TEXT );
        WebActionManager.isVisible( BASKET_TOTAL_TEXT );
        Assert.assertNotEquals(WebActionManager.getElement( BASKET_SUBTOTALS_TEXT ).getText(), WebActionManager.getElement( BASKET_TOTAL_TEXT ).getText());
        //Assert.assertTrue(Integer.parseInt(WebActionManager.getElement( BASKET_SUBTOTALS_TEXT ).getText()) > Integer.parseInt(WebActionManager.getElement( BASKET_TOTAL_TEXT ).getText()));

    }

    public static void tapProceedToCheckoutButton() {
        WebActionManager.click( PROCEED_TO_CHECKOUT_BUTTON );
    }
}
