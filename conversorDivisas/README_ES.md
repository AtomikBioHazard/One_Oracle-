# Conversor de Monedas


[![English Version](https://img.shields.io/badge/English%20Version-README.md-blue)](README.md)


<p align="center">
  <img src="https://img.shields.io/badge/STATUS-EN%20DESARROLLO-yellow" alt="Badge en Desarollo">
  <img src="https://img.shields.io/github/stars/atomikbiohazard?style=social" alt="GitHub Org's stars">
</p>


Este proyecto se centra en la creación de un conversor de monedas. A lo largo de este proceso, se detallarán los pasos necesarios para configurar el ambiente Java, consumir una API de tasas de cambio, analizar la respuesta JSON, filtrar las monedas y finalmente mostrar los resultados a los usuarios.


### Pasos a Seguir:

#### 1. Configuración del Ambiente Java:

En esta etapa inicial, nos enfocaremos en configurar el entorno de desarrollo Java para nuestro proyecto de Conversor de Monedas. Asegúrate de tener instalados y configurados los siguientes elementos:

1. **Java Development Kit (JDK)**:
   - Descarga e instala la última versión del JDK desde el sitio oficial de Oracle o utiliza una distribución OpenJDK compatible con tu sistema operativo.
   - Verifica la instalación ejecutando `java -version` en tu terminal. Deberías ver la versión instalada del JDK.

2. **Entorno de Desarrollo Integrado (IDE)**:
   - Elige un IDE de tu preferencia para trabajar con Java, como Eclipse, IntelliJ IDEA o NetBeans.
   - Descarga e instala el IDE seleccionado desde su sitio web oficial.
   - Configura el IDE según tus preferencias y necesidades de desarrollo.

3. **Configuración de Variables de Entorno**:
   - Después de instalar el JDK, configura las variables de entorno JAVA_HOME y PATH en tu sistema operativo para que apunten al directorio de instalación del JDK.
     - En Windows:
       - Abre la Configuración del Sistema (System Properties).
       - Haz clic en "Variables de Entorno" (Environment Variables).
       - En "Variables del Sistema", haz clic en "Nueva..." y crea una variable llamada JAVA_HOME con el valor del directorio de instalación del JDK (por ejemplo, `C:\Program Files\Java\jdk-11.0.12`).
       - Encuentra la variable PATH en la lista de variables del sistema, haz clic en ella y luego en "Editar...".
       - Agrega `%JAVA_HOME%\bin` al final de la línea de valores separados por punto y coma.
       - Haz clic en "Aceptar" para guardar los cambios.
     - En macOS y Linux:
       - Abre un terminal y ejecuta el comando `nano ~/.bash_profile` (o `nano ~/.bashrc` en algunos sistemas).
       - Agrega la línea `export JAVA_HOME=/ruta/al/directorio/jdk` donde `/ruta/al/directorio/jdk` es la ubicación del directorio del JDK.
       - Guarda y cierra el archivo (Ctrl + X, luego Y para confirmar y Enter).
       - Ejecuta `source ~/.bash_profile` (o `source ~/.bashrc`) para aplicar los cambios sin reiniciar la terminal.


#### 2. Creación del Proyecto:

En este paso, vamos a crear un nuevo proyecto utilizando tu IDE preferido, ya sea IntelliJ IDEA o Visual Studio Code.

##### Creación del Proyecto en IntelliJ IDEA:

1. Abre IntelliJ IDEA en tu sistema.

2. En la ventana de inicio de IntelliJ, selecciona "Crear nuevo proyecto" o ve al menú "Archivo" > "Nuevo" > "Proyecto".

3. Selecciona "Java" en la lista de opciones y haz clic en "Siguiente".

4. Configura el proyecto según tus preferencias. Puedes seleccionar el SDK de Java que instalaste en el paso anterior y elegir la ubicación del proyecto en tu sistema.

5. Haz clic en "Finalizar" para crear el proyecto.

##### Creación del Proyecto en Visual Studio Code:

1. Abre Visual Studio Code en tu sistema.

2. Presiona las teclas Shift + Ctrl + P para abrir la paleta de comandos.

3. Escribe "Java: Create New Project" y selecciona esa opción.

4. Selecciona el tipo de proyecto que deseas crear (por ejemplo, "Java" o "Maven").

5. Selecciona la carpeta donde deseas crear el proyecto.

6. Proporciona el nombre del proyecto cuando se te solicite.

7. Visual Studio Code creará automáticamente la estructura del proyecto y abrirá la carpeta del proyecto en el explorador lateral.


#### 3. Consumo de la API:

En este paso, implementaremos la lógica para realizar solicitudes a la API de tasas de cambio. Utilizaremos la API proporcionada por [ExchangeRate-API](https://www.exchangerate-api.com).

1. **Definir la URL de la API**: Utilizaremos la URL proporcionada por la documentación de la API, que en este caso es `https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD`. Asegúrate de reemplazar `"YOUR-API-KEY"` con tu clave de API proporcionada por el servicio.

2. **Realizar la Solicitud HTTP**: Utilizaremos la clase `URL` para crear un objeto URL basado en la URL de la API. Luego, abriremos una conexión `HttpURLConnection` y realizaremos una solicitud GET a la API para obtener los datos de las tasas de cambio.

3. **Convertir la Respuesta a JSON**: Una vez que recibamos la respuesta de la API, la convertiremos a formato JSON. Utilizaremos la biblioteca Google GSON para facilitar esta tarea.

4. **Acceder a los Datos**: Una vez que la respuesta se haya convertido en un objeto JSON, podremos acceder a los datos necesarios, como las tasas de cambio para diferentes monedas.


#### 4. Análisis de la Respuesta JSON:

En esta etapa, nos sumergiremos en el análisis de la respuesta JSON obtenida de la API de tasas de cambio. Este paso es esencial para extraer los datos necesarios y mostrar las tasas de cambio de manera adecuada en nuestro Conversor de Monedas. Sigue estos pasos para realizar el análisis:

1. **Revisa la Respuesta JSON**: Después de realizar la solicitud a la API, examina la respuesta JSON obtenida. Observa la estructura de los datos y familiarízate con las claves y valores que contiene.

2. **Identifica las Tasas de Cambio**: Dentro de la respuesta JSON, busca el objeto que contiene las tasas de cambio para diferentes monedas. Este objeto suele estar etiquetado como "conversion_rates".

3. **Utiliza la Biblioteca Gson**: Para facilitar el análisis de la respuesta JSON, utilizaremos la biblioteca Gson en Java. Esta biblioteca nos permite convertir la respuesta JSON en objetos Java y acceder a sus propiedades de manera sencilla.

4. **Extrae los Datos Necesarios**: Utilizando Gson, extrae las tasas de cambio de la respuesta JSON y almacénalas en una estructura de datos adecuada para su posterior uso en el Conversor de Monedas.


#### 5. Filtro de Monedas:

En esta fase, nos centraremos en filtrar las monedas según los criterios establecidos. Sigue estos pasos para realizar el filtro:

1. **Comprende la Estructura JSON**: Antes de comenzar el filtrado, asegúrate de comprender la estructura JSON de la respuesta de la API. Identifica el atributo que contiene los códigos de las monedas, denominado "Currency Code".

2. **Selecciona las Monedas**: Basándote en los criterios establecidos, elige al menos tres códigos de moneda para incluir en tu aplicación. Para este desafío, los códigos sugeridos son:
   - ARS: Peso argentino
   - BOB: Boliviano boliviano
   - BRL: Real brasileño
   - CLP: Peso chileno
   - COP: Peso colombiano
   - USD: Dólar estadounidense

3. **Implementa el Filtrado**: Utilizando la biblioteca Gson en Java, implementa la lógica para filtrar las monedas según los códigos seleccionados. Accede al atributo "Currency Code" en la respuesta JSON y filtra las monedas según los códigos elegidos.


#### 6. Exhibición de Resultados a los Usuarios:

En esta fase final, presentaremos los resultados filtrados de manera clara y comprensible para los usuarios. Sigue estos pasos detallados para lograrlo:

1. **Preparar la Interfaz de Usuario**: Diseña una interfaz amigable para mostrar los resultados de la conversión. Considera utilizar una interfaz sencilla basada en la consola para este propósito.

2. **Mostrar Opciones de Conversión de Monedas**: Presenta al usuario opciones para la conversión de monedas. Esto podría incluir mostrar una lista de monedas disponibles o proporcionar un mensaje para que el usuario ingrese el par de monedas deseado.

3. **Recopilar la Entrada del Usuario**: Utiliza la clase Scanner en Java para capturar la entrada del usuario con respecto a las monedas que desean convertir y la cantidad a convertir.

4. **Realizar la Conversión de Monedas**: Implementa la lógica para calcular los valores convertidos basados en las monedas seleccionadas y las tasas de cambio obtenidas. Aplica las tasas de cambio a la entrada proporcionada por el usuario para determinar los montos convertidos.

5. **Mostrar los Resultados**: Presenta los valores convertidos al usuario en un formato claro. Asegúrate de que los resultados incluyan tanto los montos de la moneda original como los convertidos para facilitar la comparación.

6. **Probar la Interfaz de Usuario**: Prueba exhaustivamente la interfaz de usuario para verificar que funcione según lo esperado. Prueba diversos escenarios, incluidas entradas de usuario válidas e inválidas, para garantizar su robustez.


### Instalación:

1. Clona este repositorio en tu máquina local:

   ```sh
   git clone <URL_del_repositorio>
   ```

---