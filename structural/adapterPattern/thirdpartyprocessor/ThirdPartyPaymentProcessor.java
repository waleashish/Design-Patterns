package structural.adapterPattern.thirdpartyprocessor;

/**
 * The ThirdPartyPaymentProcessor class represents a third-party payment processor
 * that can conduct and verify transactions.
 * 
 * This class is part of a third-party library and cannot be modified.
 * 
 * @author Ashish Wale
 */
public class ThirdPartyPaymentProcessor {
    /**
     * Conducts a payment transaction for the specified amount.
     *
     * @param amount the amount to be processed
     * @return true if the transaction is successful, false otherwise
     */
    public boolean conductTransaction(double amount) {
        System.out.println("Processing payment through ThirdPartyPaymentProcessor: " + amount);
        return true;
    }

    /**
     * Verifies a payment transaction for the specified amount.
     *
     * @param amount the amount to be verified
     * @return true if the transaction is valid, false otherwise
     */
    public boolean verifyTransaction(double amount) {
        System.out.println("Validating payment through ThirdPartyPaymentProcessor: " + amount);
        return true;
    }
}
