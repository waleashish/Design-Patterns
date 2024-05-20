package creational.abstractFactoryPattern.factory.concrete;

import creational.abstractFactoryPattern.factory.PaymentFactory;
import creational.abstractFactoryPattern.product.PaymentProcessor;
import creational.abstractFactoryPattern.product.PaymentValidator;
import creational.abstractFactoryPattern.product.concrete.CreditCardPaymentProcessor;
import creational.abstractFactoryPattern.product.concrete.CreditCardPaymentValidator;

/**
 * This class represents a concrete implementation of the @PaymentFactory interface. This class is responsible for creating concrete
 * instances of the payment related objects for credit card payments.
 * 
 * @author Ashish Wale
 */
public class CreditcardPaymentFactory implements PaymentFactory {

    /**
        * Returns a new instance of the CreditCardPaymentValidator.
        * 
        * @return CreditCardPaymentValidator instance
        */
    @Override
    public PaymentValidator createPaymentValidator() {
        return new CreditCardPaymentValidator();
    }

    /**
     * Returns a new instance of the CreditCardPaymentProcessor.
     * 
     * @return CreditCardPaymentProcessor instance
     */
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new CreditCardPaymentProcessor();
    }

}
