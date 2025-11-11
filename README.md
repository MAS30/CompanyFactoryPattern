# Company Factory Method Example

This project demonstrates the **Factory Method Pattern** and **Dependency Inversion Principle** in Java.

## Description
The `Company` class defines a template for software creation but delegates employee creation to subclasses.  
This makes `Company` independent of specific employee classes.

### Class Roles
- **Employee (interface):** Common abstraction for all workers  
- **Designer, Artist, Programmer, Tester:** Concrete employee types  
- **Company (abstract):** Defines software creation process using a factory method  
- **GameDevCompany, OutsourcingCompany:** Concrete factories that provide specific employee teams  

## Design Principles Used
- **Factory Method Pattern**
- **Dependency Inversion**
- **Open/Closed Principle**
- **Single Responsibility**
- **Polymorphism**

## How to Run
1. Copy all `.java` files into your compiler or IDE.  
2. Run `Main.java`.
