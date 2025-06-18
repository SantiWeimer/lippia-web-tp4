package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class SuperiorBarNavigationBarSteps {

    @When( "El usuario hace click en el boton del menu (.*)$" )
    public void tapOnMenuButton(String buttonName) {
        SuperiorBarNavigationBarService.tapMenuButton(buttonName);
    }

}
