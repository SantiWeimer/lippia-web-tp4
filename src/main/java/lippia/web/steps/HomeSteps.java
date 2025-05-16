package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.HomeService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class HomeSteps extends PageSteps {

    @Given("The client is in landing page")
    public void home() {
        HomeService.naviToLandingPage();
    }

    @When("El usuario hace click en el boton Home menu")
    public void homeMenuButton() {
        SuperiorBarNavigationBarService.tapHomeMenu();
    }

    @When("El usuario hace click en el boton del arrival (.*)$")
    public void arrivalButton() {
        HomeService.clickArrival();
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

}
