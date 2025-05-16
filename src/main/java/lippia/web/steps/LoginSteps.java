package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class LoginSteps extends PageSteps {

    @Given("El usuario se encuentra en la landing page")
    public void home() {
        HomeService.naviToLandingPage();
    }

    @When("El usuario ingresa su usuario (.*)$")
    public void enterUser(String user) {
        MyAccountService.enterUserCriteria(user);
    }

    @When("El usuario ingresa su contraseña (.*)$")
    public void enterPass(String pass) {
        MyAccountService.enterPassCriteria(pass);
    }

    @When("El usuario hace click en el boton Login")
    public void pressLoginButton() {
        MyAccountService.tapLoginButton();
    }

    @Then("El usuario es redirigido al dashboard de My Account donde se muestra su usuario (.*)$")
    public void userLogged(String user) {
        MyAccountService.comprobateUser(user);
    }

    @Then("El usuario no puede ingresar y la pagina le indica el error: (.*)$")
    public void showError(String error) {
        MyAccountService.showError(error);
    }




}