package creational.factoryPattern.product;

/**
 * This interface represents an operator that can perform various operations on a document.
 * 
 * @author Ashish Wale
 */
public interface DocumentOperator {
    /**
     * Opens the document.
     */
    public void open();

    /**
     * Closes the document.
     */
    public void close();

    /**
     * Saves the document.
     */
    public void save();

    /**
     * Reverts the document to its previous state.
     */
    public void revert();
}
