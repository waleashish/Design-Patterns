package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentValidator;

/**
 * This class represents a concrete implementation of the @PaymentValidator interface to validate credit card payments.
 * 
 * @author Ashish Wale
 */
public class CreditCardPaymentValidator implements PaymentValidator {

    @Override
    public boolean validatePayment(double amount) {
        System.out.println("Validating credit card payment of amount: " + amount);
        return true;
    }

}
