package creational.builderPattern.client;

import java.util.List;

import creational.builderPattern.api.UserQueryBuilder;
import creational.builderPattern.core.User;
import creational.builderPattern.core.UserManager;

/**
 * Driver code.
 * 
 * @author Ashish Wale
 */
public class Client {

    public static void main(String[] args) {
        UserManager.getManager().addUser(new User("Ashish", "Wale", "abc@xyz.com", "Tempe"));
        UserManager.getManager().addUser(new User("Ashish", "Kale", "abcd@xyz.com", "Tempe"));
        UserManager.getManager().addUser(new User("Pranav", "Patil", "abcde@xyz.com", "Tempe"));
        UserManager.getManager().addUser(new User("Samantha", "Bologne", "abcdef@xyz.com", "Tempe"));

        System.out.println("=== Starting search tests ===");
        System.out.println("=== Test 1 ===");
        UserQueryBuilder queryBuilder = new UserQueryBuilder()
                                            .withFirstName("Ashish");

        List<User> users = UserManager.getManager().searchUsers(queryBuilder.build());
        users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
        System.out.println("=== Test 2 ===");
        queryBuilder = new UserQueryBuilder()
                            .withFirstName("Ashish")
                            .withLastName("Wale");
        users = UserManager.getManager().searchUsers(queryBuilder.build());
        users.forEach(user -> System.out.println(user.getFirstName() + " " + user.getLastName()));
        System.out.println("=== Tests Complete ===");
    }

}
