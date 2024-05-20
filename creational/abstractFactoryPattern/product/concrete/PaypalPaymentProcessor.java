package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentProcessor;

/**
 * This class represents a concrete implementation of the @PaymentProcessor interface for processing paypal payment.
 * 
 * @author Ashish Wale
 */
public class PaypalPaymentProcessor implements PaymentProcessor{

    @Override
    public boolean processPayment(double amount) {
        System.out.println("Processing paypal payment of amount: " + amount);
        return true;
    }

}
