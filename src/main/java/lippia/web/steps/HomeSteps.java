package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.*;

public class HomeSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        HomeService.naviToLandingPage();
    }


    @When("El usuario hace click en el boton del primer arrival")
    public void arrivalButton() {
        HomeService.checkArrivals(3);
        HomeService.clickArrival();
    }

    @When("El usuario hace click en el boton Add to basket")
    public void addToBasketButton() {
        HomeService.tapAddToBasketButton();
        SuperiorBarNavigationBarService.comprobateBasketMenu();
    }

    @When("El usuario hace click en el boton Proceed to checkout")
    public void proceedToCheckoutButton() {
        BasketService.comprobateBasketTotalsContent();
        BasketService.tapProceedToCheckoutButton();
    }

    @When("El usuario completa los datos de facturación")
    public void completePersonalInformation() {
        CheckoutService.completePersonalInformation();
    }

    @When("El usuario hace click en el boton Place order")
    public void placeOrderButton() {
        CheckoutService.tapPlaceOrderButton();
    }



    @Then("El usuario es redirigido hacia la pagina de compra de (.*)$")
    public void arrivalCheckPage(String arrivalName) {
        HomeService.arrivalCheckPage(arrivalName);
    }

    @Then("El usuario visualiza solo '(.*)' sliders")
    public void checkSliders(int qSliders) {
        HomeService.checkSliders(qSliders);
    }

    @Then("El usuario visualiza solo '(.*)' arrivals")
    public void checkArrivals(int qArrivals) {
        HomeService.checkArrivals(qArrivals);
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

    @Then("El usuario realiza la compra correctamente")
    public void comprobateOrderContent() {
        OrderService.comprobateOrderContent();
    }

}
