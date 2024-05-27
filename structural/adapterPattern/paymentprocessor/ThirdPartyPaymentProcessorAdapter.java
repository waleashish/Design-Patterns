package structural.adapterPattern.paymentprocessor;

import structural.adapterPattern.thirdpartyprocessor.ThirdPartyPaymentProcessor;

/**
 * The ThirdPartyPaymentProcessorAdapter class is an implementation of the PaymentProcessor interface
 * that acts as an adapter for a third-party payment processor.
 * It adapts the functionality of the ThirdPartyPaymentProcessor class to the PaymentProcessor interface.
 * 
 * @author Ashish Wale
 */
public class ThirdPartyPaymentProcessorAdapter implements PaymentProcessor {

    private ThirdPartyPaymentProcessor thirdPartyPaymentProcessor;

    public ThirdPartyPaymentProcessorAdapter(ThirdPartyPaymentProcessor thirdPartyPaymentProcessor) {
        this.thirdPartyPaymentProcessor = thirdPartyPaymentProcessor;
    }

    @Override
    public void processPayment(double amount) {
        this.thirdPartyPaymentProcessor.conductTransaction(amount);
    }

    @Override
    public void validatePayment(double amount) {
        this.thirdPartyPaymentProcessor.verifyTransaction(amount);
    }

}
