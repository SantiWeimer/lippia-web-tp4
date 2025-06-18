package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.CheckoutConstants.*;

public class CheckoutService {

    public static void comprobateCheckoutContent() {

        WebActionManager.isVisible( BILLING_DETAILS_CONTENT );
        WebActionManager.isVisible( ADDITIONAL_INFORMATION_CONTENT );
        WebActionManager.isVisible( ORDER_CONTENT );
        WebActionManager.isVisible( PAYMENT_METHOD_CONTENT );

    }

    public static void comprobateCoupon() {

        WebActionManager.click( COUPON_BUTTON, false);
        WebActionManager.isVisible( COUPON_CONTENT );

    }

    public static void completePersonalInformation() {

        WebActionManager.setInput(INPUT_FIRST_NAME, "Nombre");
        WebActionManager.setInput(INPUT_LAST_NAME, "Apellido");
        WebActionManager.setInput(INPUT_EMAIL, "email@gmail.com");
        WebActionManager.setInput(INPUT_PHONE, "1234");
        WebActionManager.setInput(INPUT_ADRESS, "Direccion");
        WebActionManager.setInput(INPUT_CITY, "Ciudad");
        WebActionManager.setInput(INPUT_POSTCODE, "1000");

    }

    public static void tapPlaceOrderButton() {

        WebActionManager.click( PLACE_ORDER_BUTTON );

    }
}
