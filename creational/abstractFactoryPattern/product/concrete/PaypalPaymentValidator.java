package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentValidator;

/**
 * This class represents a concrete implementation of the @PaymentValidator interface for validating PayPal payments.
 * 
 * @author Ashish Wale
 */
public class PaypalPaymentValidator implements PaymentValidator {

    @Override
    public boolean validatePayment(double amount) {
        System.out.println("Validating PayPal payment of amount: " + amount);
        return true;
    }

}
