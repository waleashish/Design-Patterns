package creational.builderPattern.core;

/**
 * Thslass represents a query object that contains information used to search a user.
 * 
 * @author Ashish Wale
 */
public class UserQuery {
    private String firstName;
    private String lastName;
    private String email;
    private String city;

    /**
     * Constructs a UserQuery object with the specified user information.
     *
     * @param firstName the first name of the user
     * @param lastName the last name of the user
     * @param email the email address of the user
     * @param city the city of the user
     */
    public UserQuery(String firstName, String lastName, String email, String city) {
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
     * Returns the last name of the user.
     *
     * @return the last name of the user
     */
    public String getLastName() {
        return lastName;
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
     * Returns the city of the user.
     *
     * @return the city of the user
     */
    public String getCity() {
        return city;
    }
}
