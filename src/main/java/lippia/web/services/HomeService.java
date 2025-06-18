package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.PracticeHomeConstants.*;

import static lippia.web.constants.SuperiorNavigationBarConstants.HOME_MENU_BUTTON;


public class HomeService {

    public static void naviToLandingPage() { WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));}

    public static void checkSliders(int qSliders) {
        Assert.assertTrue(WebActionManager.getElements( CONTAINER_SLIDERS ).size() == qSliders);
    }

    public static void checkArrivals(int qArrivals) {
        Assert.assertEquals(qArrivals, WebActionManager.getElements( CONTAINER_ARRIVALS ).size());
    }

    public static void clickArrival() {
        WebActionManager.click( FIRST_ARRIVAL_IMAGE );
    }

    public static void tapAddToBasketButton() {
        WebActionManager.click( ADD_TO_BASKET_BUTTON, false);
    }

    public static void arrivalCheckPage(String arrivalName) {
        Assert.assertTrue(Objects.equals(WebActionManager.getElement( FIRST_ARRIVAL_NAME ).getText(), arrivalName));
    }
}
