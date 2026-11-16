# E commerce Spring Boot backend

A REST API built with Spring Boot around 6 JPA entities, using PostgreSQL.

## Tech stack

- Java 17, built with Maven
- Spring Boot 2.6.3
- Spring Web (REST controllers)
- Spring Data JPA (Hibernate)
- Spring Data REST
- Spring Boot Actuator
- Lombok
- PostgreSQL driver
- Database: PostgreSQL (`ecommercedb2` in `application.properties`)

## Data model

| Entity | Fields |
|---|---|
| `Product` | id, label, price, expirationDate, fabricationDate, stock, description, image, commands |
| `Customer` | id, firstName, lastName, email, phoneNumber, type, address, commands |
| `Provider` | id, name, email, telephone, siteUrl |
| `Command` | id, quantity, date, customer, product, commandDeliveries |
| `Delivery` | id, date, amount, state, quantity, command |
| `Address` | id, Number, street, city, postalCode, customer |

## REST endpoints

Found in the controllers (`ProductController`, `AddressController`):

| Method | Path |
|---|---|
| POST | `/products/add` |
| GET | `/products/all` |
| GET | `/products/{id}` |

## Project structure

- `tn.esb.bi2.ecommerceApi`: ECommerceApiApplication
- `tn.esb.bi2.ecommerceApi.Domains`: Address, Command, CommandId, Customer, Delivery, Product, Provider
- `tn.esb.bi2.ecommerceApi.Enumerations`: CustomerType, DeliveryState
- `tn.esb.bi2.ecommerceApi.Repositories`: AddressRepository, CommandRepository, CustomerRepository, DeliveryDepository, ProductRepository, ProviderRepository
- `tn.esb.bi2.ecommerceApi.Services`: AddressService, CommandService, CustomerService, DeliveryService, ProductService, ProviderService
- `tn.esb.bi2.ecommerceApi.Web`: AddressController, CommandController, CustomerController, DeliveryController, ProductController, ProviderController
- Tests: 1 test class

## How to run

Requirements: a JDK 17+ and Maven (or the included Maven wrapper).
Create the `ecommercedb2` database and set your own username and password in `src/main/resources/application.properties`.

```bash
./mvnw spring-boot:run
```

The API then listens on `http://localhost:9592`.

---

Author: [Chaouki Bayoudhi](https://github.com/ChaoukiBayoudhi)
