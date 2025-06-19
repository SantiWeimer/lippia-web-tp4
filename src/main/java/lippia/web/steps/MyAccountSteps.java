package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class MyAccountSteps extends PageSteps {


    //ORDERS
    @When("El usuario hace click en el boton Orders")
    public void pressOrdersButton() {
        MyAccountService.tapOrdersButton();
    }

    @Then("El usuario es redirigido al Orders de My Account donde visualiza sus pedidos")
    public void comprobateOrdersContent() {
        MyAccountService.comprobateOrdersContent();
    }

    //ACCOUNT DETAILS
    @When("El usuario hace click en el boton Account Details")
    public void pressAccountDetailsButton() {
        MyAccountService.tapAccountDetailsButton();
    }

    @Then("El usuario puede ver los detalles de su cuenta y cambiar su contraseña")
    public void comprobateAccountDetailsContent() {
        MyAccountService.comprobateAccountDetailsContent();
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

    @Then("El usuario es redirigido al dashboard de My Account donde se muestra su usuario (.*)$")
    public void userLogged(String user) {
        MyAccountService.comprobateUser(user);
    }



}
