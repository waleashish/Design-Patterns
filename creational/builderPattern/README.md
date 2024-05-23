# Builder Pattern

Builder Design Pattern is a creational design pattern that is used to construct complex objects step by step. It allows the creation of different representations of an object using the same construction process. This pattern is particularly useful in enterprise software when objects require multiple steps to be constructed, need to be immutable, or when the same construction process should be able to create different representations of the object.

Let's try to understand the patten with an application.

## Use case: Search Query

We have a use case where we need to search for users in our application. The search can be on first name, last name or both. We should also hide the logic of creating the user query from client. Here, user query has multiple representations based on first name, last name, etc. which we want to conceal from the client. The builder pattern is ideal here. Let's see how we can implement it.

The builder pattern has following components:

1. **Product:** The complex object which can have multiple representations. We will construct this object with the help of our builder.

2. **Builder:** The builder which builds our complex object. It has multiple methods to supports construction of multiple represenatations.