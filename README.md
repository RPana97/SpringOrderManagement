Order Management System
Overview
This project implements a simple Order Management System using Spring Boot. It provides basic CRUD operations for managing Order and Product entities. The project follows Test-Driven Development (TDD) methodology, where test cases were written and used to validate the functionality of each service before implementing the code.

Key Features
CRUD operations for Orders and Products.
Uses Spring Data JPA for database interactions.
Includes a simple REST API for creating, retrieving, updating, and deleting entities.
In-memory H2 database for data persistence.
JUnit test cases written to validate service functionality.
Project Structure
bash
Copy code
ordermanagementspring/
├── src
│   ├── main
│   │   ├── java
│   │   │   └── org
│   │   │       └── example
│   │   │           └── ordermanagementspring
│   │   │               ├── Order.java
│   │   │               ├── OrderController.java
│   │   │               ├── OrderRepository.java
│   │   │               ├── OrderService.java
│   │   │               ├── Product.java
│   │   │               ├── ProductController.java
│   │   │               ├── ProductRepository.java
│   │   │               └── ProductService.java
│   ├── resources
│   │   └── application.properties
│   ├── test
│       └── java
│           └── org
│               └── example
│                   └── ordermanagementspring
│                       ├── OrderServiceTest.java
│                       └── ProductServiceTest.java
└── pom.xml
Prerequisites
To run this project, ensure you have the following installed:

Java 17
Maven 3.6+
How to Build and Run the Project

Clone the Repository
Clone the repository to your local machine:

bash
Copy code
git clone <your-github-repo-link>
cd ordermanagementspring

Build the Project
Build the project using Maven:

bash
Copy code
mvn clean install

Run the Application
Run the Spring Boot application:

bash
Copy code
mvn spring-boot:run

Access the API
Once the application is running, you can access the following endpoints:

GET /orders - Fetch all orders.

POST /orders - Create a new order.

PUT /orders/{id} - Update an existing order.

DELETE /orders/{id} - Delete an order by ID.

GET /products - Fetch all products.

POST /products - Create a new product.

PUT /products/{id} - Update an existing product.

DELETE /products/{id} - Delete a product by ID.

How to Run Tests
The project includes test cases for the OrderService and ProductService that follow the TDD approach.

To run all tests:

bash
Copy code
mvn test
Test cases are defined in the following files:

OrderServiceTest.java: Tests for CRUD operations on Order.
ProductServiceTest.java: Tests for CRUD operations on Product.
Test-Driven Development (TDD) Methodology
This project follows the TDD methodology:

Write tests first: We began by writing unit tests for OrderService and ProductService.
Run the tests: Initially, the tests fail as the actual implementation is missing.
Implement the functionality: Next, we implemented the logic to pass the tests.
Refactor and improve: After the tests passed, we refactored the code where needed.
Test Cases
OrderServiceTest.java:
testCreateOrder(): Tests the creation of an order.
testGetAllOrders(): Tests fetching all orders.
testUpdateOrder(): Tests updating an order's details.
testDeleteOrder(): Tests deleting an order by ID.
ProductServiceTest.java:
testCreateProduct(): Tests the creation of a product.
testGetAllProducts(): Tests fetching all products.
testUpdateProduct(): Tests updating a product's details.
testDeleteProduct(): Tests deleting a product by ID.
Test Results
All tests have been run successfully. The build should pass without any issues once the application is correctly configured and built.

Technologies Used
Spring Boot 3.3.3
Spring Data JPA
H2 Database
JUnit 5
Maven
