package creational.builderPattern.core;

/**
 * The User class represents a user entity with basic information such as first name, last name, email, and city.
 * 
 * @author Ashish Wale
 */
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String city;

    /**
     * Constructs a new User object with the specified first name, last name, email, and city.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param email the email address of the user
     * @param city the city of the user
     */
    public User(String firstName, String lastName, String email, String city) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.city = city;
    }
    
    /**
     * Returns the first name of the user.
     *
     * @return the first name of the user
     */
    public String getFirstName() {
        return firstName;
    }
    
    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name of the user
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Returns the last name of the user.
     *
     * @return the last name of the user
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * Sets the last name of the user.
     *
     * @param lastName the last name of the user
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Returns the email address of the user.
     *
     * @return the email address of the user
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Sets the email address of the user.
     *
     * @param email the email address of the user
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the city of the user.
     *
     * @return the city of the user
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the city of the user.
     *
     * @param city the city of the user
     */
    public void setCity(String city) {
        this.city = city;
    }
}
