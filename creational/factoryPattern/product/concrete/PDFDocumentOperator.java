package creational.factoryPattern.product.concrete;

import creational.factoryPattern.product.DocumentOperator;

/*
 * This class is a concrete implementation of the DocumentOperator interface specific to PDF documents.
 * 
 * @author Ashish Wale
 */
public class PDFDocumentOperator implements DocumentOperator{

    @Override
    public void open() {
        System.out.println("Opening PDF document");
        // PDF document specific implementation
    }

    @Override
    public void close() {
        System.out.println("Closing PDF document");
        // PDF document specific implementation
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document");
        // PDF document specific implementation
    }

    @Override
    public void revert() {
        System.out.println("Reverting PDF document");
        // PDF document specific implementation
    }

}
