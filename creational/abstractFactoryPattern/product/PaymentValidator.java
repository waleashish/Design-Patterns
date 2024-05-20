package creational.abstractFactoryPattern.product;

/**
 * This interface defines the methods for a payment validator.
 * 
 * @author Ashish Wale
 */
public interface PaymentValidator {
    /**
     * This method validates the payment for the given amount.
     * 
     * @param amount
     *           The amount to be validated.
     * @return
     *          True if payment is valid, false otherwise.
     */
    boolean validatePayment(double amount);
}
