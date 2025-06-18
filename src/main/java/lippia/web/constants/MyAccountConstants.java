package lippia.web.constants;

public class MyAccountConstants {

    //LOGIN
    public static final String INPUT_PASS_XPATH = "xpath://*[@id='password']";
    public static final String INPUT_USER_XPATH = "xpath://*[@id='username']";
    public static final String LOGIN_BUTTON = "xpath://*[@id='customer_login']/div[1]/form/p[3]/input[3]";
    public static final String LOGIN_ERROR_TEXT = "xpath://*[@id='page-36']/div/div[1]/ul/li";

    //REGISTER
    public static final String INPUT_REGISTER_PASS_XPATH = "xpath://*[@id='reg_password']";
    public static final String INPUT_REGISTER_EMAIL_XPATH = "xpath://*[@id='reg_email']";
    public static final String REGISTER_BUTTON = "xpath://*[@id='customer_login']/div[2]/form/p[3]/input[3]";

    //DASHBOARD
    public static final String MYACCOUNT_DASHBOARD_USER = "xpath://*[@id='page-36']/div/div[1]/div/p[1]/strong";

    //ORDERS
    public static final String ORDERS_BUTTON = "xpath://*[@id='page-36']/div/div[1]/nav/ul/li[2]/a";
    public static final String ORDERS_CONTENT = "xpath://*[@id='page-36']/div/div[1]/div";

    //ACCOUNT DETAILS
    public static final String ACCOUNT_DETAILS_BUTTON = "xpath://*[@id='page-36']/div/div[1]/nav/ul/li[5]/a";
    public static final String ACCOUNT_DETAILS_CONTENT = "xpath://*[@id='page-36']/div/div[1]/div/form";

    //LOGOUT
    public static final String LOGOUT_BUTTON = "xpath://*[@id='page-36']/div/div[1]/nav/ul/li[6]/a";






}
