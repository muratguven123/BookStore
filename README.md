![bookStore](https://github.com/user-attachments/assets/78251f14-aa18-4788-b3ed-05bee4bff794)


API Diagram Description

Controller: BookStoreController

Handles HTTP requests (GET and POST) and delegates operations to the services.

Service: OrderService and BookService

OrderService: Processes order-related logic, calculates total price, and saves orders.

BookService: Retrieves book details from the repository.

Repository: BookRepository and OrderRepository

BookRepository: Manages book persistence using JPA.

OrderRepository: Handles order-related database operations.

Models: Book and Order

Book: Represents book details like name, author, price, and stock.

Order: Contains order details like user name, list of books, and total price.

DTO: BookOrderRequest

Contains request data for placing an order, such as bookIdList and userName.
