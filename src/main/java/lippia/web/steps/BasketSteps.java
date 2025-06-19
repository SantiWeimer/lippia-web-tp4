package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.*;

public class BasketSteps {

    @When("El usuario hace click en el boton Proceed to checkout")
    public void proceedToCheckoutButton() {

        BasketService.comprobateBasketTotalsContent();
        BasketService.compareTotalsContent();
        BasketService.tapProceedToCheckoutButton();
    }

}
