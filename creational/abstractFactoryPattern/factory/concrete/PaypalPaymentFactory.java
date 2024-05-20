package creational.abstractFactoryPattern.factory.concrete;

import creational.abstractFactoryPattern.factory.PaymentFactory;
import creational.abstractFactoryPattern.product.PaymentProcessor;
import creational.abstractFactoryPattern.product.PaymentValidator;
import creational.abstractFactoryPattern.product.concrete.PaypalPaymentProcessor;
import creational.abstractFactoryPattern.product.concrete.PaypalPaymentValidator;

/**
 * A concrete implementation of the @PaymentFactory interface. This class is responsible for creating concrete
 * instances of the payment related objects for Paypal payments.
 * 
 * @author Ashish Wale
 */
public class PaypalPaymentFactory implements PaymentFactory {

    /**
     * Returns a new PaypalPaymentValidator instance.
     *
     * @return PaypalPaymentValidator instance
     */
    @Override
    public PaymentValidator createPaymentValidator() {
        return new PaypalPaymentValidator();
    }

    /**
     * Returns a new PaypalPaymentProcessor instance.
     *
     * @return PaypalPaymentProcessor instance
     */
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new PaypalPaymentProcessor();
    }

}
