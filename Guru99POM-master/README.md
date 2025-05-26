# Proyecto de Automatización con Serenity BDD, Cucumber y POM

Este proyecto automatiza el inicio de sesión en el sitio de pruebas [Guru99 Demo](http://demo.guru99.com/V4/index.php), utilizando **Serenity BDD**, **Cucumber**, **Selenium WebDriver** y el **patrón de diseño Page Object Model (POM)**. La arquitectura aplicada promueve la escalabilidad, la reutilización de código y una clara separación de responsabilidades.

## Tabla de contenido

- [Estructura del Proyecto](#estructura-del-proyecto)
- [Dependencias y Configuraciones](#dependencias-y-configuraciones)
- [Diseño del Flujo de Automatización](#diseño-del-flujo-de-automatización)
- [Explicación de Componentes](#explicación-de-componentes)
- [Patrón de Diseño POM](#patrón-de-diseño-pom)
- [Conclusión](#conclusión)

## Estructura del Proyecto

```
project-root
├── src
│   └── test
│       ├── java
│       │   ├── models
│       │   ├── pageObjects
│       │   ├── steps
│       │   ├── runners
│       │   └── stepDefinitions
│       └── resources
│           ├── features
│           └── drivers
├── serenity.properties
├── build.gradle
└── README.md
```

## Configuraciones

Archivo `serenity.properties`:

```properties
webdriver.driver=chrome
webdriver.chrome.driver=src/test/resources/drivers/chromedriver.exe
serenity.project.name=Demo project using Serenity and Cucumber on the Guru99 Demo
chrome.switches=--start-maximized
webdriver.driver.silent=true
serenity.verbose.steps=false
serenity.report.encoding=UTF-8
feature.file.encoding=UTF-8
serenity.test.root=net.thucydides.showcase.cucumber.junit
```

> Asegúrate de que el archivo `chromedriver.exe` sea compatible con tu versión de Chrome.

## Diseño del Flujo de Automatización

1. El escenario se define en un archivo `.feature` utilizando el lenguaje Gherkin.
2. Los **Step Definitions** traducen los pasos en lenguaje natural a código Java.
3. Las clases **Steps** contienen la lógica modular y usan la anotación `@Step` de Serenity.
4. Los **Steps** llaman a los métodos de los **Page Objects**, que contienen la lógica de interacción con la interfaz.
5. Un **Runner** ejecuta el escenario usando Cucumber y Serenity.
6. Serenity genera automáticamente reportes detallados de la ejecución.

## Explicación de Componentes

- **Features**: Escenarios escritos en lenguaje natural (Gherkin).
- **Runner**: Configura la ejecución de los escenarios con Serenity y Cucumber.
- **Step Definitions**: Implementación en Java de los pasos descritos en los features.
- **Steps**: Clases con lógica modular decoradas con `@Step`.
- **Page Objects**: Encapsulan los elementos de la interfaz y las acciones sobre ellos.
- **Models**: Representan entidades o estructuras de datos.

## Patrón de Diseño POM

El patrón **Page Object Model (POM)** promueve la separación entre la lógica de negocio y la interfaz de usuario, lo que facilita el mantenimiento y la escalabilidad.

**Ventajas:**
- Reutilización de componentes.
- Mantenimiento simplificado.
- Claridad y organización del código.

**Implementación en este proyecto:**
- `LoginPage.java`: Define los elementos y acciones de la pantalla de inicio de sesión.
- `LoginSteps.java`: Orquesta las acciones requeridas para completar el flujo.
- `LoginStepDefinition.java`: Enlaza los pasos en lenguaje natural con las acciones implementadas.

## Conclusión

Este proyecto demuestra cómo aplicar buenas prácticas en la automatización de pruebas utilizando Serenity BDD, Cucumber y el patrón Page Object Model. Su arquitectura clara y modular permite una alta mantenibilidad, legibilidad y facilidad para extender la cobertura de pruebas funcionales.