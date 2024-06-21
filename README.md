<strong>
<em>
S — Single Responsibility Principle
O — Open/Closed Principle
L  — Liskov Substitution Principle
I  — Interface Segregation Principle
D — Dependency Inversion Principle

➥ S — Single Responsibility Principle (SRP)

- Each unit of code should have only one responsibility.
- A unit can be a class, module, function, or component.
- Keeps code modular and reduces tight coupling.

➥ O — Open/Closed Principle (OCP)

- Units of code should be open for extension 
+ but closed for modification.

- Extend functionality by adding new code, 
+ not modifying existing code.

- Useful in component-based systems like a React frontend.

➥ L — Liskov Substitution Principle (LSP)

- Subclasses should be substitutable for their base classes.
- Functionality in the base class should be usable by all subclasses.

- If a subclass can’t use the base class functionality, 
+ it shouldn’t be in the base class.

➥ I — Interface Segregation Principle (ISP)

- Provide multiple specific interfaces rather
+  than a few general-purpose ones.

- Clients shouldn’t depend on methods they don’t use.

➥ D — Dependency Inversion Principle (DIP)

- Depend on abstractions, not concrete classes.

- Use abstractions to decouple dependencies 
+ between parts of the system.

- Avoid direct calls between code units
+ use interfaces or abstractions.



Here's a brief overview of when to use these design patterns:

Singleton:

Use when you need exactly one instance of a class throughout the application.
Examples: managing a shared resource, coordinating actions across the system.


Strategy:

Use when you have multiple algorithms for a specific task and want to decide which one to use at runtime.
Examples: different sorting algorithms, various payment methods in a shopping cart.


Factory:

Use when you need to create objects without specifying the exact class of object to create.
Examples: creating different types of documents in a document processing application, instantiating different types of enemies in a game.


Observer:

Use when you have a one-to-many dependency between objects, where multiple objects need to be notified when one object changes state.
Examples: event handling systems, implementing a subscription mechanism.


Decorator:

Use when you need to add responsibilities to objects dynamically without affecting other objects of the same class.
Examples: adding features to a basic text editor (spell check, line numbering), customizing a beverage order.


Builder:

Use when you need to construct complex objects step by step, allowing you to produce different types and representations of an object using the same construction code.
Examples: building different types of houses, creating complex SQL queries.



Each pattern addresses specific design problems:

Singleton manages global state.
Strategy makes algorithms interchangeable.
Factory centralizes object creation.
Observer implements distributed event handling.
Decorator adds responsibilities dynamically.
Builder separates complex object construction from its representation.

  
</em>
</strong>
