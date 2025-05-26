package demo.guru99.pageObjects;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

@DefaultUrl("https://demo.guru99.com/V4/index.php") // Define la URL predeterminada de la página
public class LoginPage extends PageObject {


    // Localizadores de los elementos de la página usando la clase By de Selenium
    private By TxtUser = By.name("uid");
    private By TxtPass = By.name("password");
    private By BtnLogin = By.name("btnLogin");
    private By TxtMessage = By.xpath("//td[contains(text(), 'Manger Id : mngr622585')]");

    //Metodos para escribir user y pass
    public void setTextUser(String user) {
        getDriver().findElement(TxtUser).sendKeys(user);
    }
    public void setTextPass(String pass) {
        getDriver().findElement(TxtPass).sendKeys(pass);
    }

    // Método para hacer clic
    public void clicBtnLogin() {
        getDriver().findElement(BtnLogin).sendKeys(Keys.ENTER);
    }

    // Método para obtener el mensaje
    public String getMessage(){
        return getDriver().findElement(TxtMessage).getText();
    }

}
