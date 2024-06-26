# Currency Converter


[![Ver en Español](https://img.shields.io/badge/Ver%20en%20Espa%C3%B1ol-README_ES.md-blue)](README_ES.md)


<p align="center">
  <img src="https://img.shields.io/badge/STATUS-IN%20DEVELOPMENT-yellow" alt="In Development Badge">
  <img src="https://img.shields.io/github/stars/atomikbiohazard?style=social" alt="GitHub Org's stars">
</p>


This project focuses on creating a currency converter. Throughout this process, the necessary steps will be detailed to set up the Java environment, consume a currency exchange rate API, analyze the JSON response, filter currencies, and finally display the results to users.


### Steps to Follow:

#### 1. Java Environment Setup:

In this initial stage, we will focus on configuring the Java development environment for our Currency Converter project. Make sure you have the following elements installed and configured:

1. **Java Development Kit (JDK)**:
   - Download and install the latest version of the JDK from the official Oracle website or use a compatible OpenJDK distribution for your operating system.
   - Verify the installation by running `java -version` in your terminal. You should see the installed version of the JDK.

2. **Integrated Development Environment (IDE)**:
   - Choose an IDE of your preference for working with Java, such as Eclipse, IntelliJ IDEA, or NetBeans.
   - Download and install the selected IDE from its official website.
   - Configure the IDE according to your preferences and development needs.

3. **Configuration of Environment Variables**:
   - After installing the JDK, configure the JAVA_HOME and PATH environment variables on your operating system to point to the JDK installation directory.
     - On Windows:
       - Open System Properties.
       - Click on "Environment Variables".
       - Under "System Variables", click "New..." and create a variable named JAVA_HOME with the value of the JDK installation directory (e.g., `C:\Program Files\Java\jdk-11.0.12`).
       - Find the PATH variable in the list of system variables, click on it, and then click "Edit...".
       - Add `%JAVA_HOME%\bin` at the end of the line of values separated by semicolons.
       - Click "OK" to save the changes.
     - On macOS and Linux:
       - Open a terminal and run the command `nano ~/.bash_profile` (or `nano ~/.bashrc` on some systems).
       - Add the line `export JAVA_HOME=/path/to/jdk/directory` where `/path/to/jdk/directory` is the location of the JDK directory.
       - Save and close the file (Ctrl + X, then Y to confirm, and Enter).
       - Run `source ~/.bash_profile` (or `source ~/.bashrc`) to apply the changes without restarting the terminal.


#### 2. Project Creation:

In this step, we will create a new project using your preferred IDE, either IntelliJ IDEA or Visual Studio Code.

##### Creating the Project in IntelliJ IDEA:

1. Open IntelliJ IDEA on your system.

2. In the IntelliJ startup window, select "Create New Project" or go to the "File" menu > "New" > "Project".

3. Select "Java" from the list of options and click "Next".

4. Configure the project according to your preferences. You can select the Java SDK installed in the previous step and choose the project location on your system.

5. Click "Finish" to create the project.

##### Creating the Project in Visual Studio Code:

1. Open Visual Studio Code on your system.

2. Press Shift + Ctrl + P to open the command palette.

3. Type "Java: Create New Project" and select that option.

4. Select the type of project you want to create (e.g., "Java" or "Maven").

5. Choose the folder where you want to create the project.

6. Provide the project name when prompted.

7. Visual Studio Code will automatically create the project structure and open the project folder in the side explorer.


#### 3. API Consumption:

In this step, we will implement the logic to make requests to the exchange rates API. We will be using the API provided by [ExchangeRate-API](https://www.exchangerate-api.com).

1. **Define the API URL**: We will use the URL provided by the API documentation, which in this case is `https://v6.exchangerate-api.com/v6/YOUR-API-KEY/latest/USD`. Make sure to replace `"YOUR-API-KEY"` with your API key provided by the service.

2. **Make the HTTP Request**: We will use the `URL` class to create a URL object based on the API URL. Then, we will open an `HttpURLConnection` connection and make a GET request to the API to fetch the exchange rate data.

3. **Convert the Response to JSON**: Once we receive the API response, we will convert it to JSON format. We will use the Google GSON library to facilitate this task.

4. **Access the Data**: After the response is converted to a JSON object, we can access the necessary data, such as the exchange rates for different currencies.


#### 4. JSON Response Analysis:

In this stage, we will dive into analyzing the JSON response obtained from the exchange rates API. This step is crucial for extracting the necessary data and displaying the exchange rates properly in our Currency Converter. Follow these steps to perform the analysis:

1. **Review the JSON Response**: After making the request to the API, examine the JSON response received. Observe the structure of the data and familiarize yourself with the keys and values it contains.

2. **Identify the Exchange Rates**: Within the JSON response, look for the object that contains the exchange rates for different currencies. This object is usually labeled as "conversion_rates".

3. **Use the Gson Library**: To facilitate the analysis of the JSON response, we will use the Gson library in Java. This library allows us to convert the JSON response into Java objects and access their properties easily.

4. **Extract the Necessary Data**: Using Gson, extract the exchange rates from the JSON response and store them in a suitable data structure for later use in the Currency Converter.


#### 5. Currency Filtering:

In this phase, we will focus on filtering the currencies according to the established criteria. Follow these steps to perform the filtering:

1. **Understand the JSON Structure**: Before starting the filtering process, make sure to understand the JSON structure of the API response. Identify the attribute that contains the currency codes, called "Currency Code".

2. **Select the Currencies**: Based on the established criteria, choose at least three currency codes to include in your application. For this challenge, the suggested codes are:
   - ARS: Argentine Peso
   - BOB: Bolivian Boliviano
   - BRL: Brazilian Real
   - CLP: Chilean Peso
   - COP: Colombian Peso
   - USD: US Dollar

3. **Implement the Filtering**: Using the Gson library in Java, implement the logic to filter the currencies according to the selected codes. Access the "Currency Code" attribute in the JSON response and filter the currencies based on the chosen codes.


#### 6. Displaying Results to Users:

In this final phase, we will present the filtered results in a clear and understandable manner for the users. Follow these detailed steps to achieve this:

1. **Prepare the User Interface**: Design a user-friendly interface to display the conversion results. Consider using a simple console-based interface for this purpose.

2. **Display Currency Conversion Options**: Present the user with options for currency conversion. This could include displaying a list of available currencies or providing a prompt for the user to input their desired currency pair.

3. **Collect User Input**: Utilize the Scanner class in Java to capture user input regarding the currencies they wish to convert and the amount to convert.

4. **Perform Currency Conversion**: Implement the logic to calculate the converted values based on the selected currencies and the obtained exchange rates. Apply the conversion rates to the user-provided input to determine the converted amounts.

5. **Display Results**: Present the converted values to the user in a clear format. Ensure that the results include both the original and converted currency amounts for easy comparison.

6. **Test the User Interface**: Thoroughly test the user interface to verify that it behaves as expected. Test various scenarios, including valid and invalid user inputs, to ensure robustness.

 
### Installation:

1. Clone this repository to your local machine:

 ```
   git clone <Repositoty_URL>
   ```

---