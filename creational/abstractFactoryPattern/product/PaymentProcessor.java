package creational.abstractFactoryPattern.product;

/**
 * This interface defines the methods for a payment processor.
 * 
 * @author Ashish Wale
 */
public interface PaymentProcessor {
    /**
     * This method processes the payment for the given amount.
     * 
     * @param amount
     *           The amount to be processed.
     * @return
     *          True if payment is successful, false otherwise.
     */
    boolean processPayment(double amount);
}
