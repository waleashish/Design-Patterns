# Adapter Pattern

The Adapter Pattern is a **structural design pattern**. It is used to allow two incompatible interfaces to work together. It acts as a bridge between the two interfaces, converting the interface of a class into another interface that a client expects.

## Use Case: Third party payment processor

Suppose we have a payment app. Our app currently support only one payment gateway that is designed by the paypal team. The business team has completed fruitful meetings with another third party payment business and have decided to integrate the gateway in our system. Our current order placing logic (Client) has a certain way of validating and processing the payment. The new thirdparty gateway, however, has some different way to do this. How do we address the issue?

We can clearly see that our client (order placing logic) is **incompatible** with a class (the thirdparty gateway). To make both compatible with each other, we can introduce the **Adapter Design Pattern** and solve the issue very easily.

### Solution with Adapter Pattern

Adapter Pattern has following components.
1. **Target:** The interface which is compatible with our client code.
2. **Adaptee:** The class which is incompatible with our client code.
3. **Adapter:** The adapter class, the implements our target interface and delegates the specific task to the adaptee class, making it compatible with the client.