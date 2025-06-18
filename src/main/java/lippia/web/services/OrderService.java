package lippia.web.services;
import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.PracticeHomeConstants;
import org.testng.Assert;

import java.util.Objects;

import static lippia.web.constants.OrderConstants.*;

public class OrderService {

    public static void comprobateOrderContent() {
        WebActionManager.isVisible( ORDER_CONTENT );
    }
}
