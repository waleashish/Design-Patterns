package creational.abstractFactoryPattern.product.concrete;

import creational.abstractFactoryPattern.product.PaymentValidator;

/**
 * The class represents a concrete implementation of @PaymentValidator interface for validating UPI payments.
 * 
 * @author Ashish Wale
 */
public class UPIPaymentValidator implements PaymentValidator {

    @Override
    public boolean validatePayment(double amount) {
        System.out.println("Validating UPI payment of amount: " + amount);
        return true;
    }

}
