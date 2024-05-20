package creational.abstractFactoryPattern.factory.concrete;

import creational.abstractFactoryPattern.factory.PaymentFactory;
import creational.abstractFactoryPattern.product.PaymentProcessor;
import creational.abstractFactoryPattern.product.PaymentValidator;
import creational.abstractFactoryPattern.product.concrete.UPIPaymentProcessor;
import creational.abstractFactoryPattern.product.concrete.UPIPaymentValidator;

/**
 * This class is a concrete implementation of @PaymentFactory. This class is responsible for creating concrete
 * instances of the payment related objects for UPI payments.
 * 
 * @author Ashish Wale
 */
public class UPIPaymentFactory implements PaymentFactory {

    /**
     * Returns a new instance of the UPIPaymentValidator class.
     *
     * @return UPIPaymentValidator instance
     */
    @Override
    public PaymentValidator createPaymentValidator() {
        return new UPIPaymentValidator();
    }

    /**
     * Returns a new instance of the UPIPaymentProcessor class.
     *
     * @return UPIPaymentProcessor instance
     */
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new UPIPaymentProcessor();
    }

}
