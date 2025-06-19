package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.*;

public class OrderSteps {

    @Then("El usuario realiza la compra correctamente")
    public void comprobateOrderContent() {
        OrderService.comprobateOrderContent();
    }

}
