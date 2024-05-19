package creational.factoryPattern.product.concrete;

import creational.factoryPattern.product.DocumentOperator;

/*
 * This class is a concrete implementation of the DocumentOperator interface specific to Word documents.
 * 
 * @author Ashish Wale
 */
public class WordDocumentOperator implements DocumentOperator{

    @Override
    public void open() {
        System.out.println("Opening Word document");
    }

    @Override
    public void close() {
        System.out.println("Closing Word document");
    }

    @Override
    public void save() {
        System.out.println("Saving Word document");
    }

    @Override
    public void revert() {
        System.out.println("Reverting Word document");
    }

}
