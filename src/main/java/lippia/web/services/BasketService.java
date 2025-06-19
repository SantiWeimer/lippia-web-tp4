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
    }

    public static void compareTotalsContent() {

        int subtotal = (int) Double.parseDouble(
                WebActionManager.getElement(BASKET_SUBTOTALS_TEXT).getText().replaceAll("[^\\d.]", "")
        );
        int total = (int) Double.parseDouble(
                WebActionManager.getElement(BASKET_TOTAL_TEXT).getText().replaceAll("[^\\d.]", "")
        );

        Assert.assertTrue(subtotal < total);
    }

    public static void tapProceedToCheckoutButton() {
        WebActionManager.click( PROCEED_TO_CHECKOUT_BUTTON );
    }
}
