package demo.guru99.steps;

import demo.guru99.models.DataUser;
import demo.guru99.pageObjects.LoginPage;
import net.thucydides.core.annotations.Step;

// Clase que define los pasos para interactuar con la página de inicio de sesión
public class LoginStep {

    LoginPage loginPage = new LoginPage(); // Creación de una instancia de LoginPage para acceder a sus métodos

    // Paso para abrir el navegador y navegar a la URL definida en LoginPage
    @Step
    public void openBrouser(){loginPage.open();
    }

    // Paso para escribir el nombre de usuario
    @Step
    public void writeUsers(DataUser user){

        loginPage.setTextUser(user.getTxtUser());
        loginPage.setTextPass(user.getTxtPass());
    }

    // Paso para hacer clic en el botón
    @Step
    public void clicLogin(){
        loginPage.clicBtnLogin();
    }

    // Paso para validar que el mensaje
    @Step
    public void validatonMessage(String expectedMessage){
        String messageObtained = loginPage.getMessage();

        // Validación con una aserción: verifica si el mensaje obtenido contiene el mensaje esperado
        assert messageObtained.contains(expectedMessage)
                : "Expected message does not match. Expected: " + expectedMessage + ", but it was: " + messageObtained;

    }
}
