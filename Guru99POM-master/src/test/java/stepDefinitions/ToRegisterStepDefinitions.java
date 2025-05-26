package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import demo.guru99.models.DataUser;
import demo.guru99.steps.LoginStep;
import demo.guru99.utils.JsonReader;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class ToRegisterStepDefinitions {
    @Steps
    LoginStep loginStep;
    List<DataUser>dataUsers = JsonReader.dataUsers("src/test/resources/data/user.json");
    @Given("^that I am on the page GuruBank$")
    public void that_I_am_on_the_page_GuruBank() {
        loginStep.openBrouser();

    }


    @And("^entered your user and password$")
    public void entered_your_user_and_password() {
        loginStep.writeUsers(dataUsers.get(0));

        loginStep.clicLogin();




    }

    @When("^entered the form data$")
    public void entered_the_form_data() {

    }

    @Then("^Validate the message from Customer Registered Successfully !!!$")
    public void validate_the_message_from_Customer_Registered_Successfully() {
    }

}
