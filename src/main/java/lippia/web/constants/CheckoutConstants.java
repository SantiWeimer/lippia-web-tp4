package lippia.web.constants;

public class CheckoutConstants {

    public static final String BILLING_DETAILS_CONTENT = "xpath://*[@id='customer_details']/div[1]/div[1]";
    public static final String ADDITIONAL_INFORMATION_CONTENT = "xpath://*[@id='customer_details']/div[2]";
    public static final String ORDER_CONTENT = "xpath://*[@id='order_review']/table";
    public static final String PAYMENT_METHOD_CONTENT = "xpath://*[@id='payment']";

    public static final String COUPON_BUTTON = "xpath://*[@id='page-35']/div/div[1]/div/a";
    public static final String COUPON_CONTENT = "xpath://*[@id='page-35']/div/div[1]/form[1]";

    public static final String INPUT_FIRST_NAME = "xpath://*[@id='billing_first_name']";
    public static final String INPUT_LAST_NAME = "xpath://*[@id='billing_last_name']";
    public static final String INPUT_EMAIL = "xpath://*[@id='billing_email']";
    public static final String INPUT_PHONE = "xpath://*[@id='billing_phone']";
    public static final String INPUT_ADRESS = "xpath://*[@id='billing_address_1']";
    public static final String INPUT_CITY = "xpath://*[@id='billing_city']";
    public static final String INPUT_POSTCODE = "xpath://*[@id='billing_postcode']";

    public static final String PLACE_ORDER_BUTTON = "xpath://*[@id='place_order']";
}
