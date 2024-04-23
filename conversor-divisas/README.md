[Ver en Español](README_ES.md)

## Currency Converter

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


2. **Project Creation**: Create a new project in your preferred IDE.

3. **API Consumption**: Implement the logic to make requests to the currency exchange rate API.

4. **JSON Response Analysis**: Develop the logic to analyze the JSON response and extract the necessary data.

5. **Currency Filtering**: Filter currencies according to the specified criteria.

6. **Displaying Results to Users**: Present the filtered results clearly and understandably to users.

 
### Installation:

1. Clone this repository to your local machine:

  ```sh
  git clone <Repositoty_URL>
  ```

---