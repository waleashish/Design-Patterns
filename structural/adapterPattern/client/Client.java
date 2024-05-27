package structural.adapterPattern.client;

import structural.adapterPattern.paymentprocessor.PaymentProcessor;
import structural.adapterPattern.paymentprocessor.PaypalPaymentProcessor;
import structural.adapterPattern.paymentprocessor.ThirdPartyPaymentProcessorAdapter;
import structural.adapterPattern.thirdpartyprocessor.ThirdPartyPaymentProcessor;

/**
 * Driver code.
 * 
 * @author Ashish Wale
 */
public class Client {

    public static void main(String[] args) {
        PaymentProcessor paymentProcessor = new PaypalPaymentProcessor();
        paymentProcessor.processPayment(100.0);
        paymentProcessor.validatePayment(100.0);

        paymentProcessor = new ThirdPartyPaymentProcessorAdapter(new ThirdPartyPaymentProcessor());
        paymentProcessor.processPayment(100.0);
        paymentProcessor.validatePayment(100.0);
    }
}
