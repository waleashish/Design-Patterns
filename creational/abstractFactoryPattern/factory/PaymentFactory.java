package creational.abstractFactoryPattern.factory;

import creational.abstractFactoryPattern.PaymentTypeConstants;
import creational.abstractFactoryPattern.factory.concrete.CreditcardPaymentFactory;
import creational.abstractFactoryPattern.factory.concrete.PaypalPaymentFactory;
import creational.abstractFactoryPattern.factory.concrete.UPIPaymentFactory;
import creational.abstractFactoryPattern.product.PaymentProcessor;
import creational.abstractFactoryPattern.product.PaymentValidator;

/**
 * This interface represents an abstract factory that defines methods to create payment-related objects
 * such as payment processor, payment validator, etc.
 * 
 * @author Ashish Wale
 */
public interface PaymentFactory {
    /**
     * Creates a payment validator object.
     *
     * @return the created payment validator
     */
    PaymentValidator createPaymentValidator();

    /**
     * Creates a payment processor object.
     *
     * @return the created payment processor
     */
    PaymentProcessor createPaymentProcessor();

    /**
     * This static method returns a payment factory based on the specified payment type.
     *
     * @param paymentType 
     *         The type of payment for which the factory is required.
     * @return
     *        The payment factory for the specified payment type.
     * @throws IllegalArgumentException
     *        If the specified payment type is invalid.
     */
    public static PaymentFactory getPaymentFactory(String paymentType) throws IllegalArgumentException {
        switch (paymentType) {
            case PaymentTypeConstants.PAYPAL:
                return new PaypalPaymentFactory();
            case PaymentTypeConstants.UPI:
                return new UPIPaymentFactory();
            case PaymentTypeConstants.CARD:
                return new CreditcardPaymentFactory();
            default:
                throw new IllegalArgumentException("Invalid payment type: " + paymentType);
        }
    }
}
