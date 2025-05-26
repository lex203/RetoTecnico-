package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/NewCustomer.feature", // Ubicación del Feature
        glue = "stepDefinitions",                  // Ubicación de los Step Definitions
        tags = "@Smoke",                           // Ejecuta solo las pruebas etiquetadas con @Smoke
        snippets = SnippetType.CAMELCASE           // Define el estilo de los métodos generados
)
public class GenerateCustomerRunner {
}