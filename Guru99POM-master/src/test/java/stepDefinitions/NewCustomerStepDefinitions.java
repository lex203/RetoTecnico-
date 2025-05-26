package stepDefinitions;


import cucumber.api.java.en.When;
import demo.guru99.models.DataCustomer;
import demo.guru99.steps.NewCustomerStep;
import demo.guru99.utils.JsonReaderCustomer;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class NewCustomerStepDefinitions {

    @Steps
    NewCustomerStep newCustomerStep;

    List<DataCustomer> customers;

    public NewCustomerStepDefinitions() {
        customers = JsonReaderCustomer.readCustomers("src/test/resources/data/customer.json");
    }

    @When("^entered the form data manually$")
    public void enteredTheFormDataManually() {
        newCustomerStep.clicbtnNew();

        customers.forEach(customer -> {
            newCustomerStep.setTxtCustomer(customer.getName());
            newCustomerStep.selectGender(customer.getGender());
            newCustomerStep.setTxtDob(customer.getDod());
            newCustomerStep.setTxtAddress(customer.getAddress());
            newCustomerStep.setTxtCity(customer.getCity());
            newCustomerStep.setTxtState(customer.getState());
            newCustomerStep.setTxtPin(customer.getPin());
            newCustomerStep.setTxtMobile(customer.getMobile());
            newCustomerStep.setTxtEmail(customer.getEmail());
            newCustomerStep.setTxtPassword(customer.getPassword());
            newCustomerStep.clicBtnSubmit();
            newCustomerStep.validatonMessage("Customer Registered Successfully!!!");

        });
    }
}