package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.guru99.models.DataUser;
import demo.guru99.steps.LoginStep;
import net.thucydides.core.annotations.Steps;

import java.util.List;

// Clase que define los Step Definitions para las pruebas
public class LoginStepDefinitions {

    // Inyección de la instancia LoginSteps mediante la anotación @Steps de SerenityBDD
    @Steps
    LoginStep loginStep;
    @Given("^that I am on the page Guru99 Demo$")
    public void thatIAmOnThePageGuruDemo() {
        loginStep.openBrouser(); // Abre el navegador y carga la página
    }

    @When("^entered yuor user and Password$")
    public void enteredYuorUserAndPassword(List<DataUser> data) {

        // Se obtiene el primer usuario de la lista y se ingresan sus datos
       // loginStep.writeUser(data.get(0).getTxtUser());
        //loginStep.writePass(data.get(0).getTxtPass());
        loginStep.clicLogin();
    }

    @Then("^view the message$")
    public void viewTheMessage(List<DataUser> data) {
        loginStep.validatonMessage(data.get(0).getTxtMessage()); // Se verifica que el mensaje mostrado coincide con el esperado
    }
}
