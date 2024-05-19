# Factory Pattern

The Factory Pattern is indeed a **creational design pattern**. It provides an interface for creating objects in a super class, but allows subclasses to alter the type of objects that will be created. This pattern is particularly useful for creating objects based on requirements that can arise at runtime.

## Use Case: Document Operations

In an application that supports manipulation of multiple types of documents (e.g., PDF, Word, etc.), users select the type of document they want to work on at runtime. Since the type of document is not known beforehand, the Factory Pattern is ideal for this scenario.

### Problem with Direct Instantiation

Using **if-else** blocks or switch statements in the main code to create specific instances of document handlers directly within the client code leads to several issues:

1. **Tight Coupling:** Direct instantiation ties the client code to specific classes. Any changes in the way these classes are constructed require changes in the client code, making maintenance difficult.

2. **Cumbersome Extension:** Adding support for new document types means updating the client code with additional conditionals, leading to a fragile and error-prone system.

3. **Single Responsibility Principle Violation:** The client code should not handle the creation and management of document instances. Mixing this responsibility with other tasks handled by the client code violates the principle that a class should have only one reason to change.

### Solution with Factory Pattern

Using the Factory Pattern, you can encapsulate the creation logic within factory classes, achieving:

- **Decoupling:** The client code depends on abstractions (interfaces or abstract classes) rather than concrete classes, reducing coupling.
- **Ease of Extension:** Adding new document types involves creating new factory classes or methods without altering existing client code.
- **Adherence to SRP:** The factory handles the creation and lifecycle management of objects, ensuring the client code focuses solely on its primary responsibilities.

The Factory Pattern provides a robust solution to create objects based on runtime requirements, supports multiple variations of a feature, and ensures the client code remains clean, maintainable, and adheres to SOLID principles.