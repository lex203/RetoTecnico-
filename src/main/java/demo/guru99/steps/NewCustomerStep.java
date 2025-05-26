package demo.guru99.steps;

import demo.guru99.pageObjects.NewCustomerPage;
import net.thucydides.core.annotations.Step;

public class NewCustomerStep {
        NewCustomerPage newCustomerPage;

        @Step("Crear nuevo usuario")
        public void clicbtnNew() {
        newCustomerPage.clicbtnNew();
        }

        @Step("Ingresar el nombre del cliente")
        public void setTxtCustomer(String customer) {
            newCustomerPage.setTxtCustomer(customer);
        }

        @Step("Seleccionar el género")
        public void selectGender(String gender) {
            newCustomerPage.selectGender(gender);
        }

        @Step("Ingresar fecha")
        public void setTxtDob(String dob){
            newCustomerPage.setTxtDob(dob);
        }

        @Step("Ingresar dirección")
        public void setTxtAddress(String address) {
            newCustomerPage.setTxtAddress(address);
        }

        @Step("Ingresar ciudad")
        public void setTxtCity(String city) {
            newCustomerPage.setTxtCity(city);
        }

        @Step("Ingresar estado")
        public void setTxtState(String state) {
            newCustomerPage.setTxtState(state);
        }

        @Step("Ingresar código PIN")
        public void setTxtPin(String pin) {
            newCustomerPage.setTxtPin(pin);
        }

        @Step("Ingresar número de móvil")
        public void setTxtMobile(String mobile) {
            newCustomerPage.setTxtMobile(mobile);
        }

        @Step("Ingresar correo electrónico")
        public void setTxtEmail(String email) {
            newCustomerPage.setTxtEmail(email);
        }

        @Step("Ingresar contraseña")
        public void setTxtPassword(String password) {
            newCustomerPage.setTxtPassword(password);
        }

        @Step("Enviar formulario")
        public void clicBtnSubmit() {
            newCustomerPage.clicBtnSubmit();
        }

    @Step
    public void validatonMessage(String expectedMessage){
        String messageObtained = newCustomerPage.getMessage();

        assert messageObtained.contains(expectedMessage)
                : "Expected message does not match. Expected: " + expectedMessage + ", but it was: " + messageObtained;
    }



}

