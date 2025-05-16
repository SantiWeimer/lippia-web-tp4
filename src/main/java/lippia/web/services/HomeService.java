package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.SuperiorNavigationBarConstants.HOME_MENU_BUTTON;


public class HomeService {

    public static void naviToLandingPage() { WebActionManager.navigateTo(PropertyManager.getProperty("web.base.url"));}

    public static void checkSliders(int qSliders) {
        Assert.assertTrue(WebActionManager.getElements(PracticeHomeConstants.CONTAINER_SLIDERS).size() == qSliders);
    }

    public static void checkArrivals(int qArrivals) {
        Assert.assertTrue(WebActionManager.getElements(PracticeHomeConstants.CONTAINER_ARRIVALS).size() == qArrivals);
    }

    public static void clickArrival() {
        WebActionManager.click( PracticeHomeConstants.FIRST_ARRIVAL_XPATH );
    }

    public static void arrivalCheckPage(String arrivalName) {
        Assert.assertTrue(Objects.equals(WebActionManager.getElement(PracticeHomeConstants.FIRST_ARRIVAL_NAME).getText(), arrivalName));
    }
}
