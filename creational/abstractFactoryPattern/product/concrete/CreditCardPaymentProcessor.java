package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentProcessor;

/**
 * This class represents a concrete implementation of the @PaymentProcessor interface for processing credit card payments.
 * 
 * @author Ashish Wale
 */
public class CreditCardPaymentProcessor implements PaymentProcessor{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of amount: " + amount);
        return true;
    }

}
