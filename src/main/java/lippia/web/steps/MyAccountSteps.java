package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class MyAccountSteps extends PageSteps {

    @When("El usuario hace click en My Account")
    public void accountMenu() {
        SuperiorBarNavigationBarService.tapMyAccountMenu();
    }

    //ORDERS
    @When("El usuario hace click en el boton Orders")
    public void pressOrdersButton() {
        MyAccountService.tapOrdersButton();
    }

    @Then("El usuario es redirigido al Orders de My Account donde visualiza sus pedidos")
    public void comprobateOrdersContent() {
        MyAccountService.comprobateOrdersContent();
    }

    //LOGOUT
    @When("El usuario hace click en el boton Logout")
    public void pressLogoutButton() {
        MyAccountService.tapLogoutButton();
    }

    @Then("El usuario es redirigido al inicio de sesion")
    public void comprobateLogout() {
        MyAccountService.comprobateLogout();
    }


}
