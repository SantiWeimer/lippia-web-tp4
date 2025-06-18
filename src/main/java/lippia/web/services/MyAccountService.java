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
        WebActionManager.click( LOGIN_BUTTON, false);
    }
    public static void tapRegisterButton() {
        WebActionManager.click( REGISTER_BUTTON, false);
    }

    public static void enterUserCriteria(String text) {
        WebActionManager.setInput(INPUT_USER_XPATH, text);
    }

    public static void enterPassCriteria(String text) {
        WebActionManager.setInput(INPUT_PASS_XPATH, text);
    }

    public static void enterRegisterEmailCriteria(String text) {
        WebActionManager.setInput(INPUT_REGISTER_EMAIL_XPATH, text);
    }

    public static void enterRegisterPassCriteria(String text) {
        WebActionManager.setInput(INPUT_REGISTER_PASS_XPATH, text);
    }

    public static void comprobateUser(String user) {
        Assert.assertTrue(Objects.equals(WebActionManager.getElement(MYACCOUNT_DASHBOARD_USER).getText(), user));
    }


    public static void showError(String error) {
        Assert.assertEquals(error, WebActionManager.getElement(LOGIN_ERROR_TEXT).getText());
    }

    public static void tapOrdersButton() {
        WebActionManager.click( ORDERS_BUTTON, false);
    }

    public static void comprobateOrdersContent() {
        WebActionManager.isVisible( ORDERS_CONTENT );
    }

    public static void tapAccountDetailsButton() {
        WebActionManager.click( ACCOUNT_DETAILS_BUTTON, false);
    }

    public static void comprobateAccountDetailsContent() {
        WebActionManager.isVisible( ACCOUNT_DETAILS_CONTENT );
    }

    public static void tapLogoutButton() {
        WebActionManager.click( LOGOUT_BUTTON, false);
    }

    public static void comprobateLogout() {
        WebActionManager.isVisible( LOGIN_BUTTON );
    }


}
