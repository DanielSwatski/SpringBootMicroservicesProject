Product Inventory System with Micro-service Architecture

This project is a recreation of a Product Inventory System using a micro-service architecture. It leverages various technologies to create a scalable and efficient system for managing product data. The key components and technologies used in this project include Netflix's Eureka for service registry, Spring Cloud Gateway for API call management, Keycloak for authentication, Apache Kafka for message management, and Docker for application deployment.


Technologies Used

The project utilizes the following technologies and tools:

    Netflix Eureka: Service registry for registering and discovering micro-services.
    Spring Cloud Gateway: API gateway for managing and routing API calls to micro-services.
    Keycloak: Authentication and authorization service for securing access to the system.
    Apache Kafka: Message broker for handling asynchronous communication between micro-services.
    Docker: Containerization platform for packaging and deploying micro-services.

Getting Started

To get started with this project, follow these steps:

    Clone the repository to your local machine.
    Install and configure the required dependencies.
    Set up and configure Netflix Eureka, Spring Cloud Gateway, Keycloak, and Apache Kafka.
    Build and deploy the micro-services using Docker containers.

For detailed installation and setup instructions, please reach out to me, DanielSwatski@Protonmail.com

The system is designed with a micro-service architecture that consists of several independent components:

    Product Service: Manages product data, including CRUD operations.
    Inventory Service: Handles inventory management and stock tracking.
    Authentication Service: Integrates with Keycloak for user authentication and authorization.
    API Gateway: Spring Cloud Gateway acts as the entry point for API requests.
    Service Registry: Netflix Eureka registers and manages micro-services.
    Message Broker: Apache Kafka facilitates asynchronous communication between services.


Contributions to this project are welcome! If you have ideas for improvements or find issues that need to be addressed, please open an issue or submit a pull request.
License

This project is licensed under the MIT License, which means you are free to use, modify, and distribute the code as long as you include the appropriate attribution and disclaimers. See the LICENSE file for more details.
