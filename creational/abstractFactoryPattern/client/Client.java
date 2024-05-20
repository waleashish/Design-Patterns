package creational.abstractFactoryPattern.client;

import creational.abstractFactoryPattern.factory.PaymentFactory;
import creational.abstractFactoryPattern.product.PaymentProcessor;
import creational.abstractFactoryPattern.product.PaymentValidator;

/**
 * Driver code.
 * 
 * @author Ashish Wale
 */
public class Client {
    public static void main(String[] args) {
        double amount = 100.0;

        System.out.println("=== Starting paypal payment process ===");
        PaymentFactory paymentFactory = PaymentFactory.getPaymentFactory("PAYPAL");
        PaymentValidator paymentValidator = paymentFactory.createPaymentValidator();
        paymentValidator.validatePayment(amount);
        PaymentProcessor paymentProcessor = paymentFactory.createPaymentProcessor();
        paymentProcessor.processPayment(amount);
        System.out.println("=== Paypal payment process completed ===");

        System.out.println("=== Starting UPI payment process ===");
        paymentFactory = PaymentFactory.getPaymentFactory("UPI");
        paymentValidator = paymentFactory.createPaymentValidator();
        paymentValidator.validatePayment(amount);
        paymentProcessor = paymentFactory.createPaymentProcessor();
        paymentProcessor.processPayment(amount);
        System.out.println("=== UPI payment process completed ===");

        System.out.println("=== Starting card payment process ===");
        paymentFactory = PaymentFactory.getPaymentFactory("CARD");
        paymentValidator = paymentFactory.createPaymentValidator();
        paymentValidator.validatePayment(amount);
        paymentProcessor = paymentFactory.createPaymentProcessor();
        paymentProcessor.processPayment(amount);
        System.out.println("=== Card payment process completed ===");
    }
}
