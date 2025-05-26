package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

// Indica que esta clase se ejecutará con Cucumber y Serenity
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Define la ubicación de los archivos de features (características)
        glue = "stepDefinitions",                  // Especifica el paquete donde se encuentran las definiciones de los pasos
        tags = "@Test",                            // Filtra los escenarios para ejecutar solo aquellos con la etiqueta @Test1
        snippets = SnippetType.CAMELCASE           // Configura el formato en que se generan los métodos en los Step Definitions
)
public class LaginRunner {
}
