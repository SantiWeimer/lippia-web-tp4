package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.MyAccountService;
import lippia.web.services.SuperiorBarNavigationBarService;

public class RegisterSteps {

    @When("El usuario ingresa el email de registro (.*)$")
    public void enterUser(String email) {
        MyAccountService.enterRegisterEmailCriteria(email);
    }

    @When("El usuario ingresa la contraseña de registro (.*)$")
    public void enterPass(String pass) {
        MyAccountService.enterRegisterPassCriteria(pass);
    }

    @When("El usuario hace click en el boton Register")
    public void pressRegisterButton() {
        MyAccountService.tapRegisterButton();
    }

    @Then("El usuario no puede registrarse y la pagina le indica el error: (.*)$")
    public void showError(String error) {
        MyAccountService.showError(error);
    }
}
