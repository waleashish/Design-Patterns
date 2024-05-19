package creational.factoryPattern.client;

import creational.factoryPattern.DocumentTypes;
import creational.factoryPattern.factory.DocumentFactory;
import creational.factoryPattern.product.DocumentOperator;

/*
 * Driver code
 * 
 * @author Ashish Wale
 */
public class Client {
    public static void main(String[] args) {
        DocumentOperator pdfDocumentOperator = DocumentFactory.createDocumentOperator(DocumentTypes.PDF);
        pdfDocumentOperator.open();
        pdfDocumentOperator.save();
        pdfDocumentOperator.close();
        pdfDocumentOperator.revert();
        
        DocumentOperator wordDocumentOperator = DocumentFactory.createDocumentOperator(DocumentTypes.WORD);
        wordDocumentOperator.open();
        wordDocumentOperator.save();
        wordDocumentOperator.close();
        wordDocumentOperator.revert();
    }
}
