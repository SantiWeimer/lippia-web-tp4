package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class ShopSteps extends PageSteps {

    @Given("The client is in google page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When( "El usuario hace click en el boton Shop menu" )
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }

    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {
        ShopService.verifyPage();
    }
}
