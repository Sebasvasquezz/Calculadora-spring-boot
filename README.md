# Spring Boot Calculator Application

This repository contains a Spring Boot application that implements a simple web-based calculator. The application provides basic arithmetic operations such as addition, subtraction, multiplication, division, and reset (All Clear). It follows the Model-View-Controller (MVC) architecture pattern to separate the application's logic, user interface, and user input handling.

### Features
* **Addition:** Add numbers.
* **Subtraction:** Subtract numbers.
* **Multiplication:** Multiply numbers.
* **Division:** Divide numbers (with validation to prevent division by zero).
* **All Clear:** Reset the calculator to its initial state.

### Technologies Used
* **Java:** Programming language.
* **Spring Boot:** Framework for building the application.
* **Thymeleaf:** Template engine for rendering the HTML views.
* **CSS:** Styling the application.

## Proyect Structure

* **CalculadoraApplication.java:** The main class that bootstraps the Spring Boot application.
* **CalculadoraController.java:** The controller class that handles web requests and performs arithmetic operations.

* **calculadora.html:** Thymeleaf template for the calculator UI.

* **styles.css:** CSS file for styling the calculator UI.

## Architectural Design
![Architectural Design](src\main\resources\static\image-1.png)
* The user accesses the application through the public URL of the EC2 instance.
* The request arrives at Spring's DispatcherServlet.
* The DispatcherServlet routes the request to the CalculatorController.
* The CalculatorController processes the request and uses the CalculatorService to perform the math operation.
* The result is sent to the view and displayed to the user.

## Getting Started
Download the project from 
[the repository.](https://github.com/Sebasvasquezz/Calculadora-spring-boot)

### Prerequisites

* [Maven](https://maven.apache.org/): Automate and standardize the life flow of software construction

### Installing
1. Maven
    * Download Maven in http://maven.apache.org/download.html
    * You need to have Java installed (7 or 8)
    * Follow the instructions in http://maven.apache.org/download.html#Installation

## Build the project
* Run the comand:
    ```
    mvn clean install
    ```
* Run the application:
    ```
    mvn spring-boot:run
    ```
    or 
    ```
    java -jar "archivo.jar"
    ```
* Javadoc:
    ```
    mvn javadoc:javadoc
    ```

* And the execution in AWS:
 ![Execution in AWS](src\main\resources\static\image.png)

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management

## Authors

* **Juan Sebastian Vasquez Vega**  - [Sebasvasquezz](https://github.com/Sebasvasquezz)

## Date

June 25, 2024

## License

This project is licensed under the GNU License - see the [LICENSE.txt](LICENSE.txt) file for details.