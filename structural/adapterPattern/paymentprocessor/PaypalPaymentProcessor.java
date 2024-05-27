package structural.adapterPattern.paymentprocessor;

/**
 * This class implements the PaymentProcessor interface and provides functionality to process and validate payments through Paypal.
 * 
 * @author Ashish Wale
 */
public class PaypalPaymentProcessor implements PaymentProcessor {

    /**
     * Processes the payment through Paypal.
     *
     * @param amount The amount to be processed.
     */
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment through Paypal: " + amount);
    }

    /**
     * Validates the payment through Paypal.
     *
     * @param amount The amount to be validated.
     */
    @Override
    public void validatePayment(double amount) {
        System.out.println("Validating payment through Paypal: " + amount);
    }

}
