package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.*;

public class CheckoutSteps {

    @When("El usuario completa los datos de facturación")
    public void completePersonalInformation() {
        CheckoutService.completePersonalInformation();
    }

    @When("El usuario hace click en el boton Place order")
    public void placeOrderButton() {
        CheckoutService.tapPlaceOrderButton();
    }

    @When("El usuario cambia su ubicación a (.*)$")
    public void ChangeCountry(String country) {
        CheckoutService.changeCountry(country);
    }

    @Then("El usuario visualiza la pagina de checkout correctamente")
    public void comprobateCheckoutContent() {
        CheckoutService.comprobateCheckoutContent();
        CheckoutService.comprobateCoupon();
    }

    @Then("El usuario puede completar los datos de facturación")
    public void comprobateCompletePersonalInformation() {
        CheckoutService.completePersonalInformation();
    }

    @Then("El usuario visualiza el tax correspondiente a su pais")
    public void comprobateTaxes() {
        CheckoutService.comprobateTaxes();
    }

}
