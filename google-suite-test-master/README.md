# google-suite-test
Un proyecto que sirve de base para crear automatizaciones con Serenity BDD y Screenplay

En el archivo serenity.properties, cambiar la propiedad webdriver.chrome.driver a:

- Sistema operativo mac: webdriver.chrome.driver = chromedriver
- Sistema operativo windows: webdriver.chrome.driver = chromedriver.exe

Las pruebas se corren con el comando gradle test aggregate.
La documentaciónviva será generada en target/site/serenity/index.html
