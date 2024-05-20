package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentProcessor;

/**
 * This class represents a concrete implementation of the @PaymentProcessor interface for processing UPI payments.
 * 
 * @author Ashish Wale
 */
public class UPIPaymentProcessor implements PaymentProcessor {

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing UPI payment of amount: " + amount);
        return true;
    }

}
