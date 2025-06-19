package lippia.web.steps;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import lippia.web.services.*;

public class BrowserSteps {
    @When("El usuario hace click en el boton atras del navegador")
    public void pressBackButton() {
        BrowserService.backButton();
    }
}
