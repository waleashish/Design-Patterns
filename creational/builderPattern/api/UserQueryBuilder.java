package creational.builderPattern.api;

import creational.builderPattern.core.UserQuery;

/**
 * The UserQueryBuilder class is a builder class that provides an interface for constructing UserQuery objects.
 * 
 * @author Ashish Wale 
 */
public class UserQueryBuilder {

    private String firstName;
    private String lastName;
    private String email;
    private String city;

    /**
     * Constructs a new UserQueryBuilder object.
     */
    public UserQueryBuilder() {
    }

    /**
     * Sets the first name of the user.
     *
     * @param firstName the first name of the user
     * @return the UserQueryBuilder object
     */
    public UserQueryBuilder withFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    /**
     * Sets the last name of the user.
     *
     * @param lastName the last name of the user
     * @return the UserQueryBuilder object
     */
    public UserQueryBuilder withLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    /**
     * Sets the email of the user.
     *
     * @param email the email of the user
     * @return the UserQueryBuilder object
     */
    public UserQueryBuilder withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * Sets the city of the user.
     *
     * @param city the city of the user
     * @return the UserQueryBuilder object
     */
    public UserQueryBuilder withCity(String city) {
        this.city = city;
        return this;
    }

    /**
     * Builds and returns a new UserQuery object with the set attributes.
     *
     * @return a new UserQuery object
     */
    public UserQuery build() {
        return new UserQuery(firstName, lastName, email, city);
    }
}
