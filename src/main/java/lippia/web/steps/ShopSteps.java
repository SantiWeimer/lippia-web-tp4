package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

    @When( "El usuario hace click en el boton del shop (.*)$" )
    public void tapOnShopButton(String buttonName) {
        ShopService.tapShopButton(buttonName);
    }

}
