package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.MyAccountConstants.*;

public class MyAccountService {

    //public static void naviToMyAccountPage() { WebActionManager.navigateTo(PropertyManager.getProperty("https://practice.automationtesting.in/my-account/"));}

    public static void tapLoginButton() {
        WebActionManager.click( LOGIN_BUTTON );
    }

    public static void enterUserCriteria(String text) {
        WebActionManager.setInput(INPUT_USER_XPATH, text);
    }

    public static void enterPassCriteria(String text) {
        WebActionManager.setInput(INPUT_PASS_XPATH, text);
    }

    public static void comprobateUser(String user) {
        Assert.assertTrue(Objects.equals(WebActionManager.getElement(MYACCOUNT_DASHBOARD_USER).getText(), user));
    }

    public static void showError(String error) {
        Assert.assertTrue(Objects.equals(WebActionManager.getElement(LOGIN_ERROR_TEXT).getText(), error));
    }

    public static void tapOrdersButton() {
        WebActionManager.click( ORDERS_BUTTON );
    }

    public static void comprobateOrdersContent() {
        WebActionManager.isVisible( ORDERS_CONTENT );
    }

    public static void tapLogoutButton() {
        WebActionManager.click( LOGOUT_BUTTON );
    }

    public static void comprobateLogout() {
        WebActionManager.isVisible( LOGIN_BUTTON );
    }
}
