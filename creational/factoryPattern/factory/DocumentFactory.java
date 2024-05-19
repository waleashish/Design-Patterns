package creational.factoryPattern.factory;

import creational.factoryPattern.DocumentTypes;
import creational.factoryPattern.product.DocumentOperator;
import creational.factoryPattern.product.concrete.PDFDocumentOperator;
import creational.factoryPattern.product.concrete.WordDocumentOperator;

/**
 * This class is a factory class that creates DocumentOperator objects based on the document type.
 * 
 * @author Ashish Wale
 */
public class DocumentFactory {    
    /**
     * This method creates a DocumentOperator based on the document type.
     * 
     * @param documentConfig
     *          - The document type
     * @return
     *         - The DocumentOperator object
     */
    public static DocumentOperator createDocumentOperator(String documentConfig) {
        switch (documentConfig) {
            case DocumentTypes.PDF:
                return new PDFDocumentOperator();
            case DocumentTypes.WORD:
                return new WordDocumentOperator();
            default:
                throw new IllegalArgumentException("Invalid document type: " + documentConfig);
        }
    }
}
