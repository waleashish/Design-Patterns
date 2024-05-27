package structural.adapterPattern.paymentprocessor;

/**
 * The PaymentProcessor interface defines the contract for processing and validating payments.
 * 
 * @author Ashish Wale
 */
public interface PaymentProcessor {
    /**
     * Processes the payment for the specified amount.
     *
     * @param amount The amount to be processed.
     */
    public void processPayment(double amount);

    /**
     * Validates the payment for the specified amount.
     *
     * @param amount The amount to be validated.
     */
    public void validatePayment(double amount);
}
